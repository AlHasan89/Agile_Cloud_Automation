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
		def result3 = ''
		def result4 = ''
		def result5 = ''
		it.tweets.each{
			result2 += """
 				 {"""
result3 = ''
if (it.containsKey("text") && (it.text)) {
	result3 += """${groovy.json.JsonOutput.toJson(it.text)}"""
	if (result3 != '') {
		result2 += """
	 	    								\"text\": $result3,"""
	}
}
		 						
		 						
result4 = ''
if ((it.containsKey("user")) && (it.user)) {
	if (it.user.containsKey("name") && (it.user.name)) {
		result4 += """${groovy.json.JsonOutput.toJson(it.user.name)}"""
			if (result4 != '') {
				result2 += """
								    				\"user\" : {
								      			\"name\": $result4
								   				 }"""
			}
	}
}
				result2 += """
				  },"""
						}
					}
					
					if (result2 != '') {
						result2 = result2 - ~/,$/
						result += """
				{
				  \"tweets\" : [ 
					$result2
				  ]
				},"""
					}
				}
			
followers.each{
	def result2 = ''
	if ((it.containsKey("tweets")) && (it.tweets)) {
		def result3 = ''
		def result4 = ''
		def result5 = ''
		it.tweets.each{
			result2 += """
 				 {"""
result3 = ''
if (it.containsKey("text") && (it.text)) {
	result3 += """${groovy.json.JsonOutput.toJson(it.text)}"""
	if (result3 != '') {
		result2 += """
	 	    								\"text\": $result3,"""
	}
}
		 						
		 						
result4 = ''
if ((it.containsKey("user")) && (it.user)) {
	if (it.user.containsKey("name") && (it.user.name)) {
		result4 += """${groovy.json.JsonOutput.toJson(it.user.name)}"""
			if (result4 != '') {
				result2 += """
								    				\"user\" : {
								      			\"name\": $result4
								   				 }"""
			}
	}
}
				result2 += """
				  },"""
						}
					}
					
					if (result2 != '') {
						result2 = result2 - ~/,$/
						result += """
				{
				  \"tweets\" : [ 
					$result2
				  ]
				},"""
					}
				}
			
		 	 	
result = result - ~/,$/
result += ']'
println result 
