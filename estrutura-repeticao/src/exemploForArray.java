public class exemploForArray {
    public static void main(String[] args) {
        
        //Laço FOR é utilizado pra instrução "ATE QUE"

        String alunos [] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
        /* 
        for( int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        */

        //FORMA MAIS AGRADAVEL
        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
        }
    }

