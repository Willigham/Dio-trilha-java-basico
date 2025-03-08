public class ParametrosInvalidosException extends Exception {
    public String mensagem;
    ParametrosInvalidosException(){
        this.mensagem = "O segundo parâmetro deve ser maior que o primeiro";
    }
}
