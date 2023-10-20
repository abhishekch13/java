public class Pn {
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number=");
        n=sc.nextInt();
        sc.close();
        if(n<0)
        {
          System.out.println("it is a negative number");
         }
        else{
            System.out.println("it is positive number");
        }
    }
     
}
