import java.util.*;

public class TicTac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Tic-Tac-Toe Project....");
		char[][] boardGame = new char[3][3];
		for (int row = 0; row < boardGame.length; row++) {
			for(int col = 0; col < boardGame[row].length; col++) {
				boardGame[row][col] = ' ';
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		char player = 'X';
		boolean gameOver = false;	//Game not yet started
		int counter=0;

	//	for (int i = 0;(i<9)&&(gameOver==false); i++) 
			
		
		while((gameOver==false)/*&&(counter<9)*/) {
			
			printBoard(boardGame);	//Prints Board
			System.out.println("PLAYER " + player + " ENTER (co-ordinates): ");
			int row = sc.nextInt();
			int col = sc.nextInt();
			 
			if(boardGame[row][col]==' ') {	//if box is empty work on it else give error
				counter++;
				boardGame[row][col] = player;
				gameOver = haveWon(boardGame,player);
				if(gameOver) {
					System.out.println("Horray!! Player " + player + " has WON....!");
					break;
				}
				else if(counter==9){
						gameOver = true;
						System.out.println("Outch!!...Draw Match");
						break;
				}	
				else {
					player = (player=='X') ? 'O' : 'X';
					}
			} 
			
			else {
				System.out.println("Invalid Move..Try Again..!");
			}
			
		}
		printBoard(boardGame);
		
	}
	
	
	public static boolean haveWon(char[][] boardGame,char player) {
		//checking Rows
		for (int row = 0; row < boardGame.length; row++) {
			if(boardGame[row][0] == player && boardGame[row][1]== player && boardGame[row][2] == player) {
			return true;
			}
		}
			//checking columns
		for (int col = 0; col < boardGame.length; col++) {
			if(boardGame[0][col] == player && boardGame[1][col] == player && boardGame[2][col] == player) {
			return true;
			}
		}
			//checking Diagonals
		if(boardGame[0][0] == player && boardGame[1][1] == player && boardGame[2][2] == player )	{
			return true;
		}
		else if(boardGame[0][1] == player && boardGame[1][1] == player && boardGame[0][2] == player) {
			return true;
		}
		else 
			return false;
		}
		
	
	
	public static void printBoard(char[][] boardGame) {
		for (int row = 0; row < boardGame.length; row++) {
			for(int col = 0; col < boardGame[row].length; col++) {
				System.out.print("|"+boardGame[row][col] + " |");
			}
			System.out.println();
		}
	}

}
