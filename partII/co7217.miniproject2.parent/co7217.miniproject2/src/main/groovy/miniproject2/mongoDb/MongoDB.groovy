package miniproject2.mongoDb

import com.gmongo.GMongo
import com.mongodb.DB
import com.mongodb.MongoURI

class MongoDB {

	// EDIT THE FOLLOWING PARAMETERS
	def USERNAME = Credentials.USERNAME
	def PWD = Credentials.PWD
	def HOST = Credentials.HOST
	def PORT = Credentials.PORT
	def DATABASE = Credentials.DATABASE
	
	public DB db
	
	// MAKING THE CONNECTION
	public MongoDB() {
		def connectionString = new MongoURI("mongodb://${USERNAME}:${PWD}@${HOST}:${PORT}/${DATABASE}")
		def mongo = new GMongo(connectionString)
		db = mongo.getDB(DATABASE)
	}
	
	def connectionOk() {
		def DESC = 'testing the connection'
		db.test.remove([:])
		db.test << [id: 0, task: DESC]
		def item = db.test.findOne(id: 0)
		db.test.remove([:])
		
		return (item.task == DESC)
	}
	
	def initDb() {
		db.friends.remove([:])
		db.followers.remove([:])
	}
	
	def private extractTwitterProfile(tp, tweets) {
		[
			id: tp.id_str,
			name: tp.name,
			description: tp.description,
			favoritesCount: tp.favorites_count,
			followersCount: tp.followers_count,
			friendsCount: tp.friends_count,
			language: tp.language,
			location: tp.location,
			screenName: tp.screen_name,
			url: tp.url,
			utcOffset: tp.utc_offset,
			tweets: extractTweets(tweets)
		]
	}
	
	def private extractTweets(list) {
		def tweets = []
		for (t in list) {
			tweets << [
 	            id: t.id_str,
				createdAt: t.created_at,
				entities: t.entities, 
				favoriteCount: t.favorite_count,
				favorited: t.favorited,
				fromUserId: t.user.id_str,
				inReplyToScreenName: t.in_reply_to_screen_name,
				inReplyToStatusId: t.in_reply_to_status_id,
				inReplyToUserId: t.in_reply_to_user_id,
				languageCode: t.language_code,
				retweetCount: t.retweet_count,
				retweeted: t.retweeted,
				source: t.source,
				text: t.text,
				user: t.user
			]
		}
		tweets
	}
	
	def public persistFriend(friend, tweets) {
		db.friends << extractTwitterProfile(friend,tweets)
		println 'FRIENDS'
		println extractTwitterProfile(friend,tweets)
	}

	def public persistFollower(friend, tweets) {
		db.followers << extractTwitterProfile(friend, tweets)
		println 'FOLLOWERS'
		println extractTwitterProfile(friend, tweets)
	}
	
}
