package github_activity;

public record Actor(
   Long id,
   String login,
   String display_login,
   String gravatar_id,
   String url,
   String avatar_url
) {}
