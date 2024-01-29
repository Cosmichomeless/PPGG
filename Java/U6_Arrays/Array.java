package Java.U6_Arrays;


public class Array {
	public static void main(String[] args) {
		int a[], b[], c[];
		a = new int[10];
		a[0] = 1;
		System.out.println(a[0]);
		b = a;
		c = a;
		c[0] = 5;
		System.out.println(a[0]);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
