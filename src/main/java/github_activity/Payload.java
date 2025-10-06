package github_activity;
import java.util.List;

public record Payload(
        String action,
        String repository_id,
        Long push_id,
        Long size,
        Long distinct_size,
        String ref,
        String head,
        String before,
        List<Commit> commits
) {}

