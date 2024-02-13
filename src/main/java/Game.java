public class Game{
  //fields and properties----------------------
  private int[][] board;
  private Player[] players;
    
  //constructor--------------------------------
  public Game(Player x, Player o, int size){
    this.players = new Player[] {x, o};
    this.board = new int[size][size];
  }

  //methods------------------------------------
  public void drawBoard(){
    for(int y = 0; y < board.length; y++){
      for(int x = 0; x < board[y].length; x++){
        System.out.print(" " + board[y][x] + " ");
      }
      System.out.println();
    }
  }
  public void updateBoard(int x, int y, int symbol){
    this.board[y][x] = symbol;
  }

  public void turn(){
    
  }
}