=======================================
🐞 FINAL ROUND: C BUG HUNT CHALLENGE
=======================================

🔧 CHALLENGE NAME: Corrupted Survey Analyzer

🧠 OBJECTIVE:
You are provided with a bugged C program (`bugged_survey.c`) that collects survey responses from users and analyzes them.

The intended program should:
- Ask the user for the number of responses (n)
- For each respondent, collect:
    - Name (string)
    - Age (integer)
    - Rating (integer from 1 to 5)
- Handle invalid ratings by setting them to 3
- Compute the average rating
- Identify the reviewer who gave the highest rating

Your task is to:
✅ Identify and fix **all logic, runtime, and input handling bugs**
✅ Ensure correct output formatting
✅ Prevent runtime crashes or unexpected behavior

-------------------------------
📂 SAMPLE INPUT (via console)
-------------------------------
Enter number of responses: 3

Enter name, age, rating (1-5): Alice 21 5  
Enter name, age, rating (1-5): Bob 22 4  
Enter name, age, rating (1-5): Charlie 23 6  

-------------------------------
❌ ACTUAL OUTPUT (bugged code)
-------------------------------
Invalid rating. Setting to 3.
Average Rating: 3
Best Reviewer: (garbled output or crash)

🧨 REASON:  
- Off-by-one loop index causes array overflow  
- Logic error in rating condition: `(x < 1 && x > 5)` is always false  
- Integer division used for average  
- `bestUser` may contain garbage or be uninitialized

-------------------------------
✅ EXPECTED OUTPUT (after fix)
-------------------------------
Enter number of responses: 3

Enter name, age, rating (1-5): Alice 21 5  
Enter name, age, rating (1-5): Bob 22 4  
Enter name, age, rating (1-5): Charlie 23 6  
Invalid rating. Setting to 3.

Average Rating: 4.00  
Best Reviewer: Alice (5 stars)

------------------------------------
🧠 THINGS TO CONSIDER:
------------------------------------
- Ensure loop runs exactly n times
- Fix rating validation condition
- Use `(float)total / n` for average
- Properly initialize `bestUser`
- Validate that `n` is within a safe range (1-100)

🎯 GOAL:
Provide a corrected C file (e.g., `fixed_survey.c`) that produces the expected output correctly and safely when run in any online C compiler.

All the best, debug warrior! 🔍💻
