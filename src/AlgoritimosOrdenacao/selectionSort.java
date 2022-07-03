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
public class selectionSort implements AlgoritimosOrdenacao{
    
    
    @Override
    public void sort (int vetor[]){
        
        for(int i = 0; i < vetor.length - 1; i++){  
            
            int buscaMenor = i;
            
            for (int j = i + 1; j < vetor.length; j++){
                
                if(vetor[j] < vetor[buscaMenor]){
                    
                    buscaMenor = j;
                }
                
            }
               
             int menor = vetor[buscaMenor];
             vetor[buscaMenor] = vetor[i];
             vetor[i] = menor;
            
        }
        
       
        
    }
}
    
    

