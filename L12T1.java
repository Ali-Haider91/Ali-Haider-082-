package lab12;
import java.util.Scanner;
public class L12T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] array = new int[10];
	        for (int i = 0; i < array.length; i++) {
	            array[i] = (int) (Math.random() * 10);
	        }
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter an index: ");
	        try {
	            int index = input.nextInt();
	            System.out.println("array[" + index + "] = " + array[index]);
	        } catch (IndexOutOfBoundsException ex) {
	            System.out.println("INDEX " + ex.getLocalizedMessage() + " is out of bounds");
	        } catch (Exception ex) {
	            System.out.println("INVALID INPUT");
	        }
	}
}
