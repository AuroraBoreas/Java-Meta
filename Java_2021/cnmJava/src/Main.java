import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n=== Get Started ===");
		System.out.println("hello TS");
		System.out.println("hello SCY");

		System.out.println("\n=== Variable ===");
		/*
		 * [ variable ]
		 * ===
		 * primitive types(meta data): CSIL FD BBD
		 * ===
		 */
		int x0; x0 = 69;
		String rv = String.format("x0 = %s", x0);
		System.out.println(rv);
		
		String x = "TS";
		String y = "ZL";
		System.out.println(String.format("before swap, x = %s, y = %s", x, y));
		String tmp = x;
		x = y;
		y = tmp;
		System.out.println(String.format("after swap,  x = %s, y = %s", x, y));
		
		/*
		 * [ iostream ]
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		// String name = scanner.nextLine();
		// System.out.println(String.format("hello %s", name));
		scanner.close();
		
		System.out.println("\n=== Variable ===");
		/*
		 * [ statement ]
		 * ===
		 * A
		 * R
		 * L
		 * A
		 * B
		 * A
		 * C
		 * O
		 * O
		 * ===
		 * */
		int x1 = 69, y1 = 42;
		System.out.println(String.format("x=%s, y=%s; x+y : %s", x1, y1, x1 + y1));
		System.out.println(String.format("x=%s, y=%s; x-y : %s", x1, y1, x1 - y1));
		System.out.println(String.format("x=%s, y=%s; x*y : %s", x1, y1, x1 * y1));
		System.out.println(String.format("x=%s, y=%s; x/y : %s", x1, y1, x1 / y1));
		System.out.println(String.format("x=%s, y=%s; x%%y : %s", x1, y1, x1 % y1));
		
		System.out.println("\n=== GUI ===");
		/*
		 * [ GUI ]
		 * ===
		 * using javax.swing.JOptionPane
		 * ===
		 * */
		String name = JOptionPane.showInputDialog("Enter your name: ");
		JOptionPane.showMessageDialog(null, "hello " + name);
		
	}

}
