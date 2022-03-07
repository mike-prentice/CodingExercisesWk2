import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static class Fish {

    }

    public static class X {
        public double balance = 0;

        public X(double b) {
            this.balance = b;
        }

        public void getBalance() {
            if (this.balance <= 1) {
                System.out.println("Paid Off");
            } else {
                System.out.printf("%.2f \n", balance);
            }
        }
    }

    public static class Thermo {
        public static double getTemp() {
            double temp = Math.floor(Math.random() * 100 + 1);
            return temp;
        }
    }


    public static void main(String[] args) {
        soln1();
        soln2();
        soln3();
        soln4();
        soln5();
        soln6();
        soln7();
        soln8();
        soln9();
        soln10();
        soln11();
        soln12();
        soln13();
        soln14();
        Solution.soln15(new Fish());
        Solution.soln15("Animal Farm");
        soln16();
        soln17();
        soln18();
        soln19();
        soln20();
        soln21();
        soln22();

    }

    public static void soln1() {
        int step = 5;
        for (int i = 100; i >= 0; i -= step) {
            System.out.println(i);
        }

    }

    public static void soln2() {
        int step = 5;
        for (int i = 100; i >= 0; i -= step) {
        }
    }

    public static void soln3() {
        int sum = 0;
        for (int i = 9; i < 18; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void soln4() {

        int[] a = {9, 5, 6, 3, 8, 2, 4};
        int minInt = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                minInt = a[i];
            }
        }
        System.out.println(minInt);
    }

    public static void soln5() {
        int[] a = {9, 5, 6, 3, 8, 2, 4};
        int maxInt = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                maxInt = a[i];
            }
        }
        System.out.println(maxInt);
    }

    public static void soln6() {
        boolean[] a = {false, false, false, true, false};
        for (int i = 0; i < a.length; i++) {
            if (a[i]) {
                System.out.println(i);
                break;
            }
        }

    }

    public static void soln7() {
        boolean[] a = {false, false, false, true, false};
        int i = 0;
        while (i < a.length) {

            if (a[i]) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }

    public static void soln8() {
        int[] a = {9, 5, 6, 3, 8, 2, 4};
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + 5;

        }
        System.out.println(Arrays.toString(a));
    }

    public static void soln9() {
        double[] a = {9, 5, 6, 3, 8, 2, 4};
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] / 1.3;

        }
        System.out.println(Arrays.toString(a));

    }

    public static void soln10() {
        Double[] a = {1.3, 5.4, 6.1, 1.0, 9.2};

        for (int i = 0; i < a.length; i++) {
            a[i] = Math.pow(a[i], 3) - a[i] / 3.0;
        }
    }

    public static void soln11() {
        int[][] fourBySix = new int[4][6];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                fourBySix[i][j] = 0;
            }
        }
        System.out.println(Arrays.deepToString(fourBySix));

    }

    public static void soln12() {
        int[][] a = new int[][]{
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = a[i][j] * 7;
            }
        }
        System.out.println(Arrays.deepToString(a));
    }

    public static void soln13() {
        boolean[][] b = new boolean[5][5];
        int[][] a = new int[][]{
                {2, 1, 4, 1, 6},
                {1, 1, 1, 1, 1},
                {2, 1, 4, 1, 6},
                {1, 1, 1, 1, 1},
                {2, 1, 4, 1, 6}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                b[i][j] = a[i][j] % 2 == 0;
            }
        }
        System.out.println(Arrays.deepToString(b));
    }

    public static void soln14() {
        double a = 5.239;
        double b = 5.236;
        double result = Math.pow(a, b);
        System.out.println(result);
    }

    public static boolean soln15(Object j) {
        // create a method that returns a boolean if the Object passed to it is a Fish or not
        System.out.println(j.getClass().equals(Fish.class));
        return (j.getClass().equals(Fish.class));
    }

    public static void soln16() {
        X test = new X(10);
        X test2 = new X(.5);
        test.getBalance();
        test2.getBalance();
    }

    public static void soln17() {
        // Thermo thermo = new Thermo();
        Boolean heatOn = false;
        Boolean airOn = false;


        while (true) {
            double temp = Thermo.getTemp();
            if (temp < 72) {
                heatOn = true;
                airOn = false;
                System.out.println(airOn);
                break;
            } else if (temp > 76) {
                airOn = true;
                heatOn = false;
                System.out.println(heatOn);
                break;
            }
        }
    }


    public static void soln18() {
        double[] array = {0.12, 3.24, 1.1, 2.42};
        double pi = Math.PI;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > pi) {
                System.out.println(array[i] + " , " + i);
            }
        }
    }

    public static void soln19() {
        int sum = 0;
        HashMap<Integer, Integer> nums = new HashMap<>();
        nums.put(0, null);
        nums.put(1, 4);
        nums.put(2, 5);
        nums.put(3, null);

        nums.values().removeAll(Collections.singleton(null));


        for (int s : nums.values()) {
            sum += s;
        }

        System.out.println(sum);


    }

    public static void soln20() {
        Integer[] array = {3, 5, 7, 8, 3, 6};
        List<Integer> list = Arrays.asList((array));
        Collections.reverse(list);
        System.out.println(Arrays.toString(array));
    }

    public static void soln21() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(5 + " x" + " " + i + " =" + " " + (5 * i));
        }
    }

    public static void soln22() {
        double hypotenuse;
        double result;
        double a = 9;
        double b = 7;
        result = Math.pow(a, 2) + Math.pow(b, 2);
        hypotenuse = Math.sqrt(result);
        System.out.println(hypotenuse);
    }
}
