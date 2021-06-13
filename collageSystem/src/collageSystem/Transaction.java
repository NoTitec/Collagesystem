package collageSystem;

public class Transaction implements ITransaction{
	protected Screen screen;		// composition of a collaborating class
	protected HumanDatabase database; 	// composition of a collaborating class
	protected int curHumanid;
	public Transaction(  Screen screen, HumanDatabase database ) {
		
		this.screen = screen;
		this.database = database;
		
	} 
 
	public HumanDatabase gethumanDatabase() { 
		return database; 
	}

	public void execute() {
		// do nothing ( or abstract void execute(); )
	}

	@Override
	public int getHumanId() {
		return 0;
	}

	@Override
	public String getHumanname() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
