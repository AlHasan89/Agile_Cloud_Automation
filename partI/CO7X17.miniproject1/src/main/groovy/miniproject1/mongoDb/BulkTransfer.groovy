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
		
		//mongo.db.Friends.find('tweet.entities.user_mentions.screen_name': "martinfowler").each{ println it }
		
		
		
		/*
		friends.users.forEach{ freind ->
			def tweet = tweets.findAll({ tweet ->
				(tweet.user != null) && (tweet.user.id == freind.id)
			})
			
			for (t in tweet) {
				
					def EE = "["
					
							if (t.entities.hashtags.size() == 0) {
								EE = EE + "hashtags" +":"+ " []"
							}
							else if (t.entities.hashtags.size() == 1) {
								EE = EE + "hashtags" +":"+ " [" + t.entities.hashtags + "]"
							}
							else {
								def P = 0
								EE = EE + "hashtags" +": ["
								for (h in t.entities.hashtags)
								{
										if (P == 0) {
										EE = EE + h
										P++
										}
										else {
											EE = EE + ',' + h
										}
								}
								EE = EE + "]"
							}
							if (t.entities.symbols.size() == 0) {
								EE = EE + "symbols" +":"+ " []"
							}
							else if (t.entities.symbols.size() == 1) {
								EE = EE + "symbols" +":"+ " [" + t.entities.symbols + "]"
							}
							else {
								def Q = 0
								EE = EE + "symbols" +": ["
								for (h in t.entities.symbols)
								{
										if (Q == 0) {
										EE = EE + h
										Q++
										}
										else {
											EE = EE + ',' + h
										}
								}
								EE = EE + "]"
							}
							if (t.entities.user_mentions.size() == 0) {
								EE = EE + "user_mentions" +":"+ " []"
							}
							else if (t.entities.user_mentions.size() == 1) {
								EE = EE + "user_mentions" +":"+ " [" + t.entities.user_mentions + "]"
							}
							else {
								def N = 0
								EE = EE + "user_mentions" +": ["
								for (h in t.entities.user_mentions)
								{
										if (N == 0) {
										EE = EE + h
										N++
										}
										else {
											EE = EE + ',' + h
										}
								}
								EE = EE + "]"
							}
							if (t.entities.urls.size() == 0) {
								EE = EE + "hashtags" +":"+ " []"
							}
							else if (t.entities.urls.size() == 1) {
								EE = EE + "urls" +":"+ " [" + t.entities.urls + "]"
							}
							else {
								def L = 0
								EE = EE + "urls" +": ["
								for (h in t.entities.urls)
								{
										if (L == 0) {
										EE = EE + h
										L++
										}
										else {
											EE = EE + ',' + h
										}
								}
								EE = EE + "]"
							}
					
					EE = EE + "]"
						
						def builder = new groovy.json.JsonBuilder(EE)
						def jsonStr = builder.toString()
						def parserop = new JsonSlurper()
						def doct = parserop.parseText(jsonStr)
							println doct
		}
		}
		*/
		
		
		
		friends.users.forEach{ freind ->
			def tweet = tweets.findAll({ tweet ->
				(tweet.user != null) && (tweet.user.id == freind.id)
			})
			def TW = "["
			def i = 0
			for (t in tweet) {
					def source = t.source.replaceAll (/\"/,/\\\"/)
					def txt = t.text.replaceAll (/\"/,/\\\"/)
					
							def E = """
							{
							"hashtags": "$t.entities.hashtags"
							"symbols": "$t.entities.symbols"
							"user_mentions": "$t.entities.user_mentions"
							"urls": "$t.entities.urls"
							}
							"""	
							def T = """ 
								{
								"id_str": "$t.id_str",
								"created_at": "$t.created_at",
								"entities": $E,
								"favorite_count": "$t.favourites_count",
								"favorited": "$t.favorited",
								"uid_str": "$t.user.id_str",
								"in_reply_to_screen_name": "$t.in_reply_to_screen_name",
								"in_reply_to_status_id": "$t.in_reply_to_status_id",
								"in_reply_to_user_id": "$t.in_reply_to_user_id",
								"language_code": "$t.lang",
								"retweet_count": "$t.retweet_count",
								"retweeted": "$t.retweeted",
								"source": "$source",
								"text": "$txt"
								}
								"""
					if (i == 0) {
						TW = TW + T
						i++
						}
				
					else {
						TW = TW + ',' + T
						i++
						}
					}
				TW = TW + ']'
				def parser = new JsonSlurper()
				def doc = parser.parseText(TW)
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
									tweet: doc
								]
		}
		
	
		/*
		friends.users.forEach{ freind ->
			def tweet = tweets.findAll({ tweet ->
				(tweet.user != null) && (tweet.user.id == freind.id)
			})
			def TW = "["
			def i = 0
			for (t in tweet) {
				if (i == 0) {
					def source = t.source.replaceAll (/\"/,/\\\"/)
					def txt = t.text.replaceAll (/\"/,/\\\"/)
							def T = """ 
								{
								"id_str": "$t.id_str",
								"created_at": "$t.created_at",
								"entities": "$t.entities",
								"favorite_count": "$t.favourites_count",
								"favorited": "$t.favorited",
								"uid_str": "$t.user.id_str",
								"in_reply_to_screen_name": "$t.in_reply_to_screen_name",
								"in_reply_to_status_id": "$t.in_reply_to_status_id",
								"in_reply_to_user_id": "$t.in_reply_to_user_id",
								"language_code": "$t.lang",
								"retweet_count": "$t.retweet_count",
								"retweeted": "$t.retweeted",
								"source": "$source",
								"text": "$txt"
								}
								"""
							TW = TW + T
							i++
							}
				
					else {
						def source = t.source.replaceAll (/\"/,/\\\"/)
						def txt = t.text.replaceAll (/\"/,/\\\"/)
						def T = """ 
						{
						"id_str": "$t.id_str",
						"created_at": "$t.created_at",
						"entities": "$t.entities",
						"favorite_count": "$t.favourites_count",
						"favorited": "$t.favorited",
						"uid_str": "$t.user.id_str",
						"in_reply_to_screen_name": "$t.in_reply_to_screen_name",
						"in_reply_to_status_id": "$t.in_reply_to_status_id",
						"in_reply_to_user_id": "$t.in_reply_to_user_id",
						"language_code": "$t.lang",
						"retweet_count": "$t.retweet_count",
						"retweeted": "$t.retweeted",
						"source": "$source",
						"text": "$txt"
						}
						"""
						TW = TW + ',' + T
						i++
						}
					}
				TW = TW + ']'
				def parser = new JsonSlurper()
				def doc = parser.parseText(TW)
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
									tweet: doc
								]
		}
		
		/*
		followers.users.forEach{ follower ->
			def tweet = tweets.findAll({ tweet ->
				(tweet.user != null) && (tweet.user.id == follower.id)
			})
			def TW = []
			for (t in tweet) {
				def T = [
						id_str: "$t.id_str",
						created_at: "$t.created_at",
						entities: "$t.entities",
						favorite_count: "$t.favourites_count",
						favorited: "$t.favorited",
						uid_str: "$t.user.id_str",
						in_reply_to_screen_name: "$t.in_reply_to_screen_name",
						in_reply_to_status_id: "$t.in_reply_to_status_id",
						in_reply_to_user_id: "$t.in_reply_to_user_id",
						language_code: "$t.lang",
						retweet_count: "$t.retweet_count",
						retweeted: "$t.retweeted",
						source: "$t.source",
						text: "$t.text"
						]
				TW << T
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
									tweet: "$TW"
								]
		}
		
		*/
		
		//end::exercise[]
	}
}
