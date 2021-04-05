import java.util.*;

public class programming2 {
    public static void main (String [] args)
	{
		String a[][] = new String [3][3];// Setting up the Board
		for (int i = 0;i<3;i++)
		{
			for (int j = 0;j<3;j++)
			{
				a[i][j] = "[ ]";
			}
			
		}//1. How should we set up the board?
		//3. What is the board?
		//2. What should you use?
		//3. Default board character?
		int step = 1;
		System.out.println("Game start!!");//Setting up the game
	while (step<11)
	{
		displayBoard (a);
		//1. What are the conditions to end the game? 
		
		int  win = checkForWin(a,step);//		-> How many moves?//		-> Who Wins?
		if (win == 1)     
		{
			System.out.println("----Player X won----");
			System.exit(1);
		}       
		else if (win == 2)
		{
			System.out.println("----Player O won----");
			System.exit(1);
		}        
		//2. Who gets 'X' and who gets 'O'?
		else if (win == 3)
		{
			System.out.println("----TIE----");
			System.exit(1);
		}
		//Player Moves
		if (step%2==1)
		{
			System.out.println("Player X turn !");
		}  
		else if (step%2==0)
		{
			System.out.println("Player O turn !");
		}                              //1. Whos turn is it?
		System.out.println("----Please input a valid location (like:row,column)----");
		  //2. How do they select their position?
		a=checkValidPosition(a,step);//3. Is the input valid?
		step++;
		//4. Have they won?
	} 
		
	}

	public static int checkForWin (String a[][],int step)
	{
		int win = 4;
		int row = 0;
		int col = 0;
		int dia = 0;
		for (int i = 0;i<3;i++)//row
		{
			for (int j = 0;j<3;j++)
			{
				row+=a[i][j].charAt(1);
			}
			if (row == 79*3)
			{
				win = 2;
			}
			else if (row == 88*3)
			{
				win = 1;
			}
			
		} 
		for (int i = 0;i<3;i++)//column
		{
			for (int j = 0;j<3;j++)
			{
				col+=a[j][i].charAt(1);
			}
			if (col == 79*3)
			{
				win = 2;
			}
			else if (col == 88*3)
			{
				win = 1;
			}
			
		} 

		for (int i = 0;i<3;i++)//vice diagonal
		{
			dia+=a[i][i].charAt(1);
			
			if (dia == 79*3)
			{
				win = 2;
			}
			else if (dia == 88*3)
			{
				win = 1;
			}
			
		} 
		for (int i = 0;i<3;i++)//diagonal
		{
			dia+=a[i][2-i].charAt(1);
			
			if (dia == 79*3)
			{
				win = 2;
			}
			else if (dia == 88*3)
			{
				win = 1;
			}
			
		}
		if (step == 10)
		{
			win = 3;
		}
		return win;    
		
		
		//1. How do you win at TicTacToe?
		//2. How to check for this winning conditions?
		//3. What is the default character on the board?
		//4. What input parameters if any do you need?
		//5. What if anything should you return?


	}

	public static void displayBoard (String a[][])
	{
		for (int i = 0;i<3;i++)
		{
			for (int j = 0;j<3;j++)
			{
				System.out.print(a[i][j]+' ');
			}
			System.out.println();
		}//1. How would you display the board?
		//2. what is the current state of the board?
		//3. What input parameters if any do you need?
		//4. What if anything should you return?
	}

	public static String[][] checkValidPosition (String a[][],int step)
	{
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int d = sc.nextInt();  
		if (c<4&&c>0&&d<4&&d>0) 
		{
			if (a[c-1][d-1]=="[ ]")
			{
				if (step%2==1)
				{
					a[c-1][d-1]="[X]";
				}
				else 
				{
					a[c-1][d-1]="[O]";
				}
			}
			else
			{
				System.out.println("----BEING OCCUPIED!!----"); 
				checkValidPosition(a,step);
				sc.close();
			}
		}  
		else
		{
			System.out.println("----INVALID NUMBER!!----");
			checkValidPosition(a,step);
			sc.close();
		} 
		return a;		//1. Is the selected position taken on the board?
					//2. What input parameters if any do you need?
					//3. What if anything should you return?
	}
}
