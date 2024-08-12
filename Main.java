import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt(); 

        int count = 0;
        int n = 0;

        while (count < y) {
            int term = 3 * n + 2;
            if (term % 4 != 0) {
                System.out.print(term + " ");
                count++;
            }
            n++;
        }
	}
}
