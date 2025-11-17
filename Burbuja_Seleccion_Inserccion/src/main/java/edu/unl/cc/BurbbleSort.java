package edu.unl.cc;

import static edu.unl.cc.Main.printArray;

public final class BurbbleSort {

    public  void burbbleSort(int[] array) {
        int iteraciones = 0;
        int swaps = 0;

        for (int i = 0; i < array.length - 1; i++) {
            System.out.println("\n[Pasada " + (i+1) + "]");

            for (int j = 0; j < array.length - 1 - i; j++) {
                iteraciones++;

                if (array[j] > array[j + 1]) {
                    // Swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swaps++;
                }
            }

            System.out.print("Iteracion actual: ");
            printArray(array);
        }

        System.out.println("\n");
        System.out.println("Total de iteraciones en Bubble Sort = " + iteraciones);
        System.out.println("Total de swaps en Bubble Sort = " + swaps);
    }
}
