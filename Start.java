import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		//objects
		Scanner scnr = new Scanner(System.in);
		
		//variables
		int userInput;
		
		System.out.println("Welcome to Joey's Pizza! What can we make for you?");
		System.out.println("Type a number to choose:\n 1.Pizza \n 2.Pasta \n 3.Subs");
		userInput = scnr.nextInt();
		
		//FIXME add what happens when customer selects an option
		if (userInput == 1) {
			System.out.println(pizza);
		}
		else if (userInput == 2) {
			
		}
		else if (userInput == 3) {
			
		}
		else  {
			
		}
	}

	public static string pizza =
			"                     ____\n" +
			"               _,--~~    ~~--._\n" +
			"            ,/'  m%%%%%%=@%%m  `\\.\n" +
			"           /' m%%o(_)%%o%%%%o%%m `\\\n" +
			"         /' %%@=%o%%%o%%%o%(_)o%%% `\\\n" +
			"        /  %o%%%%%=@%%%(_)%%o%%@=%%  \\\n" +
			"       |  (_)%(_)%%o%%%o%%%%=@(_)%%%  |\n" +
			"       | %%o%%%%o%%%(_)%%o%%o%%%%o%%% |\n" +
			"       | %%o%(_)%%%%%o%(_)%%%o%%o%o%% |\n" +
			"       |  (_)%%=@%(_)%o%o%%(_)%o(_)%  |\n" +
			"        \\ ~%%o%%%%%o%o%=@%%o%%@%%o%~ /\n" +
			"         \\. ~o%%(_)%%%o%(_)%%(_)o~ ,/\n" +
			"           \\_ ~o%=@%(_)%o%%(_)%~ _/\n" +
			"             `\\_~~o%%%o%%%%%~~_/'\n" +
			"                `--..____,,--'\n";
}
