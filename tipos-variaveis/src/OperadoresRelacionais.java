public class OperadoresRelacionais {
    public static void main(String[] args) {
        
        /*
         * == Quando desejamos verificar se uma variavel é IGUAL A outra.
         * != Quando desejamos verificar se uma variavel é DIFERENTE da outra.
         * > Quando desejamos verificar se uma variavel é MAIOR QUE a outra.
         * >= Quando desejamos verificar se uma variavel é MAIOR OU IGUAL a outra.
         * < Quando desejamos verificar se uma variavel é MENOR QUE a outra.
         * <= Quando desejamos verificar se uma variavel é MENOR OU IGUAL a outra.
         */

         int numero1 = 2;
         int numero2 = 2;

         boolean simNao = numero1 == numero2;

         if(numero1 == numero2){
            System.out.println("Sim, é verdadeira.");
         }
         else
            System.out.println("Não, é falso.");

         System.out.println("numeroUm é igual a numeroDois? " + simNao);

         simNao = numero1 != numero2;

         System.out.println("numeroUm é igual a numeroDois? " + simNao);
         
         simNao = numero1 > numero2;

         System.out.println("numeroUm é igual a numeroDois? " + simNao);

         simNao = numero1 >= numero2;

         System.out.println("numeroUm é igual a numeroDois? " + simNao);

         simNao = numero1 < numero2;

         System.out.println("numeroUm é igual a numeroDois? " + simNao);

         simNao = numero1 <= numero2;

         System.out.println("numeroUm é igual a numeroDois? " + simNao);

         /*
            Para comparar se dois objetos sao iguais "String = String" é utilizado "equals";
        */

        String nomeUm = "Willigham";
        String nomeDois = "Willigham";
         
        System.out.println(nomeUm.equals(nomeDois));
        //O resultado foi "True" pois o nome é igual.
        
    }
}
