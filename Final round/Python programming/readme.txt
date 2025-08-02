=======================================
🐍 FINAL ROUND: PYTHON BUG HUNT CHALLENGE
=======================================

🔧 CHALLENGE NAME: Corrupted Survey Analyzer (Python Edition)

🧠 OBJECTIVE:
Fix the provided bugged Python script (`bugged_survey.py`) that analyzes survey feedback.

Expected functionality:
- Ask how many participants responded
- Collect name, age, and rating (1–5)
- Replace any invalid rating with 3
- Calculate average rating (float)
- Display reviewer with the highest rating

🛠️ YOUR TASK:
✅ Fix all syntax, logic, and runtime bugs
✅ Prevent index or type errors
✅ Ensure formatted output as shown

-------------------------------
📂 SAMPLE INPUT
-------------------------------
Enter number of responses: 3  
Enter name, age, rating (1-5):  
Alice 21 5  
Enter name, age, rating (1-5):  
Bob 22 4  
Enter name, age, rating (1-5):  
Charlie 23 6  

-------------------------------
❌ ACTUAL OUTPUT (bugged_survey.py)
-------------------------------
Invalid rating. Setting to 3.  
Average Rating: 3  
Best Reviewer: None (or IndexError)

🧨 WHY:
- Loop runs `n + 1` times, causing index errors  
- Rating validation uses incorrect condition  
- Integer division instead of float  
- `best_user` may remain None or uninitialized

-------------------------------
✅ EXPECTED OUTPUT (fixed_survey.py)
-------------------------------
Invalid rating. Setting to 3.

Average Rating: 4.00  
Best Reviewer: Alice (5 stars)

------------------------------------
💡 NOTES:
------------------------------------
- Use `or` instead of `and` in conditionals
- Use floating-point division for averages
- Avoid hardcoding array sizes
- Properly initialize all variables

🎯 GOAL:
Submit your corrected Python file (`fixed_survey.py`) that works in online IDEs like Replit, Hackerrank, or Jupyter Notebook.

Happy hunting! 🐛🪓
