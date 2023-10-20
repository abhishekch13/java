import java.util.Scanner;

public class eop {
    public static void main(String[] args) {
        int count=0,n;
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in) ;
        n=sc.nextInt();
        while(n!=0){
            n/=10;
            count++;
        }
System.out.println(count);
    }
    
}
