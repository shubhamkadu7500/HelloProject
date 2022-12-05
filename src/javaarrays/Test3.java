package javaarrays;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] frmarr = {'a','b','c','d','e','f'};
		char[] toarr = new char[6];
		
		System.arraycopy(frmarr, 0, toarr, 0, 5);
		System.out.println(String.valueOf(toarr));
		//System.arraycopy(frmarr, 0, toarr, 3, 1);
		//System.out.println(String.copyValueOf(toarr));
		
		System.out.println("-------------------");
		
		String[] shubham = {"shujeet" , "manoj", "rushi","radha"};
		String[] kadu = new String[4];
		System.arraycopy(shubham, 0, kadu, 0, 1);
		
		for(int i=0; i<kadu.length; i++) {
			System.out.println(kadu[i]);
		}
		
		

	}

}
