package problem1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read a value. Print out from 1 to the input
		Scanner in=new Scanner(System.in);
		int value=in.nextInt();
		int counter=1;
		if (counter<=value) {
			while (counter<=value) {
				System.out.println(counter);
				counter++;
			}
		}else {
			while (counter>=value) {
				System.out.println(counter);
				counter--;
			}
		}
	}

}
