public class CondicaoTernaria {

    public static void main(String[] args) {

        //Simplificando o codigo "if | else" e deixando mais limpo

        /*
        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
         */

         int nota = 6;
         String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);



    }
}
