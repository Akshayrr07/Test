#include <stdio.h>

int sumUpto(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += i;
        return sum; 
    }
}

int main() {
    printf("Sum = %d\n", sumUpto(5));
    return 0;
}
