public class Pluspattern {
    public static void main(String[] args) {
        int i,j,aux;
        Scanner sc = new Scanner(System.in);
        aux = sc.nextint();
        for(i=0;i<=aux;i++){
            for(j=0;j<=aux;j++){
                if(aux/2!=i){
                    if(aux/2==j){
                        System.out.print("+")
                    }
                }
            }
        }
        

    }
    
}
