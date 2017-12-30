package miniproject2.mongoDb

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
		friends.users.each{ friend ->
			def userTweets = tweets.findAll({ tweet ->
				(tweet.user != null) && (tweet.user.id == friend.id)
			})
			mongo.persistFriend(friend, userTweets)
		}
		
		followers.users.each{ follower ->
			def userTweets = tweets.findAll({ tweet ->
				(tweet.user != null) && (tweet.user.id == follower.id)
			})
			mongo.persistFollower(follower, userTweets)
		}
		//end::exercise[]
	}
}

