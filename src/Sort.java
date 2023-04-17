
public class Sort {
  
  public static void bubbleSort(int[] arr) {
    boolean swapped = true;
    int n = arr.length;
    
    while (swapped) {
      swapped = false;
      for (int i = 1; i < n; i++) {
        if (arr[i - 1] > arr[i]) {
          int temp = arr[i];
          arr[i] = arr[i - 1];
          arr[i - 1] = temp;
          swapped = true;
        }
      }
      n--;
    }
  }
  
  public static void insertionSort(int[] arr) {
    int n = arr.length;
    
    for (int i = 1; i < n; i++) {
      int key = arr[i];
      int j = i - 1;
      
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }
      
      arr[j + 1] = key;
    }
  }
  
  public static void showArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  
  public static void selectionSort (int a[]) {
	  int min;
	  
	  for (int i = 0; i < a.length-1; i++) {
		  min = i;
		  for (int j = i+1; j < a.length; j++) {
			  if (a[min] > a[j])
				  min = j;  
		  }
		  int aux = a[min];
		  a[min] = a[i];
		  a[i] = aux;
	  }
  }
  
  public static void shellSort (int a[]) {
	  int interval = a.length /2;
	  int i , j , aux;
	  while (interval > 0) {
		  for (i= interval; i < a.length; i++) {
			  j = i;
			  aux = a[i];
			  while ((j >= interval)&&(a[j-interval] > aux)) {
				  a[j]= a[j-interval];
				  j = j - interval;
			  }
			  a[j] = aux;
		  }
		  interval = interval / 2;
	  }
  }
  
  public static void quickSort (int a[], int l, int r) {
	  int i = l;
	  int j = r;
	  
	  int pivot= a[(l+r)/2];
	  do {
		  while (a[i] < pivot) i++;
		  while (pivot < a[j]) j--;
		  if (i <= j) {
			  if (i != j) {
				  int aux = a[i];
				  a[i] = a[j];
				  a[j] = aux;  
			  }
			  i++;
			  j--;	   
		  }  
	  } while (i <= j);
	  if(l < j) {
		  quickSort(a, l , j);
	  }
	  if(i < r) {
		  quickSort(a, i , r);  
	  }
  }
}
