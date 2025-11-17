package edu.unl.cc;

public class Main {
    /*ARREGLOS DEL TALLER*/
    static int [] A = {8, 3, 6, 3, 9}; //Normal
    static int[] B = {5, 4, 3, 2, 1}; //Inverso
    static int[] C = {1, 2, 3, 4, 5}; //Ya ordenado
    static int[] D = {2, 2, 2, 2, 2}; //Duplicado
    static int[] E = {9, 1, 8, 2};

    /*CASOS BORDE*/
    static int[] F = {}; //Cuando esta vacio;
    static int[] G = {1}; //Tamaño 1
    static int[] H = {1, 2, 3, 4, 5, 6,}; //Cuando el arreglo ya esta ordenado
    static int[] I = {6, 5, 4, 3, 2, 1}; //Cuando esta en orden inverso
    static int[] J = {5, 4, 4, 3, 3, 2, 1}; //Cuando esta con duplicados

    public static void main(String[] args) {
        BurbbleSort burbble = new BurbbleSort();
        SelectionSort selection = new SelectionSort();
        InsertionSort insertion = new InsertionSort();

        System.out.println("-------- BIENVENIDO A LA PRACTICA DE ALGORITMOS DE ORDENACION -----------");

        System.out.println("===== BURBBLE SORT =====");
        burbble.burbbleSort(B.clone());

        System.out.println("\n===== SELECTION SORT =====");
        selection.selectionSort(B.clone());

        System.out.println("\n===== INSERTION SORT =====");
        insertion.insertionSort(B.clone());

    }

    public static void printArray(int[] arr) {
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }
}