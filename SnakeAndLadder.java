public class SnakeAndLadder
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Snake And Ladder Simulation Program");
		// Local variable
		int playerPosition = 0;	
        int die = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println("Dice roll: " + die);
	}
}	
	