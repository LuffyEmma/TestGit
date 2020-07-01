package Array2;

public class C {

	public static void main(String[] args) {
		
		int a[]= {1, 6, 8, 1, 9, 4, 3};
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a.length;j++) {
				
				if(a[i]>a[j]) {
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		
	}
	
}
