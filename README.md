# TheJavaGuesser 
JavaGuesser

Main Menu Loop

Show the menu:

Exit

Human Guesser

Computer Guesser

Ask the user to pick an option (0, 1, or 2).

Keep repeating the menu until the user chooses 0 (Exit).

Human Guesser Mode

Computer picks a random number between 1 and 100.

Let the human guess the number.

After each guess:

If the guess is too high, say "too high..."

If the guess is too low, say "too low..."

If the guess is right, say "got it!" and end the guessing.

Count how many tries it took.

Computer Guesser Mode

Tell the human: "Think of a number between 1 and 100."

Computer starts guessing by picking the middle number (50).

Human says if the guess is:

(H) too High

(L) too Low

(C) Correct

If too high:

Set the top boundary to current guess - 1.

If too low:

Set the bottom boundary to current guess + 1.

Make a new guess by picking the middle of the new range.

Keep guessing until human says "Correct."

Count the number of guesses and say how many tries it took.

*Notes

When asking for High/Low/Correct, accept both lowercase and uppercase (h, H, l, L, c, C).

After finishing Human or Computer guesser, go back to the main menu.

Ending

If the user chooses 0 at the menu, print "Goodbye!" and exit.
