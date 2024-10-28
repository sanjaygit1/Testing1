package DDT;

public class DebuggingEx {

	public static void main(String[] args) {
		
        int a = 10;
		int b = 20;
//pusg
		int temp;
		temp = a;
		a = b;
		b = temp;

		System.out.println(a);
		System.out.println(b);
	}

}
