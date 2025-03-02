public class Metodos {

    //LOGICA - FINALIDADE DO MÉTODO
    /* public double somar(int num1, int num2){

        return ... ;
    }
    */


    //LOGICA - FINALIDADE DO MÉTODO
    //AQUI NÃO PRECISA DO RETURN
    //POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
    /*
      public void imprimir (String texto){
      }
     */


     

    //throws Exception : indica que o método ao ser utlizado
    //poderá gera uma exeção
    /*
     public double dividir(int dividendo, int divisor) throw Exception{}
     */


     //Este método não pode ser visto por outras classes no programa
     /*
      private void metodoPrivado(){}
      */



      //alguns equívocos estruturais
      //este método deveria retornar algum valor
      //no caso boolean (true ou false)
      /*
       public void validar()
       */


       //um método deve representar uma única resposabilidade
       /*
        *public void calcularEnviar
        */


        //este método tem a finalidade de gravar informações de um cliente, por que não criar um objeto cliente e passar como parâmetro?
        /*
         public void gravarCliente(String nome, String cpf)
         */

         /*
          * public void gravarCliente (Cliente cliente){}
          ou
          * public void gravar(Cliente cliente){}
          */
}
