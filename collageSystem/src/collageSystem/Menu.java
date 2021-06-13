package collageSystem;

public class Menu {
	public static final int Humaninfoinput = 1;
	public static final int Humaninfodelete = 2;
	public static final int Humansearchbyname = 3;
	public static final int PrintallHuman = 4;
	public static final int EXIT=5;

	// display main menu and get user command
	public int displayMainMenu(Screen screen, Keypad keypad) {
		screen.displayMessageLine( "\n\t\t     MENU:\n" );
		screen.displayMessageLine( "\t\t1 - inputHumaninfo" );
		screen.displayMessageLine( "\t\t2 - deleteHumaninfo" );
		screen.displayMessageLine( "\t\t3 - Humaninfosearchbyname" );
		screen.displayMessageLine( "\t\t4 - printallinfo");
		screen.displayMessageLine("\t\t5 - exit");
		screen.displayMessage( "\tChoice: " );
		return keypad.getInput();
	}
}
