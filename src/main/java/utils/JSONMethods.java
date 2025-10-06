package utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import github_activity.Event;

import java.util.List;

public class JSONMethods {
    static Gson gson = new Gson();
    public static List<Event> generateListOfEventsWithJSON(String json) {
        return gson.fromJson(json, new TypeToken<List<Event>>(){}.getType());
    }
}
