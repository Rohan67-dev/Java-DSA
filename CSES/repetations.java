
import java.util.*;

public class repetations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str=sc.nextLine();

        long max=0,count=1;

        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                if(count>max){
                    max=count;
                    
                }
                count=1;
            }

        }
        if(count>max){
                    max=count;
                    
                }

        System.out.println(max);
        
        sc.close();
    }
}
