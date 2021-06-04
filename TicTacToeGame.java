package tictactoe;
import java.util.Scanner;
public class TicTacToeGame {
	static char[] Board;
	static char ch;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Welcome to Tic Tac Toe Game");
		
		//Calling to Create a Board
		createBoard();
		
		//Asking user to choose x or o
		userChoice();
		
		//Displaying board layout
		printBoard();
		
		//Displaying Board for User to Choose
		userBoard();
		userMove();
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
		ch= sc.next(). charAt(0);
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
		System.out.println("|---|---|---|");
		System.out.println("| " + Board[1] + " | "+ Board[2] + " | " + Board[3]+ " |");
		System.out.println("|-----------|");
		System.out.println("| " + Board[4] + " | "+ Board[5] + " | " + Board[6]+ " |");
		System.out.println("|-----------|");
		System.out.println("| " + Board[7] + " | "+ Board[8] + " | " + Board[9]+ " |");
		System.out.println("|---|---|---|");
	}
	//Displaying Number board for user to choose desired number
	public static void userBoard() {
		int REDIX=10;
		System.out.println("\n");
	    for( int i=1; i<10; i++)
        {
	    	if (Board[i] !='x' && Board[i] !='o') 
	    		Board[i] = Character.forDigit(i,REDIX);
        }
	    printBoard();
	}
//	User making a move from the user board  
	public static void userMove() {   
	    System.out.println("\nEnter a slot number :\n");
	    int nmb=sc.nextInt();
	    if (nmb > 0 && nmb <= 9 && Board[nmb]!='x' && Board[nmb]!='o')
	    {
	    	Board[nmb]=ch;
	    	System.out.println(Board[nmb]);
	    	userBoard();	
	    }
	    else
	    {
	    	System.out.println("Invalid input");
	    	userMove();
	    }
	}
}