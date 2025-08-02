#include <stdio.h>
#include <string.h>

int main() {
    char str[5] = "Hi";
    strcat(str, " there"); 
    printf("%s\n", str);
    return 0;
}
