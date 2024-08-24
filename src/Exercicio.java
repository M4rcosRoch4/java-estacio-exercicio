import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String cliente;
        int idade = 0;
        float compra = 0;
        float cashback = 0;

        System.out.print("Informe seu Nome: \n");
        cliente = ler.next();
        System.out.print("Informe sua Idade: \n");
        idade = ler.nextInt();
        System.out.print("Informe valor da Compra: \n");
        compra = ler.nextFloat();

        if (idade >= 21 && compra < 1000) {
            System.out.print("Cashback 5% \n");
            cashback = compra * 0.05f;
        } else {
            System.out.println("DEBUG: Condições do if não foram atendidas.");
        }

        if (idade < 21 && compra < 1000) {
            System.out.print("Cashback 7% \n");
            cashback = compra * 0.07f;
        } else {
            System.out.println("DEBUG: Condições do if não foram atendidas.");
        }

        if (idade >= 21 && compra > 1000) {
            System.out.print("Cashback 7% \n");
            cashback = compra * 0.07f;
        } else {
            System.out.println("DEBUG: Condições do if não foram atendidas.");
        }

        if (idade < 21 && compra > 1000) {
            System.out.print("Cashback 10% \n");
            cashback = compra * 0.1f;
        } else {
            System.out.println("DEBUG: Condições do if não foram atendidas.");
        }


        System.out.print("Nome do Cliente: "+ cliente + "\n");
        System.out.print("Idade do Cliente: "+ idade + "\n");
        System.out.print("Sua compra tem o valor de: "+ compra + "\n");
        System.out.print("Cashback: "+ cashback + "\n");

    }
}