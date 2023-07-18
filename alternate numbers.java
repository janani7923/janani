public class MyClass {
    public static void main(String args[]) {
      int[] arr = {11,12,13,14,15,16,17,18,19,20};
      int n = arr.length;
      for (int i=0;i<n;i=i+2) {
          System.out.println(arr[i]);
      }
    }
}