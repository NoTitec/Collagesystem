package collageSystem;

public class Searchhuman extends Transaction{
	protected Keypad keypad;
	protected String sname;
	public Searchhuman(Screen screen, HumanDatabase database,Keypad keypad) {
		super(screen, database);
		this.keypad=keypad;
		// TODO Auto-generated constructor stub
	}
	public void execute() {
		screen.displayMessageLine(Message.INPUT_NAME);
		String tname=keypad.getStringinput();
		gethumanDatabase().printselhuman(tname);
			
		
	}
	
}
