package miniproject1.reports;

import com.mongodb.DBCollection
import java.util.List
import miniproject1.mongoDb.MongoDB
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {

	def mongo = new MongoDB()
	
	@RequestMapping
	public String index(Model model) {
		
		def connectionStatus = 'PENDING'
		if (mongo.connectionOk()) {
			connectionStatus = 'CONNECTED'
		}
		
		model.addAttribute('connectionStatus', connectionStatus)
		return "main"
		
	}
	
	@RequestMapping(value="followers", method=RequestMethod.GET)
	public String followers(Model model) {
		def followedFollowers = []
		
		// tag::exercise[]
		
		// TODO Exercise 2
		
		followedFollowers = mongo.db.Followers.find('tweets.entities.user_mentions.screen_name': "martinfowler")
		
		//end::exercise[]
		
		model.addAttribute("followers", followedFollowers);
		return "followers";
	}
	
	
	
	@RequestMapping(value="friends",method=RequestMethod.GET)
    public String friends(Model model) {
		List<FriendDto> friends = new ArrayList<FriendDto>()
		def slurper = new groovy.json.JsonSlurper()
		// tag::exercise[]
		
		// TODO Exercise 3
		
		mongo.db.Friends.find().each{ friend ->
			FriendDto dto = new FriendDto()
			dto.name=friend.name
			dto.description=friend.description
			dto.noTweets = friend.tweets.size()
			
			dto.noRetweets = 0
			friend.tweets.find(){ tweet ->
				int x = tweet.retweet_count.toInteger()
				dto.noRetweets += x
				if (x >= 100)
					dto.noActiveTweets++
			}
			friends.add(dto)
		}
		
		//end::exercise[]
		
        model.addAttribute("friends", friends);
        return "friends";
    }

	
}
