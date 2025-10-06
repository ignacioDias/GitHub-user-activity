package github_activity;
import com.google.gson.annotations.SerializedName;

public record Event(
        Long id,
        String type,
        Actor actor,
        Repo repo,
        Payload payload,
        @SerializedName("public") String isPublic,
        String created_at,
        Org org
) {}
