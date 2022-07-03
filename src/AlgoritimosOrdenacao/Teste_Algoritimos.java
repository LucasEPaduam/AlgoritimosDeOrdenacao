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
public class Teste_Algoritimos {
    
    public static void main (String[]args){
        
        
        // QUICK SORT
        
        long startQ = System.nanoTime();
        QuickSort q = new QuickSort();
        
        int vetorQuick [] = {53,74,22,13,99,61,1,4,13,15,7};
        
        System.out.print("QUICK SORT\n");
        
        q.sort(vetorQuick);
        
        for(int v : vetorQuick){
            
            System.out.print(v + " ");
        }
        long elapsedQ = System.nanoTime() - startQ;
        System.out.println("\nTEMPO: " + elapsedQ);
        System.out.print("\n**************\n");
        
        
        
       
        
        // MERGE SORT
        
        long startM = System.nanoTime();
        AlgoritimosOrdenacao m = new MergeSort();
        
        int vetorMerge [] = {6, 8, 3, 1, 12, 9};
        System.out.print("MERGE SORT\n");
        
         m.sort(vetorMerge);
        for(int v : vetorMerge){
            
            System.out.print(v + " ");
        }
        long elapsedM = System.nanoTime() - startM;
        System.out.println("\nTEMPO: " + elapsedM);
        System.out.print("\n**************\n");
        
        
        // BUBBLE SORT
        
        long start = System.nanoTime();
        bubbleSort b = new bubbleSort();
        
        System.out.print("\n\nBUBBLE SORT\n");
        
        int vetor [] = {6, 8, 3, 1, 12, 9};
        
        b.sort(vetor);
        for(int v : vetor){
            
            System.out.print(v + " ");
        }
        
        System.out.print("\n**************\n");
        System.out.print("BUBBLE SORT INVERSE\n");
        
        b.bSortInverse(vetor);
        for(int in : vetor){
            
            System.out.print(in + " ");
        }
        long elapsed = System.nanoTime() - start;
        System.out.println("\nTEMPO: " + elapsed);
        
        
        // SELECTION SORT
        
        long start2 = System.nanoTime();
        
        AlgoritimosOrdenacao s = new selectionSort();
        
        System.out.print("\n*************\n");
        System.out.print("SELECTION SORT\n");
        
        int vetorSel [] = {55,43,74,99,22,13,56,77,89,2,17};
        
        for(int v1 : vetorSel){
            
            System.out.print(v1 + " ");
        }
        
        System.out.print("\n*************\n");
        
        
        s.sort(vetorSel);
        for(int v2 : vetorSel){
            
            System.out.print(v2 + " ");
        }
        
        long elapsed2 = System.nanoTime() - start2;
        System.out.println("\nTEMPO: " + elapsed2);
        
        
        // INSERTION SORT
        
        long start3 = System.nanoTime();
        
        AlgoritimosOrdenacao i = new insertionSort();
        
        System.out.print("\n*************\n");
        System.out.print("INSERTION SORT\n");
        
        int vetorIn [] = {140,120,166,165,123,304,255,111,102};
        
        for(int v3 : vetorIn){
            
            System.out.print(v3 + " ");
        }
        
        System.out.print("\n*************\n");
        
        
        i.sort(vetorIn);
        for(int v3 : vetorIn){
            
            System.out.print(v3 + " ");
        }
        
        long elapsed3 = System.nanoTime() - start3;
        System.out.println("\nTEMPO: " + elapsed3);
        
    }   
}
    

