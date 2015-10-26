import java.io.*;
public class Person implements Serializable{
protected String firstName;
protected String lastName;
	public Person(String fn, String ln){
		this.firstName = fn;
		this.lastName = ln;
	}
	public String getLastName(){
		return new String(lastName);
	}
	public String getFirstName(){
		return new  String(lastName);
	}
	public void setLastName(String ln){
		lastName = ln;
	}
	public void setFirstName(String fn){
		firstName = fn;
	}
	public Person(Person p){
		this.firstName = p.getFirstName();
		this.lastName = p.getLastName();
	}
	@Override
	public String toString(){
		return lastName+" "+firstName;
	}
}