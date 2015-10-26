import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;


public class PersonManager extends JFrame{
	
	JPanel p = new JPanel();
	
	public static void main(String [] args){
		PersonManager window = new PersonManager();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("Zane Gray Homework Week 8");
		window.setSize(400,400);
	}
	public PersonManager(){
		p.setLayout(new BorderLayout());
		p.add(new Menu() ,BorderLayout.NORTH);
	
		add(p);
		
	}
	
	public void writeGroup(Person [] p){
		String s = "";
		JOptionPane.showMessageDialog(null, "Attempting to write file");
			try{
				FileOutputStream fout = new FileOutputStream(s);
				ObjectOutputStream oout = new ObjectOutputStream(fout);
			for(int i = 0; i < p.length; i++){
				oout.writeObject(p[i]);
				
			}
			oout.close();
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, "Write failed\n"+e.toString());
		}
	}
	
	public static void readGroup(){
		
	}
	public static void writeFile(){
		
	}
	public static void readFile(){
		
	}
}
class Menu extends JMenuBar{
	JMenuItem items [] = new JMenuItem []{
		new JMenuItem("New"),
		new JMenuItem("Open..."),
		new JMenuItem("Exit")
	};
	public Menu(){
		JMenu FileMenu = new JMenu("File");
	
			
		for(int i = 0; i < items.length; i++){
			items[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(e.getSource()==items[0]){
						PersonManager.writeFile();	
					}	
					if(e.getSource()==items[1]){
						PersonManager.readFile();
					}
					if(e.getSource()==items[2]){
						System.exit(0);
					}
				}
			});
			FileMenu.add(items[i]);
		}
		add(FileMenu);
	}
	
}