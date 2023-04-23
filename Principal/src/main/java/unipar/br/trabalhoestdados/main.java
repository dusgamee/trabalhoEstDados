package unipar.br.trabalhoestdados;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
    long tempob = System.currentTimeMillis();
    long tempos = System.currentTimeMillis();
    long tempoi = System.currentTimeMillis();    
        
        
    String input;
        // solicitando ao usuario o tamanho do vetor
       input = JOptionPane.showInputDialog("Informe o tamanhanho do vetor ");
       int tam = Integer.parseInt(input);
       String message2 = "numeros antes de serrem ordenados \n"; 
       int vetor[] = new int[tam];
       //solicitando os numeros desejados
       
       for(int i=0;i<vetor.length;i++){
           String input1 = JOptionPane.showInputDialog(null, "Informe um numero");
            int numero = Integer.parseInt(input1);
            vetor[i] = numero;
       
            message2 += vetor[i]+"\n";
       }
       
       //solicitando ao usuario qual metodo de ordenacao ele deseja utilizar
       input =  JOptionPane.showInputDialog("Escolha qual forma de ordenacao"
               + "que deseja usar \n 1-Ordenacao Selecao \n 2-Ordenacao Insercao \n 3-Ordenacao Bolha");
       int fr = Integer.parseInt(input);
       //metodo de ordenacao Selecao
       if(fr == 1){
           selecao(vetor);
          JOptionPane.showMessageDialog(null, message2);
       //metodo Insercao
       }else if (fr == 2){
           insercao(vetor);
           JOptionPane.showMessageDialog(null, message2);
       //metodo bolha    
       }else if(fr == 3){
           bolha(vetor);
           JOptionPane.showMessageDialog(null, message2);
        }
    
 
    }
    public static void selecao(int[] vetor){
long inicio = System.currentTimeMillis();
           for (int i = 0; i < vetor.length - 1; i++) {
            int posMenor = i;
            
            for(int j = i+1; j < vetor.length; j++){
                if(vetor[j] < vetor[posMenor]){
                    posMenor = j;
                }
            }
            
            if(posMenor != i){
                int aux = vetor[i];
                vetor[i] = vetor[posMenor];
                vetor[posMenor] = aux;
            }
        //exibindo os resultados da ordenacao    
        }String message = "Os numeros informados sao \n";
        for(int i = 0; i < vetor.length; i++){
            message += vetor[i]+ "|";
            
            
        } 
        long fim = System.currentTimeMillis();
        long tempoExecucaos = fim - inicio;
        JOptionPane.showMessageDialog(null, message +"\n" + "Tempo de execucao: "+tempoExecucaos+".");
        
    }
    
    public static void insercao(int[] vetor) {
    long inicio = System.currentTimeMillis();
    for (int i = 1; i < vetor.length; i++) {
        int chave = vetor[i];
        int j = i - 1;
        while (j >= 0 && vetor[j] > chave) {
            vetor[j+1] = vetor[j];
            j--;
        }
        vetor[j+1] = chave;
    }
    long fim = System.currentTimeMillis();
    long tempoExecucaoi = fim - inicio;
    String message = "Os numeros informados sao \n";
    for (int i = 0; i < vetor.length; i++) {
        message += vetor[i] + "|";
    }
    JOptionPane.showMessageDialog(null, message + "\n" + "Tempo de execucao: " + tempoExecucaoi + ".");
}

    
    public static void bolha(int[] vetor){
        boolean troca = true;
        long inicio = System.currentTimeMillis();

        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }

        long fim = System.currentTimeMillis();
        long tempoExecucaob = fim - inicio;

        String message = "Os numeros informados sao \n";
       for(int i = 0; i < vetor.length; i++){
            message += vetor[i] + "|";
       
       }
       JOptionPane.showMessageDialog(null, message + "\n" + "Tempo de execucao: "+tempoExecucaob+".");
       

    }
}

       
       
       
       
       
    
        
        
        
        
        
        
        
        
 
