/*
This project must play Tic-Tac-Toe.


For the first in-class demonstration, you must have the following:
1) a static constand 2-D Array the represnets the board and holds the STATE data for the game.
2) You must correctly resolve:
  horizontal, 
  diagonal, 
  vertical winner conditions
  And a draw
3) You must have 1 player.

For the future and more points above an A-...
0) You must correctly resolve all win and draw states
1) You should have a seond player
2) You should be able to play on a 4 x 4 board
3) You should correctly resolve turns
4) The player and the game should be in seperate classes from your static Main


For more in the future and more awesomer...
1) You can have a text file documenting player win-loss records and another stat of your choice
2) You can have a 3rd or 4th player
3) You can have a 3rd dimension to the game
4) You can make a new class for a game session as well as a single game
5) You can make a new class for a turn, or a piece, or a screen painter
*/
// Meadow Reiber
// Tic Tac Toe
// 2/14/2024
// period 6

public class Main {
  public static final int SIZE = 3;
  public static final int[][] STATE = new int[SIZE][SIZE];
  
  public static void main(String[] args) {
    Player player1 = new Player(1);
    Player player2 = new Player(2);
    Game ticTacToe = new Game(player1, player2, STATE);

    ticTacToe.drawBoard();
    
    while(!(ticTacToe.getDone())){
      ticTacToe.turn(player1);
      updateState(ticTacToe);
      
      if (ticTacToe.getDone()) break;
      ticTacToe.turn(player2);
      updateState(ticTacToe);
    }

    System.out.println("Player " + ticTacToe.getWinner().getSymbol() + " won!");
    System.out.println("TTT - RAN WITHOUT ERRORS");
  }

  public static void updateState(Game game){
    for(int y = 0; y < STATE.length; y++){
      for(int x = 0; x < STATE[y].length; x++){
        STATE[y][x] = game.getBoard()[y][x];
      }
    }
  }
}