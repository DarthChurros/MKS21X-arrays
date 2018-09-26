public class ArrayDemo {
  public static void printArray (int[] ary) {
    System.out.print("[");
    for (int i = 0; i < ary.length; i++) {
      System.out.print(ary[i] + ", ");
    }
    System.out.print("\b\b]\n");
  }
  public static void printArray(int[][] ary) {
    System.out.println("[");
    for (int i = 0; i < ary.length; i++) {
      System.out.print("[");
      for (int j = 0; j < ary[0].length; j++) {
      System.out.print(ary[i][j] + ", ");
    }
    System.out.print("\b\b]\n");
  }
  System.out.print("\b\b]\n");
}
  public static void main (String[] args) {
    int[] x = new int[7];
    int[][] y = new int[3][10];
    for (int i = 0; i < 7; i++) {
      x[i] = i;
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 10; j++) {
        y[i][j] = i * j;
      }
    }
    printArray(x);
    System.out.println();
    printArray(y);
  }
}
