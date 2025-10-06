package utils;

import github_activity.Event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class APIMethods {
    List<Event> events;
    public static HttpURLConnection generateConnectionWithGitHubAPI(String username) {
        try {
            URL url = new URL("https://api.github.com/users/" + username + "/events");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            System.out.println("GET Response Code :: " + responseCode);

            return connection;

        } catch(Exception e) {
            e.printStackTrace();
        }
        throw new IllegalStateException("ERROR");
    }
    public static String generateJSON(HttpURLConnection connection) {
        try {
            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = reader.readLine()) != null) {
                    response.append(inputLine);
                }
                reader.close();
                return response.toString();
            } else {
                throw new IOException("ERROR: HTTP Status Code :: " + responseCode);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        throw new IllegalStateException("ERROR");
    }

}
