/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritimosOrdenacao;

/**
 *
 * @author Lucas Eduardo
 */
public class bubbleSort implements AlgoritimosOrdenacao {

    /**
     * @param vetor
     * @param args the command line arguments
     */
    
    @Override
    public void sort(int vetor[]){
        
        int i, j, aux;
        boolean troca = true;
        for(i = 0; i <= vetor.length && troca; i++){
            troca = false;
            for(j = 0; j < vetor.length - 1; j++){
                if (vetor[j] > vetor[j + 1]){
                    troca = true;
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
                
            }
        }
        
    }
    
    public void bSortInverse(int vetor[]){
        
        int i, j, aux;
        
        for(i = 0; i <= vetor.length; i++){
            for(j = 0; j < vetor.length - 1; j++){
                if (vetor[j] < vetor[j + 1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
                
            }
        }
        
    }
    
}
