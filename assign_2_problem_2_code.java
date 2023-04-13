/*omar mohamed farouk 20216007*/
import java.util.Scanner; 

class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number\n");
        int x = sc.nextInt();
        for(int i=1;i<=12;i++)
        {
            System.out.println(x+"*"+i+"="+x*i);
        }
    }
    
}
