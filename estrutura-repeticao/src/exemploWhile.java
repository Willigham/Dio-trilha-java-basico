import java.util.concurrent.ThreadLocalRandom;
public class exemploWhile {
    public static void main(String[] args) {
        
        //Laço WHILE é ultilizado pra instrução "ENQUANTO"

        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada) 
                valorDoce = mesada;

                System.out.println("Doce do valor: " + valorDoce + " Adiconado no carrinho");
                mesada = mesada - valorDoce;
            }
            System.out.println("Mesada: " + mesada);
            System.out.println("Joãozinho gastou a sua mesada em doces");
            
        }

        private static double valorAleatorio() {
            return ThreadLocalRandom.current().nextDouble(2, 8);
        }

    }


