package miniproject1.mongoDb

import groovy.json.JsonSlurper

class BulkTransfer {
	static void main(String... args) {

		MongoDB mongo = new MongoDB()
		JsonSlurper slurper = new JsonSlurper()
		def friends = slurper.parseText(new File('./src/main/resources/twitter/friends.json').text)
		def followers = slurper.parseText(new File('./src/main/resources/twitter/followers.json').text)
		def tweets = slurper.parseText(new File('./src/main/resources/twitter/tweets.json').text)
		
		mongo.initDb()
		
		// tag::exercise[]
		
		// TODO Exercise 1
		
		println 'databasde: ' + mongo.db.getName()
		mongo.db.getCollectionNames().each{ println it }
		
		friends.users.forEach{ freind ->
			def tweet = tweets.find{ tweet ->
				tweet.user.id==freind.id
			}
			mongo.db.Friends << [	id: "$freind.id_str",
									name: "$freind.name",
									description: "$freind.description",
									favorites_count: "$freind.favourites_count",
									followers_count: "$freind.followers_count",
									friends_count: "$freind.friends_count",
									language: "$freind.lang",
									location: "$freind.location",
									screen_name: "$freind.screen_name",
									url: "$freind.url",
									utc_offset: "$freind.utc_offset",
									tweets: [
												id_str: "$tweet.id_str",
												created_at: "$tweet.created_at",
												entities: "$tweet.entities",
												favorite_count: "$tweet.favourites_count",
											    favorited: "$tweet.favorited",
											    uid_str: "$tweet.user.id_str",
											    in_reply_to_screen_name: "$tweet.in_reply_to_screen_name",
											    in_reply_to_status_id: "$tweet.in_reply_to_status_id",
											    in_reply_to_user_id: "$tweet.in_reply_to_user_id",
											    language_code: "$tweet.lang",
											    retweet_count: "$tweet.retweet_count",
											    retweeted: "$tweet.retweeted",
											    source: "$tweet.source",
											    text: "$tweet.text"
											]
								]
		}
		
		
		followers.users.forEach{ follower ->
			def tweet = tweets.find{ tweet ->
				(tweet.user != null) && (tweet.user.id == follower.id)
			}
			mongo.db.Followers << [	id: "$follower.id_str",
									name: "$follower.name",
									description: "$follower.description",
									favorites_count: "$follower.favourites_count",
									followers_count: "$follower.followers_count",
									friends_count: "$follower.friends_count",
									language: "$follower.lang",
									location: "$follower.location",
									screen_name: "$follower.screen_name",
									url: "$follower.url",
									utc_offset: "$follower.utc_offset",
									tweets: [
												id_str: "$tweet.id_str",
												created_at: "$tweet.created_at",
												entities: "$tweet.entities",
												favorite_count: "$tweet.favourites_count",
												favorited: "$tweet.favorited",
												uid_str: "$tweet.user.id_str",
												in_reply_to_screen_name: "$tweet.in_reply_to_screen_name",
												in_reply_to_status_id: "$tweet.in_reply_to_status_id",
												in_reply_to_user_id: "$tweet.in_reply_to_user_id",
												language_code: "$tweet.lang",
												retweet_count: "$tweet.retweet_count",
												retweeted: "$tweet.retweeted",
												source: "$tweet.source",
												text: "$tweet.text"
											]
								]
		}
		
		
		
		//end::exercise[]
	}
}

