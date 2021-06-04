package tictactoe;
import java.util.Scanner;
public class TicTacToeGame {
	static char[] Board;
	public static void main(String[] args){
		System.out.println("Welcome to Tic Tac Toe Game");
		createBoard();
		userChoice();
		printBoard();
	}
	
	/**({@summary}
	 * Creating a board
	 */
	public static void createBoard()
	{
		Board = new char[10];
		for (int i = 0; i <Board.length; i++) {
			Board[i] = '-';
		}
	}
	 // Asking User to choose between x and o
	public static void userChoice() 
	{
		System.out.println("Enter the character 'x' or 'o':");
		Scanner sc = new Scanner(System.in);
		char ch= sc.next(). charAt(0);
		if(ch =='x'|| ch =='o')
		{
			if(ch=='x')
				System.out.println("Player chosen "+ch+" Computer is o");
			else
				System.out.println("Player chosen "+ch+" Computer is x");
		}
		else
		{
			System.out.println("Enter Valid input:x or o");
			userChoice();
		}
	}
	//Displaying the board
	static void printBoard()
	{	
		System.out.println("The Current Board is:");
		System.out.println("|---|---|---|");
		System.out.println("| " + Board[1] + " | "+ Board[2] + " | " + Board[3]+ " |");
		System.out.println("|-----------|");
		System.out.println("| " + Board[4] + " | "+ Board[5] + " | " + Board[6]+ " |");
		System.out.println("|-----------|");
		System.out.println("| " + Board[7] + " | "+ Board[8] + " | " + Board[9]+ " |");
		System.out.println("|---|---|---|");
	}
}