import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Entre com o primeiro numero: ");
        int a = sc.nextInt();
        System.out.println("Entre com o segundo numero: ");
        int b = sc.nextInt();
;


        if (a >= b){
            System.out.println("O numero maior foi " + a);
        }else

            System.out.println("O numero maior foi: " + b);
    }
}
