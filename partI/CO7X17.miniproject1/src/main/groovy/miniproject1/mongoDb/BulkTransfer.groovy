package miniproject1.mongoDb

import groovy.json.JsonSlurper

class BulkTransfer {
	static void main(String... args) {

		MongoDB mongo = new MongoDB()
		JsonSlurper slurper = new JsonSlurper()
		def friends = slurper.parseText(new File('src/main/resources/twitter/friends.json').text)
		def followers = slurper.parseText(new File('src/main/resources/twitter/followers.json').text)
		def tweets = slurper.parseText(new File('src/main/resources/twitter/tweets.json').text)
		
		mongo.initDb()
		
		// tag::exercise[]
		
		println 'database: ' + mongo.db.getName()
		mongo.db.getCollectionNames().each{ println it }
		
		// TODO Exercise 1
		followers.users.forEach{ follower ->
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
									utc_offset: "$follower.utc_offset"
								]
		}
		

		//end::exercise[]
	}
}

