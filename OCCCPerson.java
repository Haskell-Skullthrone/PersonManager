public class OCCCPerson extends Person{
	protected String studentID;
	public 	OCCCPerson(String fn, String ln, String sid){
		super(fn,ln);
		studentID = sid;
	}
	public OCCCPerson(Person p, String sid){
		super(p);
		this.studentID = new String(sid);
	}
	public OCCCPerson(OCCCPerson p){
		super(p.getLastName(),p.getFirstName());
		this.studentID = p.getStudentID();
	}
	public String getStudentID(){
		return studentID;
	}
	@Override 
	public String toString(){
		return super.toString() + ": "+studentID;
	}
}
