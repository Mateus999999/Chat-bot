import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in);

        System.out.println("Olá, pode me chamar de Bill,\nsou o chatbot que irá lhe ajudar no cadastro no Zet,\no portal de comunicação instantânea entre cidadãos e governo.\nQual seu nome ? ");
        String nome = scan.nextLine();
        System.out.println("Olá, " + nome + " Qual sua idade ? ");
        int idade = scan.nextInt();
        System.out.println("então " + nome + " você tem " + idade + " de idade");

    }
}
