package javadsa;
import java.util.*;

public class Binanrtysumission {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a binary number:");
        String binaryString = sc.nextLine();
        System.out.println("Enter the second binanry number:");
        String binaryString2 = sc.nextLine();
        int a = Integer.parseInt(binaryString);
        int b = Integer.parseInt(binaryString2);
        int sum = a + b;    
        String binarySum = Integer.toBinaryString(sum);
        System.out.println("The sum of the two binary numbers is: " + binarySum);
        sc.close();
    }
}
