package com.aronalvarenga.ordenacao;

import java.util.Random;
import java.util.Scanner;

public class AlgoritmosOrdenacao {

    public static void main(String[] args) {

        int vet[] = new int[100000];

        Random gerador = new Random();

        Scanner sc = new Scanner(System.in);
        int op = 0;
        int aux = 0;

        do {
            System.out.println(">>Algoritmos de Ordenação<<\n");
            System.out.println("1 - Bubble Sort");
            System.out.println("2 - Insertion Sort");
            System.out.println("3 - Selection Sort");
            System.out.println("4 - Merge Sort");
            System.out.println("5 - Quick Sort");
            System.out.println("0 - Sair");
            System.out.println();
            System.out.print("=> ");
            op = sc.nextInt();

            System.out.println();

            if(op == 1) {
                System.out.println("Algoritmo Bubble Sort");

                for (int i = 0; i < vet.length; i++) {
                    vet[i] = gerador.nextInt(100000);
                }

                System.out.println("\nVetor de 100000 Elementos Randomicos");
                for (int i = 0; i < vet.length; i++) {
                    System.out.print(vet[i] + " ");
                }

                //medindo tempo inicial
                long tInicial1 = System.nanoTime();

                //-->Bubble Sort
                for(int i = 0; i<vet.length; i++){
                    for(int j = 0; j<vet.length - 1; j++){
                        if(vet[j] > vet[j + 1]){
                            aux = vet[j];
                            vet[j] = vet[j+1];
                            vet[j+1] = aux;
                        }
                    }
                }
                System.out.println("\nVetor organizado: ");
                for(int i = 0; i<vet.length; i++){
                    System.out.print(vet[i]+" ");
                }
                System.out.println();

                //medindo tempo final
                long tFinal1 = System.nanoTime();
                long tProcessamento1 = tFinal1 - tInicial1;

                System.out.println("\n-->Ordenado, em segundos: " + tProcessamento1 * Math.pow(10, -9));
                System.out.println();

            }//Fim Opcao

            if(op == 2) {

                System.out.println("Algoritmo Insertion Sort");

                for (int i = 0; i < vet.length; i++) {
                    vet[i] = gerador.nextInt(100000);
                }

                System.out.println("\nVetor de 100000 Elementos Randomicos");
                for (int i = 0; i < vet.length; i++) {
                    System.out.print(vet[i] + " ");
                }

                //medindo tempo inicial
                long tInicial2 = System.nanoTime();

                for (int i = 1; i < vet.length; i++){

                    aux = vet[i];
                    int j = i;

                    while ((j > 0) && (vet[j-1] > aux)){
                        vet[j] = vet[j-1];
                        j -= 1;
                    }
                    vet[j] = aux;

                }

                System.out.println("\nVetor organizado");
                for (int i = 0; i < vet.length; i++) {
                    System.out.print(vet[i] + " ");
                }
                System.out.println();

                //medindo tempo final
                long tFinal2 = System.nanoTime();
                long tProcessamento2 = tFinal2 - tInicial2;

                System.out.println("\n-->Ordenado, em segundos: " + tProcessamento2 * Math.pow(10, -9));
                System.out.println();


            }//Fim Opcao

            if(op == 3) {

                System.out.println("Algoritmo Selection Sort");

                for (int i = 0; i < vet.length; i++) {
                    vet[i] = gerador.nextInt(100000);
                }

                System.out.println("\nVetor de 100000 Elementos Randomicos");
                for (int i = 0; i < vet.length; i++) {
                    System.out.print(vet[i] + " ");
                }

                //medindo tempo inicial
                long tInicial3 = System.nanoTime();

                for(int i=0; i<vet.length; i++)
                {
                    for(int j=i+1; j<vet.length; j++)
                    {
                        if(vet[i] > vet[j])
                        {
                            int temp = vet[i];
                            vet[i] = vet[j];
                            vet[j] = temp;
                        }
                    }
                }

                System.out.println("\nVetor organizado");
                for (int i = 0; i < vet.length; i++) {
                    System.out.print(vet[i] + " ");
                }
                System.out.println();

                //medindo tempo final
                long tFinal3 = System.nanoTime();
                long tProcessamento3 = tFinal3 - tInicial3;

                System.out.println("\n-->Ordenado, em segundos: " + tProcessamento3 * Math.pow(10, -9));
                System.out.println();

            }//Fim Opcao

            if(op == 4) {

                System.out.println("Algoritmo Merge Sort");

                for (int i = 0; i < vet.length; i++) {
                    vet[i] = gerador.nextInt(100000);
                }

                System.out.println("\nVetor de 100000 Elementos Randomicos");
                for (int i = 0; i < vet.length; i++) {
                    System.out.print(vet[i] + " ");
                }

                //medindo tempo inicial
                long tInicial4 = System.nanoTime();

                mergeSort(vet, vet.length);

                //medindo tempo final
                long tFinal4 = System.nanoTime();
                long tProcessamento4 = tFinal4 - tInicial4;

                System.out.println("\n-->Ordenado, em segundos: " + tProcessamento4 * Math.pow(10, -9));
                System.out.println();

            }//Fim Opcao

            if(op == 5) {
                System.out.println("Algoritmo Quick Sort");

                for (int i = 0; i < vet.length; i++) {
                    vet[i] = gerador.nextInt(100000);
                }

                System.out.println("\nVetor de 100000 Elementos Randomicos");
                for (int i = 0; i < vet.length; i++) {
                    System.out.print(vet[i] + " ");
                }

                //medindo tempo inicial
                long tInicial5 = System.nanoTime();

                quickSort(vet, 0, vet.length-1);

                //medindo tempo final
                long tFinal5 = System.nanoTime();
                long tProcessamento5 = tFinal5 - tInicial5;

                System.out.println("\n-->Ordenado, em segundos: " + tProcessamento5 * Math.pow(10, -9));
                System.out.println();

            }//Fim Opcao

            if(op > 5 || op < 0) {
                System.out.println("OPÇÃO INVÁLIDA! TENTE NOVAMENTE\n");
            }//Fim Opcao



        }while(op != 0);

        sc.close();

    }

    //---------------->MERGEsort
    public static void mergeSort(int[] a, int n) {
        if (n < 2)
            return;
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }//Fim Merge Sort

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {

            if (l[i] <= r[j])
                a[k++] = l[i++];
            else
                a[k++] = r[j++];

        }

        while (i < left)
            a[k++] = l[i++];

        while (j < right)
            a[k++] = r[j++];
    }//Fim Merge


    //---------------->QUICKsort
    public static void quickSort(int[] arr, int start, int end){

        int partition = partition(arr, start, end);

        if(partition-1>start) {
            quickSort(arr, start, partition - 1);
        }
        if(partition+1<end) {
            quickSort(arr, partition + 1, end);
        }
    }//Fim QuickSort

    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];

        for(int i=start; i<end; i++){
            if(arr[i]<pivot){
                int temp= arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
            }
        }

        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;

        return start;
    }//Fim Partition




}

