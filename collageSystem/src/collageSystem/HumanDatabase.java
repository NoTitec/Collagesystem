package collageSystem;

public class HumanDatabase {
	private Human humans[]; // array of Accounts
	private int hindex = 0;
	public Screen screen;

	public HumanDatabase() {
		humans = new Human[10];
	}

	public Human getHuman(String name) {
		for (Human h : humans) {
			if (h == null) {
				break;
			}
			if (h.getname() == name)
				return h;
		}
		return null;
	}

	private Human getHuman(int id) {
		for (Human h : humans) {
			if (h.getid() == id)
				return h;
		}
		return null;
	}

	public void inputprofeccerinfo(int id, String name, String depart, String pnum, String Major, int Onum) {
		Professor temp = new Professor();
		temp.setinfo(id, name, depart, pnum, Major, Onum);
		humans[hindex] = temp;
		hindex++;
		return;
	}

	public void inputworker(int id, String name, String depart, String pnum, String Position, int Onum) {
		Worker temp = new Worker();
		temp.setinfo(id, name, depart, pnum, Position, Onum);
		humans[hindex] = temp;
		hindex++;
		return;
	}

	public void inputstudent(int id, String name, String depart, String pnum, int grade) {
		Student temp = new Student();
		temp.setinfo(id, name, depart, pnum, grade);
		humans[hindex] = temp;
		hindex++;
		return;
	}

	public void deletehuman(int id) {
		for (int i = 0; i < hindex; i++) {
			if (humans[i].getid() == id) {
				System.out.println("find id human");
				for (int j = i; j < hindex - 1; j++) {
					humans[j] = humans[j + 1];
				}
				humans[hindex-1] = null;
				hindex--;
				return;
			} 
		}
		System.out.println("no id human");
		return;
	}

	public void printselhuman(String name) {
		for (Human h : humans) {
			if (h == null) {
				break;
			} else if (h.getname().equals(name)) {
				h.printinformation(screen);
				return;
			}
		}
	}

	public void printallhuman() {
		for (Human h : humans) {
			if (h == null) {
				break;
			}
			h.printinformation(screen);
		}
		return;
	}
}
