package collageSystem;


public interface ITransaction {
	public final static int CANCELED = 0;
		abstract public int getHumanId();
		abstract public String getHumanname();
		abstract public HumanDatabase gethumanDatabase();
		abstract public void 		execute();
		default public int curHumanIdinput(Screen screen, Keypad keypad) {
			screen.displayMessage(Message.INPUT_Id);

			int input = keypad.getInput();
			return ( input == CANCELED ) ? CANCELED : input;
		}
	
}
