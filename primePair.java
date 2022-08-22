import java.util.Scanner;

public class primePair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number till where the pairings should be displayed : ");
        int upperLimit = sc.nextInt();
        primePairs(upperLimit);

    }
    public static void primePairs(int upperLimit) {
        if (upperLimit > 1) {
            System.out.print("2,3"+" _ ");                  //special case
            for (int i = 1; i <= upperLimit; i++) {
                if ((Main.isPrimeSqrtN(i) && Main.isPrimeSqrtN(i + 2))) {
                    System.out.print(i + "," + (i + 2)+" _ ");
                }
            }

        } else {
            System.out.println("No pairs found!");
        }
    }
}
