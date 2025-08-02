=======================================
🐞 FINAL ROUND: JAVA BUG HUNT CHALLENGE
=======================================

🔧 CHALLENGE NAME: Corrupted Survey Analyzer (Java Edition)

🧠 OBJECTIVE:
Fix a broken Java program (`BuggedSurvey.java`) meant to process student survey responses.

The program should:
- Ask the user how many responses to process (n)
- Collect name, age, and rating (1-5) for each respondent
- Replace any invalid rating with a default of 3
- Compute average rating
- Display the top reviewer (highest rating)

Your tasks:
✅ Fix logic, input, and loop bugs
✅ Prevent crashes or uninitialized variables
✅ Ensure accurate calculation and output

-------------------------------
📂 SAMPLE INPUT (via console)
-------------------------------
Enter number of responses: 3

Enter name, age, rating (1-5):  
Alice 21 5  
Bob 22 4  
Charlie 23 6

-------------------------------
❌ ACTUAL OUTPUT (BuggedSurvey.java)
-------------------------------
Invalid rating. Setting to 3.  
Exception in thread "main" java.lang.Error...  
Average Rating: 3  
Best Reviewer: null (or crash)

🧨 WHY:
- Loop runs `i <= n`, causing array overflow
- Invalid rating check uses `&&` instead of `||`
- Integer division used for average
- `bestUser` uninitialized may crash

-------------------------------
✅ EXPECTED OUTPUT (FixedSurvey.java)
-------------------------------
Invalid rating. Setting to 3.

Average Rating: 4.00  
Best Reviewer: Alice (5 stars)

------------------------------------
🧠 TIPS:
------------------------------------
- Fix off-by-one loops
- Watch for logical AND vs OR in conditions
- Ensure floating-point division
- Properly initialize strings
- Close scanners to avoid resource leaks

🎯 GOAL:
Submit a corrected version (`FixedSurvey.java`) that works in any online Java compiler and produces the expected output.

Happy Debugging! 🔧🔥
