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
public class QuickSort implements AlgoritimosOrdenacao {
    
   
    @Override
    public void sort(int vet[]) {
        int p = 0, r = vet.length - 1;
        quickSort(vet, p, r);
    }

    private void quickSort(int[] vet, int p, int r) {

        int q;
        if (p < r) {
            q = particao(vet, p, r);
            quickSort(vet, p, q);
            quickSort(vet, q + 1, r);
        }
    }

    private int particao(int[] vet, int p, int r) {

        int pivo, i, j;

        pivo = vet[(p + r) / 2];
        i = p - 1;
        j = r + 1;
        while (i < j) {
            //Analisar à direita
            do {
                j--;
            } while (pivo < vet[j]);

            // Analisar à esqueda
            do {
                i++;
            } while (pivo > vet[i]);
            
            //Verificar troca
            if (i < j) {
                troca(vet, i, j);
            }
        }
        return j;
    }

    private void troca(int[] vet, int i, int j) {
        int aux = vet[i];
        vet[i] = vet[j];
        vet[j] = aux;
    }

}
