import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {

  public static void main (String[] args) {
    soln1();
    soln2();
    soln3();
    soln4();
    soln5();
    soln6();
    soln7();
    soln8();
    soln9();

    soln11();
  }
    public static void soln1() {
    int step = 5;
    for (int i = 100;  i >=0; i -= step) {
      System.out.println(i);
    }

  }

  public static void  soln2() {
    int step = 5;
    for (int i = 100;  i >=0; i -= step) {
    }
  }

  public static void soln3() {
    int sum = 0;
    for (int i = 9; i < 18; i ++) {
      sum+= i;
    }
    System.out.println(sum);
  }

  public static void  soln4() {

    int[] a = {9, 5, 6, 3, 8, 2, 4};
    int minInt = 0;

    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] < a[i + 1]) {
        minInt = a[i];
      }
    }
    System.out.println(minInt);
    }

  public static void  soln5() {
    int[] a = {9, 5, 6, 3, 8, 2, 4};
    int maxInt = 0;

    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] > a[i + 1]) {
        maxInt = a[i];
      }
    }
    System.out.println(maxInt);
    }

  public static void  soln6() {
  boolean []  a = {false, false, false, true, false};
    for (int i = 0; i <a.length; i++) {
      if (a[i] == true) {
        System.out.println(i);
        break;
      }
    }

  }

  public static void  soln7() {
    boolean []  a = {false, false, false, true, false};
  int i = 0;
    while (i < a.length) {

    if (a[i] == true) {
      System.out.println(i);
      break;
    }
      i++;
    }
  }



  public static void  soln8() {
    int[] a = {9, 5, 6, 3, 8, 2, 4};
    for (int i = 0; i < a.length; i++) {
      a[i] = a[i] + 5;

    }
    System.out.println(Arrays.toString(a));
  }

  public static void  soln9() {
    double [] a = {9, 5, 6, 3, 8, 2, 4};
    for (int i = 0; i < a.length; i++) {
      a[i] = a[i] / 1.3;

    }
    System.out.println(Arrays.toString(a));

  }

 public static void  soln10() {
   Double [] a = {1.3, 5.4, 6.1 , 1.0 , 9.2};

   for (int i = 0; i < a.length; i++) {
	 a[i] = Math.pow(a[i],3) - a[i] / 3.0;
}
 }

 public static void  soln11() {
  int [][] fourBySix = new int [4] [6];
  for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 6; j++) {
      fourBySix[i][j] = 0;
    }
  }
    System.out.println(Arrays.deepToString(fourBySix));

  }


//  public static void  soln12() {
//  // and put your code here.
//  }
//
//  public static void  soln13() {
//  // and put your code here.
//  }
//
//  public static void  soln14() {
//  // and put your code here.
//  }
//
//  public static void  soln15() {
//  // and put your code here.
//  }
//
//  public static void  soln16() {
//  // and put your code here.
//  }
//
//  public static void  soln17() {
//  // and put your code here.
//  }
//
//  public static void  soln18() {
//  // and put your code here.
//  }
//
//  public static void  soln19() {
//  // and put your code here.
//  }
//
//  public static void  soln20() {
//  // and put your code here.
//  }
//
//  public static void  soln21() {
//  // and put your code here.
//  }
//
//  public static void  soln22() {
//  // and put your code here.
//  }


}
