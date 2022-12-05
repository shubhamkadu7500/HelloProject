package javafilehandling;

import java.io.File;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File obj = new File("info.txt");
		if(obj.delete()) {
			System.out.println("the deleted file is: "+obj.getName());
		}else {
			System.out.println("failed to delete the file _ _ _");
		}

	}

}
