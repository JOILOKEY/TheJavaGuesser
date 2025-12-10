# TheJavaGuesser 

Main Menu Loop

Show the menu:

0) Exit

Human Guesser

Computer Guesser

Ask the user to pick an option (0, 1, or 2).

Repeat the menu until the user chooses 0 (Exit).

Human Guesser Mode

Computer picks a random number between 1 and 100.

Let the human guess the number.

After each guess:

If the guess is too high, say "too high..."

If the guess is too low, say "too low..."

If the guess is correct, say "got it!" and end the guessing.

Count how many tries it took.

Extra Credit: After the human guesses correctly, display a personalized message based on the number of tries:

≤ 5 tries: "Wow, you’re a natural at this! "

6–10 tries: "Good job! Practice makes perfect. "

> 10 tries: "Keep trying, you’ll get faster next time! "

Return to the main menu.

Computer Guesser Mode

Tell the human: "Think of a number between 1 and 100."

Computer starts guessing by picking the middle number of the current range (initially 50).

Human responds whether the guess is:

(H) too High

(L) too Low

(C) Correct

Accept lowercase or uppercase input.

If too high: set top boundary to current guess - 1.

If too low: set bottom boundary to current guess + 1.

Make a new guess by picking the middle of the new range.

Repeat until the human says "Correct."

Count the number of guesses.

Extra Credit: After the computer guesses correctly, display a playful message based on the number of tries:

≤ 7 tries: "Binary search master! "

> 7 tries: "That took a bit, but I got it! "

Return to the main menu.

Ending

If the user chooses 0 at the menu, print "Goodbye!" and exit.
