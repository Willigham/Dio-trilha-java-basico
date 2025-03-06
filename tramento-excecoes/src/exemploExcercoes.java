import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class exemploExcercoes {
    public static void main(String[] args) throws Exception {


        //Criando obejto scanner

        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe seu nome: ");
        String nome = scanner.next();


        System.out.println("Informe seu sobrenome: ");
        String sobrenome = scanner.next();


        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();


        System.out.println("Informe sua altura: ");
        double altura = scanner.nextDouble();

        //Imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();
        }
        catch(InputMismatchException e ){
            System.out.println("O campos idade e altura precisam ser numéricos");
        }
    }
}
