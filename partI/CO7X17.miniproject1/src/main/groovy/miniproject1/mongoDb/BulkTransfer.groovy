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
		
		friends.users.forEach{ freind ->
			def tweet = tweets.findAll({ tweet ->
				(tweet.user != null) && (tweet.user.id == freind.id)
			})
			def TW = "["
			def i = 0
			for (t in tweet) {
					def source = t.source.replaceAll (/\"/,/\\\"/)
					def txt = t.text.replaceAll (/\"/,/\\\"/)
					
							def OO = "["
							if (t.entities.hashtags.size() == 0)
							OO = "[]"
							else if (t.entities.hashtags.size() == 1){
								for (mn in t.entities.hashtags){
								OO = """
										 {
											"text": "$mn.text",
											"indices": "$mn.indices"
											}
										 """
								}
							}
							else{
								def mni = 0
								for (mn in t.entities.hashtags){
									def OOmn = """
										 {
											"text": "$mn.text",
											"indices": "$mn.indices"
											}
										 """
									if (mni == 0) {
										OO = OO + OOmn
										mni++
										}
								
									else {
										OO = OO + ',' + OOmn
										mni++
										}
									}
								OO = OO + "]"
								}
							
			
							def OOs = "["
							if (t.entities.user_mentions.size() == 0)
							OOs = "[]"
							else if (t.entities.user_mentions.size() == 1){
								for (mns in t.entities.user_mentions){
								OOs = """
														 {
															"screen_name": "$mns.screen_name",
															"name": "$mns.name",
															"id": "$mns.id",
															"id_str": "$mns.id_str",
															"indices": "$mns.indices"
															}
														 """
								}
							}
							else{
								def mnis = 0
								for (mns in t.entities.user_mentions){
									def OOmns = """
														 {
															"screen_name": "$mns.screen_name",
															"name": "$mns.name",
															"id": "$mns.id",
															"id_str": "$mns.id_str",
															"indices": "$mns.indices"
															}
														 """
									if (mnis == 0) {
										OOs = OOs + OOmns
										mnis++
										}
								
									else {
										OOs = OOs + ',' + OOmns
										mnis++
										}
									}
								OOs = OOs + "]"
								}
							
		
							def OOsq = "["
							if (t.entities.urls.size() == 0)
							OOsq = "[]"
							else if (t.entities.urls.size() == 1){
								for (mnsq in t.entities.urls){
								OOsq = """
														 {
															"url": "$mnsq.url",
															"expanded_url": "$mnsq.expanded_url",
															"display_url": "$mnsq.display_url",
															"indices": "$mnsq.indices"
															}
														 """
								}
							}
							else{
								def mnisq = 0
								for (mnsq in t.entities.urls){
									def OOmnsq = """
														 {
															"url": "$mnsq.url",
															"expanded_url": "$mnsq.expanded_url",
															"display_url": "$mnsq.display_url",
															"indices": "$mnsq.indices"
															}
														 """
									if (mnisq == 0) {
										OOsq = OOsq + OOmnsq
										mnisq++
										}
								
									else {
										OOsq = OOsq + ',' + OOmnsq
										mnisq++
										}
									}
								OOsq = OOsq + "]"
								}
		
							def E = """
							{
							"hashtags": $OO ,
							"user_mentions": $OOs ,
							"urls": $OOsq
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
				
								def Frd = """
									[
									{
									"id": "$freind.id_str",
									"name": "$freind.name",
									"description": "$freind.description",
									"favorites_count": "$freind.favourites_count",
									"followers_count": "$freind.followers_count",
									"friends_count": "$freind.friends_count",
									"language": "$freind.lang",
									"location": "$freind.location",
									"screen_name": "$freind.screen_name",
									"url": "$freind.url",
									"utc_offset": "$freind.utc_offset",
									"tweets": $TW
									}
									]
									"""
							
									def parserop = new JsonSlurper()
									def doct = parserop.parseText(Frd)
				
				mongo.db.Friends << doct
		}
		
		
		
		followers.users.forEach{ follower ->
			def tweet = tweets.findAll({ tweet ->
				(tweet.user != null) && (tweet.user.id == follower.id)
			})
			def TW = "["
			def i = 0
			for (t in tweet) {
					def source = t.source.replaceAll (/\"/,/\\\"/)
					def txt = t.text.replaceAll (/\"/,/\\\"/)
					
							def OO = "["
							if (t.entities.hashtags.size() == 0)
							OO = "[]"
							else if (t.entities.hashtags.size() == 1){
								for (mn in t.entities.hashtags){
								OO = """
										 {
											"text": "$mn.text",
											"indices": "$mn.indices"
											}
										 """
								}
							}
							else{
								def mni = 0
								for (mn in t.entities.hashtags){
									def OOmn = """
										 {
											"text": "$mn.text",
											"indices": "$mn.indices"
											}
										 """
									if (mni == 0) {
										OO = OO + OOmn
										mni++
										}
								
									else {
										OO = OO + ',' + OOmn
										mni++
										}
									}
								OO = OO + "]"
								}
							
			
							def OOs = "["
							if (t.entities.user_mentions.size() == 0)
							OOs = "[]"
							else if (t.entities.user_mentions.size() == 1){
								for (mns in t.entities.user_mentions){
								OOs = """
														 {
															"screen_name": "$mns.screen_name",
															"name": "$mns.name",
															"id": "$mns.id",
															"id_str": "$mns.id_str",
															"indices": "$mns.indices"
															}
														 """
								}
							}
							else{
								def mnis = 0
								for (mns in t.entities.user_mentions){
									def OOmns = """
														 {
															"screen_name": "$mns.screen_name",
															"name": "$mns.name",
															"id": "$mns.id",
															"id_str": "$mns.id_str",
															"indices": "$mns.indices"
															}
														 """
									if (mnis == 0) {
										OOs = OOs + OOmns
										mnis++
										}
								
									else {
										OOs = OOs + ',' + OOmns
										mnis++
										}
									}
								OOs = OOs + "]"
								}
							
		
							def OOsq = "["
							if (t.entities.urls.size() == 0)
							OOsq = "[]"
							else if (t.entities.urls.size() == 1){
								for (mnsq in t.entities.urls){
								OOsq = """
														 {
															"url": "$mnsq.url",
															"expanded_url": "$mnsq.expanded_url",
															"display_url": "$mnsq.display_url",
															"indices": "$mnsq.indices"
															}
														 """
								}
							}
							else{
								def mnisq = 0
								for (mnsq in t.entities.urls){
									def OOmnsq = """
														 {
															"url": "$mnsq.url",
															"expanded_url": "$mnsq.expanded_url",
															"display_url": "$mnsq.display_url",
															"indices": "$mnsq.indices"
															}
														 """
									if (mnisq == 0) {
										OOsq = OOsq + OOmnsq
										mnisq++
										}
								
									else {
										OOsq = OOsq + ',' + OOmnsq
										mnisq++
										}
									}
								OOsq = OOsq + "]"
								}
		
							def E = """
							{
							"hashtags": $OO ,
							"user_mentions": $OOs ,
							"urls": $OOsq
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
				
								def Frd = """
									[
									{
									"id": "$follower.id_str",
									"name": "$follower.name",
									"description": "$follower.description",
									"favorites_count": "$follower.favourites_count",
									"followers_count": "$follower.followers_count",
									"friends_count": "$follower.friends_count",
									"language": "$follower.lang",
									"location": "$follower.location",
									"screen_name": "$follower.screen_name",
									"url": "$follower.url",
									"utc_offset": "$follower.utc_offset",
									"tweets": $TW
									}
									]
									"""
							
									def parserop = new JsonSlurper()
									def doct = parserop.parseText(Frd)
				
									
									println doct
				mongo.db.Followers << doct
		}
	
		//end::exercise[]
		  
	}
}
