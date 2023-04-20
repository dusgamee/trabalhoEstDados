package unipar.br.trabalhoestdados;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        
    String input;
    
       input = JOptionPane.showInputDialog("Informe o tamanhanho do vetor ");
       int tam = Integer.parseInt(input);
       
       int vetor[] = new int[tam];
       
       for(int i=0;i<vetor.length;i++){
           String input1 = JOptionPane.showInputDialog(null, "Informe um numero");
            int numero = Integer.parseInt(input1);
            vetor[i] = numero;
       }
       input =  JOptionPane.showInputDialog("Escolha qual forma de ordenacao"
               + "que deseja usar \n 1-Ordenacao Selecao \n 2-Ordenacao Insercao \n 3-Ordenacao Bolha");
       int fr = Integer.parseInt(input);
       
       if(fr == 1){
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
            
        }String message = "Os numeros informados sao \n";
        for(int i = 0; i < vetor.length; i++){
            message += vetor[i];
            
            
        } 
        JOptionPane.showMessageDialog(null, message);
       }
       
       
       
       
       
    
        
        
        
        
        
        
        
        
        
    }
}
