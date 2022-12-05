package javaarrays;
import java.util.Scanner;


public class Test4 {
	
	static void show() {
		int arr[] = {10,20,30,40,50};
		int newarr[] = arr.clone();
		for(int i: newarr) {
			System.out.println(i);
			}
		//System.out.println(arr == newarr);
	} 
	
	
	
	

	public static void main(String[] args) {
		/*
		
		int arr[] = {10,20,30,40,50};
		int newarr[] = arr.clone();
		for(int i: newarr) {
		System.out.println(i);
		}
		System.out.println(arr == newarr);*/
		
		show();
		System.out.println("-----------");
		show();
		
	}

}
