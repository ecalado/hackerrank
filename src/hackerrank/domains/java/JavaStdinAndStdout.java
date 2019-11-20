package hackerrank.domains.java;
import java.util.Scanner;

public class JavaStdinAndStdout {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int a = scan.nextInt();
            System.out.println(a);
        }
        scan.close();
    }
}

