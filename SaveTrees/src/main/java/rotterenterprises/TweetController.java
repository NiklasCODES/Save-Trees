package rotterenterprises;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import rotterenterprises.forms.PersonForm;
import rotterenterprises.forms.TweetForm;
import rotterenterprises.models.Person;
import rotterenterprises.models.Tweet;

@Controller
public class TweetController {

    @Value("${error.message}")
    private String errorMessage;

   /* @RequestMapping( value = {"/sendTweet"}, method = RequestMethod.GET)
    public String index(Model model) {

        //model.addAttribute("message", message);

        return "sendTweet";
    } */

    @RequestMapping(value = { "/sendTweet" }, method = RequestMethod.GET)
    public String sendThis(Model model, //
                             @ModelAttribute("tweetForm") TweetForm tweetForm) {

        String tweet = tweetForm.getMessage();
        //String lastName = personForm.getLastName();


        Tweet newTweet = new Tweet(tweet);
        newTweet.tweetMessage();
        return "redirect:/tweetSent";
    }

    @RequestMapping(value = { "/tweetSent" }, method = RequestMethod.GET)
    public String sendIt(Model model) {
        return "tweetSent";
    }

}
