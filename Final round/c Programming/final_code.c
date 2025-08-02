#include <stdio.h>
#include <string.h>

typedef struct {
    char name[20];
    int age;
    int rating; 
} Response;

int main() {
    int n;
    printf("Enter number of responses: ");
    scanf("%d", &n);

    Response responses[100];
    for (int i = 0; i <= n; i++) { 
        printf("\nEnter name, age, rating (1-5): ");
        scanf("%s %d %d", responses[i].name, &responses[i].age, &responses[i].rating);

        if (responses[i].rating < 1 && responses[i].rating > 5) {  
            printf("Invalid rating. Setting to 3.\n");
            responses[i].rating = 3;
        }
    }

    int total = 0;
    int maxRating = -1;
    char bestUser[20];

    for (int i = 0; i < n; i++) {
        total += responses[i].rating;

        if (responses[i].rating > maxRating) {
            maxRating = responses[i].rating;
            strcpy(bestUser, responses[i].name);
        }
    }

    printf("\nAverage Rating: %.2f\n", total / n);  
    printf("Best Reviewer: %s (%d stars)\n", bestUser, maxRating);

    return 0;
}
