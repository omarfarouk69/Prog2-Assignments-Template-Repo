/*omar mohamed 20216007*/
import java.util.*;
public class first{
    public static void main(String[]args){
        System.out.println("choose the size of array :");
        Scanner sc=new Scanner(System.in);
        int length , searching;
        length=sc.nextInt();    
        int [] arr = new int[length];   
        System.out.println("insert numbers in the array :"); 
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();    
        }
        System.out.println("insert element to search on"); 
        searching=sc.nextInt();
        for(int i=0 ; i < arr.length ; i++){
            if(i != length-1)
            {
                if(arr[i] == searching) {
                    System.out.println(i);
                    break;
                }
                else continue;
            }
            else
            {
                if(arr[i] == searching)System.out.println(i);
                else System.out.println("-1");
            }
        }
    }
}