package asteric.in.Day2.model;

public class User {

	private int rollno;
	private String uname;
	private String address;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public User(int rollno, String uname, String address) {
		super();
		this.rollno = rollno;
		this.uname = uname;
		this.address = address;
	}


	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "User [rollno=" + rollno + ", uname=" + uname + ", address=" + address + "]";
	}



}




