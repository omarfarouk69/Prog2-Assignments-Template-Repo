/*omar mohamed 20216007*/
import java.util.*;
public class first{
    public static void main(String[]args){
        System.out.println("choose the size of aray :");
        Scanner sc=new Scanner(System.in);
        int length;
        length=sc.nextInt();    
        int [] arr = new int[length];   
        System.out.println("insert numbers in the aray :"); 
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();    
        }
        for(int i=0 ; i < length ; i++){
            System.out.println("A["+i+"]"+" = "+arr[i]);
        }
    }
}