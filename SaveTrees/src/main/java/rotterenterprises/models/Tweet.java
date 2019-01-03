package rotterenterprises.models;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class Tweet {
    private String message;

    private Twitter twitter;

    public Tweet(String message) {
       // this.message = message;
        configTwitter();
    }

    public void tweetMessage() {
        try {
            Status status = twitter.updateStatus("Its working! That was alot of work!");
        } catch (TwitterException e) {
            e.printStackTrace();
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {

        return message;
    }

    private void configTwitter() {

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("YBT5s3Ciwr6RY6r6OtwUDfHfY")
                .setOAuthConsumerSecret("rPjEYfwu4YsXDKVqAvDZw7hbrlRQxTCRC7TxOKCVR1ysHnClue")
                .setOAuthAccessToken("1062394048558829568-5rKK0zITAnpu5sLpMcNbocpNXhhmHR")
                .setOAuthAccessTokenSecret("pR0vj9VnM17vhs26hmrDwdnYdquS5Dfhj9enG8Eje4VBJ");

        TwitterFactory tf = new TwitterFactory(cb.build());
        twitter = tf.getInstance();
    }
}
