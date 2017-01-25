package breakStuff;

import java.util.Scanner;

public class breakStuff {
	static int mode;
	static int movie;
	static int entertainment;
	static int show;
	static String name;
	public static void main(String[] args) 
	{
		greetUser();
	}
		public static void greetUser()
		{
			System.out.println("User, what is your name");
			Scanner userInput = new Scanner(System.in);
			name = userInput.nextLine ();
			System.out.println("Hello " + name + ", Welcome to the break stuff program, pick a mode.");
			System.out.println("1.) Riddle");
			System.out.println("2.) entertainment suggestion");
			System.out.println("3.) honestly I have no damn clue");
			Scanner userInput2 = new Scanner(System.in);
			mode = userInput2.nextInt ();
			if (mode == 1)
			{
				System.out.println("You've selected the game mode.");
				System.out.println("lets play a game, a thinking game.");
				System.out.println("Im gonna give you a riddle to solve");
				System.out.println("Answer jeopardy style, ex. what is a _______");
				System.out.println("What starts its life on four legs");
				System.out.println("Then two, and dies with the assistance of a third?");
				if (userInput.equals("what is a man"))
				{
					System.out.println("Correct");
				}
				else 
				{
					System.out.println("no, it is a man as a baby, an adult, and elder with a cane");
				}
			System.exit(0);
			}
			else if (mode == 2)
			{
				Scanner userInput4 = new Scanner(System.in);
				entertainment = userInput4.nextInt ();
				System.out.println("1.) movie");
				System.out.println("2.) show");
				if (entertainment == 1)
				{
					System.out.println("1.) action");
					System.out.println("2.) comedy");
					Scanner userInput5 = new Scanner(System.in);
					entertainment = userInput5.nextInt ();
					if (movie == 1)
					{
						System.out.println("I would suggest South paw, Black Hawk Down, or The Accountant");
					}
					else if (movie == 2)
					{
						System.out.println("I would recomend Deadpool, Taladega Knights, Monty Python and the Holy Grail, or Step Brothers");
					}
					Scanner userInput6 = new Scanner(System.in);
					entertainment = userInput6.nextInt ();
					if (show == 2)
					{
						System.out.println("1.) Suspense");
						System.out.println("2.) relaxing");
						if (show == 1)
						{
							System.out.println("I suggest Sons of Anarchy or Supernatural.");
						}
						if (show == 2)
						{
							System.out.println("Maybe some American dad.");
						}
					}
					System.exit(0);
					if(mode == 3)
					{
						System.out.println("I dunno. Just stretch or make a bad decision or something.");
					}
				}
			}
		}

}
