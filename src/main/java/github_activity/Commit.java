package github_activity;

public record Commit(
        String sha,
        Author author,
        String message,
        Boolean distinct,
        String url
) {}
