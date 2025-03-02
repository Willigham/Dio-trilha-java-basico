public class OperadoresLogicos {
    public static void main(String[] args) {

        /*Os operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões.
        
        && Operador lógico "E"
        || Operador lógico "OU"

        */

        boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições sao verdadeiras");
        }

        if(condicao1 || condicao2){
        System.out.println("Uma das condições é verdadeira");
        }
        
        System.out.println("Fim");
    }
}
