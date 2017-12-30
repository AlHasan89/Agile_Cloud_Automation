import com.gmongo.GMongo
import com.mongodb.DBCursor
import com.mongodb.MongoURI

import miniproject2.mongoDb.Credentials

// EDIT THE FOLLOWING PARAMETERS
def USERNAME = Credentials.USERNAME
def PWD = Credentials.PWD
def HOST = Credentials.HOST
def PORT = Credentials.PORT
def DATABASE = Credentials.DATABASE


// MAKING THE CONNECTION
def connectionString = new MongoURI("mongodb://${USERNAME}:${PWD}@${HOST}:${PORT}/${DATABASE}")
def mongo = new GMongo(connectionString)

def db = mongo.getDB(DATABASE)

def followers = db.followers.find()
def result = '['
followers.each{
	
	def result2 = ''
	if ((it.containsKey("tweets")) && (it.tweets)) {
		it.tweets.each{
		def result3 = ''	
			if ((it.containsKey("entities")) && (it.entities)) {
				result3 = ''		
				
if ((it.entities.containsKey("hashtags")) && (it.entities.hashtags)) {
	result3 += """
	 \"hashtags\": [
	"""
		def result4 = ''
		it.entities.hashtags.each{
			result4 = ''	
				if (it.containsKey("text") && (it.text)) {
					result4 += """${groovy.json.JsonOutput.toJson(it.text)}"""
						if (result4 != '') {
							result3 += """
				 						        {
				 						          \"text\": $result4
				 						        },"""
						}
				}
		}
	result3 = result3 - ~/,$/
	result3 += """
	]"""		 
					 	
					 	if (result3 != '') {
					 		result2 += """
					 	    {
					 	      \"entities\": {
					 	        $result3
					 	      }
					 	    },"""
					 	}			
					}
			 	}
			 }
		}
		result2 = result2 - ~/,$/
		
			if (result2 != '') {
				result += """
		{
		  \"tweets\": [
			$result2
		  ]
		},"""
			}
		}
		 	 	
result = result - ~/,$/
result += ']'
println result 
