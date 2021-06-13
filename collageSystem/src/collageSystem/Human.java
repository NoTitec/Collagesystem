package collageSystem;

public class Human {
	private int id;
	private String name;
	private String department;
	private String phonenum;
	
	Human(){
		
	}
	
	public void printinformation(Screen screen) {
		System.out.println(id);
		System.out.println(name);
		System.out.println(department);
		System.out.println(phonenum);
	}
	
	public int getid() {
		return 0;
	}
	
	public String getname() {
		return "";
	}
	
}

class Professor extends Human{
	private int id;
	private String name;
	private String department;
	private String phonenum;
	private String Major;
	private int OfficeId;
	Professor(){
		
	}
	public int getid() {
		return this.id;
	}
	public String getname() {
		return this.name;
	}
	void setinfo(int id,String name,String depart,String pnum,String Major,int Onum){
		this.id=id;
		this.name=name;
		this.department=depart;
		this.phonenum=pnum;
		this.Major=Major;
		this.OfficeId=Onum;
	}
	public void printinformation(Screen screen) {
		System.out.println(id);
		System.out.println(name);
		System.out.println(department);
		System.out.println(phonenum);
		System.out.println(Major);
		System.out.println(OfficeId);
	}
}

class Worker extends Human{
	private int id;
	private String name;
	private String department;
	private String phonenum;
	private String Position;
	private int OfficeId;
	Worker(){
		
	}
	public int getid() {
		return this.id;
	}
	public String getname() {
		return this.name;
	}
	void setinfo(int id,String name,String depart,String pnum,String Position,int Onum){
		this.id=id;
		this.name=name;
		this.department=depart;
		this.phonenum=pnum;
		this.Position=Position;
		this.OfficeId=Onum;
	}
	public void printinformation(Screen screen) {
		System.out.println(id);
		System.out.println(name);
		System.out.println(department);
		System.out.println(phonenum);
		System.out.println(Position);
		System.out.println(OfficeId);
	}
}

class Student extends Human{
	private int id;
	private String name;
	private String department;
	private String phonenum;
	private int grade;
	Student(){
		
	}
	public int getid() {
		return this.id;
	}
	public String getname() {
		return this.name;
	}
	void setinfo(int id,String name,String depart,String pnum,int grade){
		this.id=id;
		this.name=name;
		this.department=depart;
		this.phonenum=pnum;
		this.grade=grade;
	}
	public void printinformation(Screen screen) {
		System.out.println(id);
		System.out.println(name);
		System.out.println(department);
		System.out.println(phonenum);
		System.out.println(grade);
		
		
	}
}