
public class TestSort {
  
  public static void main(String[] args) {
    int[] arr = {5, 2, 8, 3, 1};
    
    System.out.println("Arreglo inicial:");
    Sort.showArray(arr);
    
    Sort.bubbleSort(arr);
    System.out.println("Matriz ordenada usando Bubble Sort:");
    Sort.showArray(arr);
    
    int[] arr2 = {9, 6, 4, 7, 2};
    
    System.out.println("Arreglo inicial:");
    Sort.showArray(arr2);
    
    Sort.insertionSort(arr2);
    System.out.println("Matriz ordenada usando Insertion Sort:");
    Sort.showArray(arr2);
    
    
    int[] arrSelection = {8, 3, 6, 1, 9, 2, 7, 5, 4};
    System.out.println("Antes de ordenar con selectionSort:");
    Sort.showArray(arrSelection);
    Sort.selectionSort(arrSelection);
    System.out.println("Después de ordenar con selectionSort:");
    Sort.showArray(arrSelection);
    
 
    int[] arrShell = {8, 2, 3, 1, 9, 6, 7, 5, 4};
    System.out.println("Antes de ordenar con shellSort:");
    Sort.showArray(arrShell);
    Sort.shellSort(arrShell);
    System.out.println("Después de ordenar con shellSort:");
    Sort.showArray(arrShell);

    int[] arrquick = {10, 7, 8, 9, 1, 5};
    System.out.println("Antes de ordenar con quickSort:");
    Sort.showArray(arrquick);
    Sort.quickSort(arrquick, 0, arrquick.length-1);
    System.out.println("Despues de ordenar con quickSort:");
    Sort.showArray(arrquick);
  }
}
