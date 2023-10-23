import java.util.Arrays;

public class ex2 {

    public static void main(String[] args)
    {
        int[] numere1={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int i=0;i<numere1.length;i++)
        {
            if(numere1[i] == 1)
                System.out.print("Numarul 1 nu este prim\n");
           else if(numere1[i] % 2 == 0)
                System.out.print("Numarul "+ numere1[i] +" nu este prim\n");
           else
            {
                int pr=2;
                for (int j=3;j<numere1[i]/2 && pr==2; j=j+2)
                {
                    if(numere1[i]%j == 0)
                        pr++;
                }
                if(pr==2)
                    System.out.print("Numarul "+numere1[i] +" este prim\n");
                else
                    System.out.print("Numarul "+ numere1[i] +" nu este prim\n");
            }
        }



    }
}
