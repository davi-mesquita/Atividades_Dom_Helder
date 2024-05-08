// Implemente um método que receba como parâmetro um vetor do tipo double e preencha
// o vetor com valores aleatórios em todas as posições.

package Ordenacao_Prt1;

import java.util.Random;

public class Exercicio {
    public static void preencherVetor(double[] vetor) {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextDouble() * 10;
        }
    }

    public static void imprimirVetor(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    public static void main(String[] args) {
        double[] vetor = new double[10];
        preencherVetor(vetor);
        imprimirVetor(vetor);
        bubbleSort(vetor);
        println("Bubble Sort");
        imprimirVetor(vetor);
        selectionSort(vetor);
        println("Selection Sort");
        imprimirVetor(vetor);
        insertionSort(vetor);
        println("Insertion Sort");
        imprimirVetor(vetor);
    }

    public static void bubbleSort(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    double aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    public static void selectionSort(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            double aux = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = aux;
        }
    }

    public static void insertionSort(double[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            double aux = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }
    }

    public static void mergeSort(double[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
    }

    public static void merge(double[] vetor, int inicio, int meio, int fim) {
        double[] vetorAux = new double[vetor.length];
        for (int i = inicio; i <= fim; i++) {
            vetorAux[i] = vetor[i];
        }
        int i = inicio;
        int j = meio + 1;
        int k = inicio;
        while (i <= meio && j <= fim) {
            if (vetorAux[i] < vetorAux[j]) {
                vetor[k] = vetorAux[i];
                i++;
            } else {
                vetor[k] = vetorAux[j];
                j++;
            }
            k++;
        }
        while (i <= meio) {
            vetor[k] = vetorAux[i];
            i++;
            k++;
        }
    }

    public static void quickSort(double[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }

    public static int separar(double[] vetor, int inicio, int fim) {
        double pivo = vetor[inicio];
        int i = inicio + 1;
        int f = fim;
        while (i <= f) {
            if (vetor[i] <= pivo) {
                i++;
            } else if (pivo < vetor[f]) {
                f--;
            } else {
                double troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }

    public static void heapify(double[] vetor, int n, int i) {
        int maior = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;
        if (esquerda < n && vetor[esquerda] > vetor[maior]) {
            maior = esquerda;
        }
        if (direita < n && vetor[direita] > vetor[maior]) {
            maior = direita;
        }
        if (maior != i) {
            double aux = vetor[i];
            vetor[i] = vetor[maior];
            vetor[maior] = aux;
            heapify(vetor, n, maior);
        }
    }

    public static void shellSort(double[] vetor) {
        int h = 1;
        int n = vetor.length;
        while (h < n) {
            h = h * 3 + 1;
        }
        h = h / 3;
        while (h > 0) {
            for (int i = h; i < n; i++) {
                double c = vetor[i];
                int j = i;
                while (j >= h && vetor[j - h] > c) {
                    vetor[j] = vetor[j - h];
                    j = j - h;
                }
                vetor[j] = c;
            }
            h = h / 2;
        }
    }

    public static void heapSort(double[] vetor) {
        int n = vetor.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(vetor, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            double aux = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = aux;
            heapify(vetor, i, 0);
        }
    }

    public static void println(String texto) {
        System.out.println(texto);
    }

}
