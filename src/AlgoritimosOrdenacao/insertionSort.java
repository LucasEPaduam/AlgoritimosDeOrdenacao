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
public class insertionSort implements AlgoritimosOrdenacao{
    
    @Override
    public void sort (int vetor[]){
        
        for (int i = 1; i < vetor.length; i++){
            
            int selectValue = vetor[i];
            int j = i - 1;
            
            while(j > -1 && vetor[j] > selectValue){
                
                vetor[j + 1] = vetor[j];
                j--;                
            }
            
            vetor[j + 1] = selectValue;
            
            
        }
        
        
        
        
        
    }
    
    
    
    
    
    
}
