import java.util.Scanner;
import java.io.*;
public class TestPerson{
	public static void main(String [] args){
		Person [] p = new Person[7];
		p[0] = new Person("aegr","awpgoih");
		p[1] = new Person("gq\n","owqgoh");
		p[2]= new Person(p[0]);
		p[3]= new Person(p[1]);
		p[4]= new OCCCPerson(p[2],"IDENTIFICATION");
		p[5]= new OCCCPerson(p[4],"qwghtu4qt4h4p");
		p[6] = new OCCCPerson(p[3],"identity");
		
		for(Person i:p){
			System.out.println(i.toString());
		}
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a file:\n");
		String f = new String (in.nextLine());
		
		
		
		
		System.out.println("Reading from file \n");
		Person [] q = new Person[p.length];
		try{
			FileInputStream fin = new FileInputStream(f);
			ObjectInputStream oin = new ObjectInputStream(fin);
			Object o;
			for(int i = 0; i < p.length;i++){
				o = oin.readObject();
				if(o.getClass().equals(OCCCPerson.class)){
					System.out.println("index "+i+": OCCCPerson");
					q[i] = (OCCCPerson) o;
				}
				if(o.getClass().equals(Person.class)){
					System.out.println("index "+i+": Person");
					q[i] = (Person) o;
				}
			}
		}catch(Exception e){
			System.out.println("IT IS BROKEN\n");
			System.out.println(e.toString());
		}
		System.out.println("\n");
		for(Person i:q){
			System.out.println(i.toString());
		}
	}
}