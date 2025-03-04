public class CondicionalEncadeada {
    public static void main(String[] args) {

        //"if" se | "else if" senao se | "else" senao
        
        int nota = 6;

        if(nota >= 7)
            System.out.println("Aprovado");

        else if(nota >= 5 && nota < 7)  //"&&" significa "E"
            System.out.println("Prova Recuperação");

        else
            System.out.println("Reprovado");
    }
}
