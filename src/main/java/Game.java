public class Game{
  //fields and properties----------------------
  private int[][] board;
  private Player[] players;
  private boolean done = false;
  private Player winner;
    
  //constructor--------------------------------
  public Game(Player x, Player o, int[][] board){
    this.players = new Player[] {x, o};
    this.board = board;
  }

  //methods------------------------------------
  //getters and setters
  public boolean getDone(){
    return this.done;
  }
  public Player getWinner(){
    return this.winner;
  }
  public int[][] getBoard(){
    return this.board;
  }
  public void updateBoard(int x, int y, int symbol){
    if(this.board[y][x] == 0) this.board[y][x] = symbol;
    else{
      System.out.println("this tile is full");
    }
  }
  
  //displays the board
  public void drawBoard(){
    for(int y = 0; y < board.length; y++){
      for(int x = 0; x < board[y].length; x++){
        System.out.print(" " + board[y][x] + " ");
      }
      System.out.println();
    }
  }
  
  //runs through the process of one player's turn
  public void turn(Player player){
    String[] square = player.getTurn();
    int x = Integer.parseInt(square[0]);
    int y = Integer.parseInt(square[1]);
    
    updateBoard(x, y, player.getSymbol());
    this.drawBoard();

    this.done = checkWin(player);
  }

  //checking all of the win conditions
  public boolean checkWin(Player player){
    int symbol = player.getSymbol();
    if(horizontalWin(symbol) || verticalWin(symbol) || diagonalWin1(symbol) || diagonalWin2(symbol)){
      this.winner = player;
      return true;
    }
    return false;
  }
  private boolean horizontalWin(int symbol){
    for(int y = 0; y < this.board.length; y++){
      boolean win = true;
      for(int x = 0; x < this.board[y].length; x++){
        if(this.board[y][x] != symbol) win = false;
      }
      if(win) return true;
    }
    return false;
  }
  private boolean verticalWin(int symbol){
    for(int y = 0; y < this.board.length; y++){
      boolean win = true;
      for(int x = 0; x < this.board[y].length; x++){
        if(this.board[x][y] != symbol) win = false;
      }
      if(win) return true;
    }
    return false;
  }
  private boolean diagonalWin1(int symbol){
    boolean win = true;
    for(int y = 0; y < this.board.length; y++){
      if(this.board[y][y] != symbol) win = false;
    }
    return win;
  }
  private boolean diagonalWin2(int symbol){
    boolean win = true;
    for(int y = 0; y < this.board.length; y++){
      int x = (this.board.length - 1) - y;
      if(this.board[y][x] != symbol) win = false;
    }
    return win;
  }

  //checks if the whole board is full
  /*
  public boolean gameTie(){
    for(int y = 0; y < this.board.length; y++){
      for(int x = 0; x < this.board[y].length; x++){
        if(this.board[y][x] == 0) return false;
      }
    }
    System.out.println("The game is a draw");
    return true;
  }
  */
}