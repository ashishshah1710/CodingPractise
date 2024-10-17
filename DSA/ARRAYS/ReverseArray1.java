// Java Program to reverse an array using temporary array

class ReverseArray1 {

  // function to reverse an array
  static void reverseArray(int[] arr) {
    int r = arr.length - 1;
    int l = 0;

    while (l < r){
      int temp = arr[l];
      arr[l]=arr[r];
      arr[r]=temp;
      l++;
      r--;
    }
  }

  public static void main(String[] args) {
    int[] arr = { 1, 4, 3, 2, 6, 5 };

    reverseArray(arr);

    for (int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");
  }
}
