package tictactoe;
public class TicTacToeGame {
	static char[] Board;
	public static void main(String[] args){
		System.out.println("Welcome to Tic Tac Toe Game");
		createBoard();
	}
	
	/**({@summary}
	 * Creating a board
	 */
	public static void createBoard()
	{
		Board = new char[9];
		for (int i = 0; i < 9; i++) {
			Board[i] = '-';
		}
	}
	
	
}