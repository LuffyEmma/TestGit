package Array2;

public class D {
	public static void main(String[] args) {

		int a[] = {10, 40, 23, 56, 11, 16, 68, 72, 54};
		int temp = a[0];
		int temp1 = a[0];

		for(int i =0;i<a.length;i++) {
			if(a[i]> temp) {
				temp = a[i];
			}
			else if(a[i]< temp1) {
				temp1 = a[i];
			}
		}
	System.out.println("Maximum value is : "+temp);
	System.out.println("Minimum value is : "+temp1);
	}
}

