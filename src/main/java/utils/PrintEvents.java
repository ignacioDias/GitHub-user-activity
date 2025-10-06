package utils;

import github_activity.Event;
import java.util.List;

public class PrintEvents {
    public static void printEvents(List<Event> events) {
        for(Event event : events) {
            switch (event.type()) {
                case "CommitCommentEvent":
                    printCommitCommentEvent(event);
                    break;

                case "CreateEvent":
                    printCreateEvent(event);
                    break;

                case "DeleteEvent":
                    printDeleteEvent(event);
                    break;

                case "ForkEvent":
                    printForkEvent(event);
                    break;

                case "GollumEvent":
                    printGollumEvent(event);
                    break;

                case "IssueCommentEvent":
                    printIssueCommentEvent(event);
                    break;

                case "IssuesEvent":
                    printIssuesEvent(event);
                    break;

                case "MemberEvent":
                    printMemberEvent(event);
                    break;

                case "PublicEvent":
                    printPublicEvent(event);
                    break;

                case "PullRequestEvent":
                    printPullRequestEvent(event);
                    break;

                case "PullRequestReviewEvent":
                    printPullRequestReviewEvent(event);
                    break;

                case "PullRequestReviewCommentEvent":
                    printPullRequestReviewCommentEvent(event);
                    break;

                case "PullRequestReviewThreadEvent":
                    printPullRequestReviewThreadEvent(event);
                    break;

                case "PushEvent":
                    printPushEvent(event);
                    break;

                case "ReleaseEvent":
                    printReleaseEvent(event);
                    break;

                case "SponsorshipEvent":
                    printSponsorshipEvent(event);
                    break;

                case "WatchEvent":
                    printWatchEvent(event);
                    break;
                default:
                    System.out.println("Unknown event type");
                    break;
            }


        }
    }

    private static void printCommitCommentEvent(Event event) {
        String output = "ID: " + event.id() + ". Comentó en un commit del repositorio: " + event.repo().name();
        System.out.println(output);
    }

    private static void printCreateEvent(Event event) {
        String output = "ID: " + event.id() + ". Creó algo nuevo (rama, tag o repo) en: " + event.repo().name();
        System.out.println(output);
    }

    private static void printDeleteEvent(Event event) {
        String output = "ID: " + event.id() + ". Eliminó una rama o tag en: " + event.repo().name();
        System.out.println(output);
    }

    private static void printForkEvent(Event event) {
        String output = "ID: " + event.id() + ". Forkeó el repositorio: " + event.repo().name();
        System.out.println(output);
    }

    private static void printGollumEvent(Event event) {
        String output = "ID: " + event.id() + ". Actualizó la wiki del repositorio: " + event.repo().name();
        System.out.println(output);
    }

    private static void printIssueCommentEvent(Event event) {
        String output = "ID: " + event.id() + ". Comentó en un issue del repositorio: " + event.repo().name();
        System.out.println(output);
    }

    private static void printIssuesEvent(Event event) {
        String action = (event.payload() != null && event.payload().action() != null)
                ? event.payload().action()
                : "realizó una acción sobre un issue";
        String output = "ID: " + event.id() + ". " + action + " en un issue del repositorio: " + event.repo().name();
        System.out.println(output);
    }

    private static void printMemberEvent(Event event) {
        String output = "ID: " + event.id() + ". Modificó los miembros del repositorio: " + event.repo().name();
        System.out.println(output);
    }

    private static void printPublicEvent(Event event) {
        String output = "ID: " + event.id() + ". Hizo público al repositorio: " + event.repo().name();
        System.out.println(output);
    }

    private static void printPullRequestEvent(Event event) {
        String action = (event.payload() != null && event.payload().action() != null)
                ? event.payload().action()
                : "realizó una acción";
        String output = "ID: " + event.id() + ". " + action + " un Pull Request en: " + event.repo().name();
        System.out.println(output);
    }

    private static void printPullRequestReviewEvent(Event event) {
        String output = "ID: " + event.id() + ". Revisó un Pull Request en: " + event.repo().name();
        System.out.println(output);
    }

    private static void printPullRequestReviewCommentEvent(Event event) {
        String output = "ID: " + event.id() + ". Comentó en un Pull Request del repositorio: " + event.repo().name();
        System.out.println(output);
    }

    private static void printPullRequestReviewThreadEvent(Event event) {
        String output = "ID: " + event.id() + ". Interactuó con un hilo de revisión de Pull Request en: " + event.repo().name();
        System.out.println(output);
    }

    private static void printPushEvent(Event event) {
        int commits = (event.payload() != null && event.payload().commits() != null)
                ? event.payload().commits().size()
                : 0;
        String output = "ID: " + event.id() + ". Pusheó " + commits + " commit(s) al repositorio: " + event.repo().name();
        System.out.println(output);
    }

    private static void printReleaseEvent(Event event) {
        String output = "ID: " + event.id() + ". Publicó o modificó un release en: " + event.repo().name();
        System.out.println(output);
    }

    private static void printSponsorshipEvent(Event event) {
        String output = "ID: " + event.id() + ". Inició o modificó un patrocinio en GitHub Sponsors.";
        System.out.println(output);
    }

    private static void printWatchEvent(Event event) {
        String output = "ID: " + event.id() + ". Dio una estrella (★) al repositorio: " + event.repo().name();
        System.out.println(output);
    }

}
