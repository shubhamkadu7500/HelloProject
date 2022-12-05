package javafilehandling;
import java.io.File;
import java.io.FileWriter;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File obj = new File("info.txt");
		System.out.println("file has been created! " + obj.getAbsolutePath());
		System.out.println(obj.getName());
		
		try {
			FileWriter writer = new FileWriter(obj);
			writer.write("Welcome To Java - File Handling !!! \nmy name is shubham");
			System.out.println("writte into file successfully");
			writer.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
