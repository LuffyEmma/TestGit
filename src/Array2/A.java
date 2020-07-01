package Array2;
import java.util.*;

public class A {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int a[] = {5,7,1,4,6,10,13};
		System.out.println("Enetr Value : ");
		
		int choice =sc.nextInt();
		boolean flag =true;
		for(int i =0;i<a.length;i++) {
			
			if(choice == a[i]) {
				System.out.println("Element  Present");
				flag = false;
			}
		}
		if(flag) {
			System.out.println("Element Not Present");
		}
		sc.close();
	}
	

}