
import java.util.Scanner;

public class Even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] i = {1, 2, 3, 4, 5, 6};
        for (int j : i) {
            if (j % 2 == 0) {
                System.out.print(j + " is Even ");
            } else {
                System.out.print(j + " is Odd ");
            }
        }
    }
}
