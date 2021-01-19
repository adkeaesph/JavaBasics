package NonAccessModifiers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class TransientExample {
	
	public static void main(String[] args) throws Exception {
		Student student = new Student();
		student.setName("Ram");
		student.setDateOfBirth(new Date("1997/11/07"));
		student.setPassword("ram123");
		
		System.out.println(student);
		
		FileOutputStream fos = new FileOutputStream("abc.txt"); 
        ObjectOutputStream oos = new ObjectOutputStream(fos); 
        oos.writeObject(student); 
        oos.close();
  
        // de-serialization 
        FileInputStream fis = new FileInputStream("abc.txt"); 
        ObjectInputStream ois = new ObjectInputStream(fis); 
        student = (Student)ois.readObject();
        ois.close();
        System.out.println("Student's age before invoking get method = "+student.getAge());
        System.out.println(student);
        
        //static and final cancels the effect of transient; however no compilation error 
        //if transient is used with either static or final 
	}
}
