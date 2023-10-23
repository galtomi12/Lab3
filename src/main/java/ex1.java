import java.util.Arrays;

public class ex1 {

    public static void main(String[] args)
    {
        String[] cuvinte1={"avion", "mouse","monitor","cablu"};
        String[] cuvinte2={"mouse","mere","telefon","copac"};

        for(int i=0;i<cuvinte1.length;i++){
            for(int j=0;j<cuvinte2.length;j++) {
                if(cuvinte1[i]==cuvinte2[j])
                    System.out.print(cuvinte1[i]);
            }
        }

    }
}
