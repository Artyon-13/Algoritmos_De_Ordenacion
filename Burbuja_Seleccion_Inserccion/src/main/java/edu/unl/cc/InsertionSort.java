package edu.unl.cc;

import static edu.unl.cc.Main.printArray;

public final class InsertionSort {
    public InsertionSort() {
    }

    public void insertionSort(int[] array) {
        int iteraciones = 0;

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            System.out.println("\n[Iteración " + i + "] Insertando: " + key);

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
                iteraciones++;
            }

            array[j + 1] = key;

            System.out.print("Estado actual: ");
            printArray(array);
        }

        System.out.println("\n");
        System.out.println("Total de iteraciones en Insertion Sort = " + iteraciones);
    }

}

