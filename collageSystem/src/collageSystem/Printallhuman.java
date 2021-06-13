package collageSystem;

public class Printallhuman extends Transaction{

	public Printallhuman(Screen screen, HumanDatabase database) {
		super(screen, database);
		// TODO Auto-generated constructor stub
	}
	public void execute() {
		gethumanDatabase().printallhuman();
	}
}
