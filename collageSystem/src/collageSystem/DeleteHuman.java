package collageSystem;

public class DeleteHuman extends Transaction{
	

	protected Keypad keypad;
	
	public DeleteHuman(Screen screen, HumanDatabase database,Keypad keypad) {
		super(screen, database);
		this.keypad=keypad;
		// TODO Auto-generated constructor stub
	}
	public void execute() {
		screen.displayMessageLine(Message.DEL_SEL_HUMAN);
		int sel=keypad.getInput();
		gethumanDatabase().deletehuman(sel);
	}
}
