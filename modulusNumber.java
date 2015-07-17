import java.util.Scanner;
 
class modulusNumber {
    public static void main(String args[]) {
		
		System.out.println("Numbers that divide evenly by 5 or 9.");
			      
		for (int i = 1; i <= 100; i++) { 
			if(i % 5 == 0){ 
				System.out.println(i);
			} else if (i % 9 == 0) {
				System.out.println(i);
			}			
		}
	}   
}
