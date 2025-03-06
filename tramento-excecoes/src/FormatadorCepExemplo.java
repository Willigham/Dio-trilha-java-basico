public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try{
        String cepFormatado = formatarCep("2376506");
        System.out.println(cepFormatado);
    }   catch(cepInvalidoExcercicio e){
        e.printStackTrace();
    }
}
    static String formatarCep(String cep) throws cepInvalidoExcercicio{
        if (cep.length() != 8) 
            throw new cepInvalidoExcercicio();
            
            //simulando um cep formatado
            return "23.765-064";
        
    }
}
