package CSES;


import java.util.*;

public class Missingnum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long n=sc.nextLong();
        long[] a = new long[(int) n];
        long sum=0;
        for(int i=0;i<n-1;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        long b = (n*(n+1)/2);
        System.out.println(b-sum);
    }
}
