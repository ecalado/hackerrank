package hackerrank.domains.java;
import java.util.Scanner;

class JavaLoopsII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            Double result = a + Math.pow(2, 0)*b;
            for (int j=1; j < n; j++) {
            	System.out.print(result.longValue() + " ");
            	result += Math.pow(2, j)*b;
            }
            System.out.println(result.longValue());
        }
        in.close();
    }
}

