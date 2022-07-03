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
public class MergeSort implements AlgoritimosOrdenacao {
    
    @Override
    public void sort(int[] vet) {

        int posIni = 0, posFim = vet.length - 1;
        merge(vet, posIni, posFim);

    }

    private void merge(int[] vet, int posIni, int posFim) {

        int meio;
        if (posIni < posFim) {
            meio = (posIni + posFim) / 2;
                       
            //Chamada recursiva parte esquerda
            merge(vet, posIni, meio);
             
            //Chamada recursiva parte direita
            merge(vet, meio + 1, posFim);
             
            //Chamar a função intercala
            intercala(vet, posIni, posFim, meio);
             
        }
    }

    private void intercala(int[] vet, int posIni, int posFim, int meio) {

        int posLivre, i, j;
        int aux[] = new int[vet.length];

        i = posIni;
        j = meio + 1;
        posLivre = posIni;

        while (i <= meio && j <= posFim) {

            if (vet[i] <= vet[j]) {
                aux[posLivre] = vet[i];
                i++;
            } else {
                aux[posLivre] = vet[j];
                j++;
            }
            posLivre++;

        }

        /**
         * Se ainda existem números no primeiro vetor que não 
         * foram intercalados
         */
        for (int k = i; k <= meio; k++) {
            aux[posLivre] = vet[k];
            posLivre++;
        }
        
        /**
         * Se ainda existem números no segundo vetor que não 
         * foram intercalados
         */
        for (int k = j; k <= posFim; k++) {
            aux[posLivre] = vet[k];
            posLivre++;
        }
        
        // Retorna os valores do vetor aux para o vetor vet
        for (int k = posIni; k <= posFim; k++) {
            vet[k] = aux[k];
        }

    }
    
   
}
