package tictactoe;

import java.util.Scanner;

/**
 * @author nithinkrishna
 *
 */
/**
 * @author nithinkrishna
 *
 */
public class TicTacToeGame {
	static char[] Board;
	static char ch;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		userChoice();
		
		
		// Calling to Create a Board
		createBoard();

		// Asking user to choose x or o
		
		// Displaying board layout
		printBoard();

		// Displaying Board for User to Choose
		userBoard();
		
		userMove();
		
		
	}

	/**
	 * Creating an empty board
	 */
	public static void createBoard() {
		Board = new char[10];
		for (int i = 0; i < Board.length; i++) {
			Board[i] = '-';
		}
	}

	/**
	 *
	 * Asking User to choose 'x' or 'o'
	 */
	public static void userChoice() {
		System.out.println("Enter the character 'x' or 'o':");
		ch = sc.next().charAt(0);
		if (ch == 'x' || ch == 'o') {
			if (ch == 'x')
			{
				System.out.println("Player chosen " + ch + " Computer is o");
				whoPlaysFirst();
			}
			else
				System.out.println("Player chosen " + ch + " Computer is x");
		} else {
			System.out.println("Enter Valid input:x or o");
			userChoice();
		}
	}

	/**
	 * Displaying Empty Board
	 */
	static void printBoard() {
		System.out.println("|---|---|---|");
		System.out.println("| " + Board[1] + " | " + Board[2] + " | " + Board[3] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + Board[4] + " | " + Board[5] + " | " + Board[6] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + Board[7] + " | " + Board[8] + " | " + Board[9] + " |");
		System.out.println("|---|---|---|");
	}

	/**
	 * Showing User the index board
	 */
	public static void userBoard() {
		int redix = 10;
		System.out.println("\n");
		for (int i = 1; i < 10; i++) {
			if (Board[i] != 'x' && Board[i] != 'o')
				Board[i] = Character.forDigit(i, redix);
		}
		printBoard();
	}

	/**
	 * User making a move by seeing the userBoard
	 */
	public static void userMove() {
		System.out.println("\nEnter a slot number :\n");
		int number = sc.nextInt();
		if (number > 0 && number <= 9 && Board[number] != 'x' && Board[number] != 'o') {
			Board[number] = ch;
			System.out.println(Board[number]);
			userBoard();
		} else {
			System.out.println("Invalid input");
			userMove();
		}
	}

	public static void whoPlaysFirst() {
		double toss = (Math.floor(Math.random() * 10) % 2)+1;
		System.out.println("toss is :" + toss);
		System.out.println("choose your choice 1.head 2.tail");
		int choice = sc.nextInt();
		int x;
		if(toss==choice) 
			x=1;
		else
			x=0;
		switch (x) {
		case 1:
				System.out.println("player's turn");
				userChoice();
				break;
		case 0:
				System.out.println("computer's turn");
				add();
				break;
		default:
			System.out.println("invalid input");
			whoPlaysFirst();
		}
	}
	public static void add()
	{
		int a=10,b=20;
		System.out.println((a + b));
	}
}