package collageSystem;


public class InputNewHuman extends Transaction {
	protected Keypad keypad;
	public InputNewHuman(Screen screen, HumanDatabase database, Keypad keypad) {
		super(screen, database);
		this.keypad=keypad;
		// TODO Auto-generated constructor stub
	}
	public void execute() {
		screen.displayMessageLine(Message.SEL_HUMAN_TYPE); 
		int stype=keypad.getInput();
		switch(stype) {
		case 1:
			screen.displayMessageLine(Message.INPUT_PROINFO);
			int pid=keypad.getInput();
			String pname=keypad.getStringinput();
			String pdepartment=keypad.getStringinput();
			String pphonenum=keypad.getStringinput();
			String Major=keypad.getStringinput();
			int OfficeId=keypad.getInput();
			gethumanDatabase().inputprofeccerinfo(pid, pname, pdepartment, pphonenum, Major, OfficeId);
			break;
			
		case 2:
			screen.displayMessageLine(Message.INPUT_WORKER);
			int wid=keypad.getInput();
			String wname=keypad.getStringinput();
			String wdepartment=keypad.getStringinput();
			String wphonenum=keypad.getStringinput();
			String Position=keypad.getStringinput();
			int OfficeId2=keypad.getInput();
			gethumanDatabase().inputworker(wid, wname, wdepartment, wphonenum, Position, OfficeId2);
			break;
			
		case 3:
			screen.displayMessageLine(Message.INPUT_STUDENT);
			int sid=keypad.getInput();
			String sname=keypad.getStringinput();
			String sdepartment=keypad.getStringinput();
			String sphonenum=keypad.getStringinput();
			int grade=keypad.getInput();
			gethumanDatabase().inputstudent(sid, sname, sdepartment, sphonenum, grade);
			break;
			
			default:
				screen.displayMessageLine(Message.ERR_CHOICE);
				break;
		}
	} 
}
