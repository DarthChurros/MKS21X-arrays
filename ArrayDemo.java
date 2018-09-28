public class ArrayDemo {
  public static void printArray (int[] ary) {
    System.out.print("{");
    for (int i = 0; i < ary.length; i++) {
      System.out.print(ary[i] + ", ");
    }
    System.out.print("\b\b}\n");
  }

  public static void printArray(int[][] ary) {
    System.out.print("{");
    for (int j = 0; j < ary.length; j++) {
      printArray(ary[j]);
    }
  System.out.print("\b\b}\n");
  }

  public static int countZeros2D(int[][] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        if (nums[i][j] == 0) {
          count++;
        }
      }
    }
    return count;
  }

  public static void fill2D(int[][] vals) {
    for (int i = 0; i < vals.length; i++) {
      for (int j = 0; j <  vals[i].length; j++) {
        if (i == j) {
          vals[i][j] = 3;
        } else {
          vals[i][j] = 1;
        }
      }
    }
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
    System.out.println("Printing x:");
    printArray(x);
    System.out.println("Printing y:");
    printArray(y);
    System.out.println("Number of zeros in y:");
    System.out.println(countZeros2D(y));
    fill2D(y);
    System.out.println("Filling y with 1's and 3's");
    printArray(y);
  }
}
