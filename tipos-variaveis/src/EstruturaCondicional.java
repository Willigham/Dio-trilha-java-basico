public class EstruturaCondicional {
    public static void main(String[] args) {

        //Espressão pra saber se valor é True ou False;

        int a, b;
        
        a = 5;
        b = 6;
        String resultado = "";

        /*EXEMPLO ALTERNATIVO

        String resultado = a==b ? "verdadeiro" : "falso";
         
         */


        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);

    }
}
