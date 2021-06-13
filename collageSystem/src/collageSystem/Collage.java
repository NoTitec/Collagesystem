package collageSystem;

public class Collage {
	private String curhumanname; // current student name

	/* Collaborating classes */
	private Screen screen;
	private Keypad keypad;
	private Menu mainMenu;
	private HumanDatabase database;
	ITransaction currentTransaction = null; // Polymorphic Composition

	public Collage() {
		
		curhumanname= ""; // no current account number to start
		screen = new Screen();
		keypad = new Keypad();
		mainMenu = new Menu();
		database = new HumanDatabase();
	}

	/* start ATM : welcome, authenticate user, perform transactions */
	public void run() {
		while ( true ) {
			screen.displayMessageLine(Message.WELCOME);
			performTransactions(); // Do THE REQUIRED TASK

			// initializatin for next ATM session
			
			curhumanname = "";
			screen.displayMessageLine(Message.GOODBYE);
		} 
   	} // run()

	// display main menu and Execute transactios
	private void performTransactions() {
			boolean usercexit=true;
		while ( usercexit ) {     
			// (1) accepts user request (command)
			int command = mainMenu.displayMainMenu(screen, keypad);

			// (2) performs the command using DELEGATION to Transaction
			switch ( command ) {
			case Menu.Humaninfoinput:
			case Menu.Humaninfodelete: 
			case Menu.Humansearchbyname:
			case Menu.PrintallHuman:
				currentTransaction = createTransaction( command );
				currentTransaction.execute();
				currentTransaction = null;
				break; 
			case Menu.EXIT:
				System.exit(0);
				break;
				
			default:
				screen.displayMessageLine(Message.ERR_CHOICE);
				break;
			} 
		}
	} // performTransactions()
   
	// Create transaction
	private ITransaction createTransaction( int type ) {
		ITransaction temp = null;
	   
		switch ( type ) {
		case Menu.Humaninfoinput:
			temp = new InputNewHuman(screen,database, keypad);
			break;
		case Menu.Humaninfodelete:
			temp = new DeleteHuman(screen,database, keypad);
			break; 
		case Menu.Humansearchbyname:
			temp = new Searchhuman(screen,database, keypad);
			break;
		case Menu.PrintallHuman:
			temp = new Printallhuman(screen, database);
		}
		return temp; 
	}
}
