package Array2;

public class B {
	// Ascending Order
	public static void main(String[] args) {
		int a[]= {5,8,1,4,3};
		for(int i=0; i<a.length;i++) {

			for(int j = 0;j<a.length;j++ ) {
				if(a[i]<a[j]) {
					a[i]=a[j]+a[i];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}

		for(int aa=0;aa<a.length;aa++) {
			System.out.print(a[aa]+" ");
		}
	}
}
