import java.util.Scanner;
public class ex4 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("n= ");
        int n = in.nextInt();
        int aux=n;
        int pol=0;
        while(aux!=0)
        {
            pol=pol*10+aux%10;
            aux=aux/10;
        }
        if(pol==n)
            System.out.print("Numarul "+n+" este un polindrom");
        else System.out.print("Numarul "+n+" nu este un polindrom");
    }
}
