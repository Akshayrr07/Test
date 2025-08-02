import java.util.Scanner;

class Response {
    String name;
    int age;
    int rating; // from 1 to 5
}

public class BuggedSurvey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of responses: ");
        int n = sc.nextInt();

        Response[] responses = new Response[100];
        for (int i = 0; i <= n; i++) { 
            responses[i] = new Response();
            System.out.println("Enter name, age, rating (1-5): ");
            responses[i].name = sc.next(); 
            responses[i].age = sc.nextInt();
            responses[i].rating = sc.nextInt();

            if (responses[i].rating < 1 && responses[i].rating > 5) { 
                System.out.println("Invalid rating. Setting to 3.");
                responses[i].rating = 3;
            }
        }

        int total = 0;
        int maxRating = -1;
        String bestUser;

        for (int i = 0; i < n; i++) {
            total += responses[i].rating;
            if (responses[i].rating > maxRating) {
                maxRating = responses[i].rating;
                bestUser = responses[i].name;
            }
        }

        System.out.println("\nAverage Rating: " + total / n); 
        System.out.println("Best Reviewer: " + bestUser + " (" + maxRating + " stars)"); 
        sc.close();
    }
}
