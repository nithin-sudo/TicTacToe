package tictactoe;
import java.util.Scanner;
public class TicTacToeGame {
	static char[] Board;
	public static void main(String[] args){
		System.out.println("Welcome to Tic Tac Toe Game");
		createBoard();
		userChoice();
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
	 // Asking User to choose between X and O	
	public static void userChoice() 
	{
		System.out.println("Enter the character 'x' or 'o':");
		Scanner sc = new Scanner(System.in);
		char ch= sc.next(). charAt(0);
		if(ch =='x'|| ch =='o')
		{
			if(ch=='x')
				System.out.println("Player chosen"+ch+"Computer is o");
			else
				System.out.println("Player chosen "+ch+" Computer is x");
		}
		else
		{
			System.out.println("Enter Valid input:x or o");
			userChoice();
		}
	}
}