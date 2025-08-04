# The Guessing Game
This game involves a game object and three player objects. 
The game generates a random number between 0 and 9, and the three player objects try to guess it.

### Classes
- GuessGame.class
- Player.class
- GameLauncher.class

### The Logic
1. The GameLauncher class is where the game starts; it has the main() method.
2. In the main() method, a GuessGame object is created, and it's startGame() method is called.
3. The GuessGame object's startGame() method is where the entire game plays out.
It creates three players and then "thinks" of a random number between 0 and 9, (the target for the players to guess).
It then asks each player to guess, checks the result, and either prints out information about the winning player(s) 
or tells them to try again.
