import java.util.Scanner;
public class ex3 {

    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       System.out.print("n= ");
       int n = in.nextInt();
       int fib=1;
       int fibvech=0;
       int aux;
       if(n>=0)
           System.out.print(0+" ");
       do{
           System.out.print(fib + " ");
           aux=fib;
           fib=fib+fibvech;
           fibvech=aux;



       }while(fib<=n);
    }
}
