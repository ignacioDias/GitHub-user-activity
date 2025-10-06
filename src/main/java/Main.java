import github_activity.Event;
import utils.APIMethods;
import utils.JSONMethods;
import utils.PrintEvents;

import java.net.HttpURLConnection;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        if(args.length != 1)
            throw new IllegalArgumentException("You have to pass the GitHub username");
        HttpURLConnection connectionWithGitHubAPI = APIMethods.generateConnectionWithGitHubAPI(args[0]);
        String JSON = APIMethods.generateJSON(connectionWithGitHubAPI);
        List<Event> events = JSONMethods.generateListOfEventsWithJSON(JSON);
        PrintEvents.printEvents(events);
    }
}
