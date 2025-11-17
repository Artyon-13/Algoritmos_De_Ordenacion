package edu.unl.cc;

import static edu.unl.cc.Main.printArray;

public final class SelectionSort {
    public SelectionSort() {
    }

    public void selectionSort(int[] array) {
        int iteraciones = 0;
        int swaps = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            System.out.println("\n[Iteración " + (i+1) + "] Buscando mínimo desde posición " + i);

            for (int j = i + 1; j < array.length; j++) {
                iteraciones++;
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Hacer swap si encontramos uno menor
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
                swaps++;
            }

            System.out.print("Estado actual: ");
            printArray(array);
        }

        System.out.println("\n");
        System.out.println("Total de iteraciones en Selection Sort = " + iteraciones);
        System.out.println("Total de swaps en Selection Sort = " + swaps);
    }
}
