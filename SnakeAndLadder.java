import java.util.Scanner;
public class SnakeAndLadder
{
	// Constant 
	public static final int WinningPosition = 100;
	public static void main(String[] args)
	{
		// Local variable
		int playerPosition = 0;
		int dieCounter = 0;
		System.out.print("Enter player name: ");
		Scanner s = new Scanner(System.in);
		String playerName = s.next();
		System.out.println("Player name: " + playerName);
		while ( playerPosition < WinningPosition) 
		{
		  int die = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		  dieCounter++;
		  int Position = WinningPosition - playerPosition;
		  int option = (int) (Math.floor(Math.random() * 10) % 3);
		  if( Position >= die )
	      {
		    switch (option)
		    {
			  case 0:
				playerPosition += 0;
				break;
			  case 1:
				playerPosition += die;
				break;
			  default:
				playerPosition -= die;
				if (playerPosition < 0)
					playerPosition = 0;
      	    }
		  } 
		 System.out.println("Player position: " + playerPosition);
		} 
		  System.out.println("Dice was rolled  for " + dieCounter + " times.");
	}
}