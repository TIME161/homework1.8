import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        double[] two = {1.57, 7.654, 9.986};
        double[] three = {4.26, 6, 15, 16.38, 28};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        double[] two = {1.57, 7.654, 9.986};
        double[] three = {4.26, 6, 15, 16.38, 28};
            for (int i = 0; i < one.length; i++) {
            if (i < (one.length - 1)) {
                System.out.print(one[i] + ",");
            } else {
                System.out.print(one[i]);
                }
            }
            System.out.println();
            for (int i = 0; i < two.length; i++) {
                if (i < (two.length - 1)) {
                    System.out.print(two[i] + ",");
                } else {
                    System.out.print(two[i]);
                }
            }
        System.out.println();
            for (int i = 0; i < three.length; i++) {
            if (i < (three.length - 1)) {
                System.out.print(three[i] + ",");
            } else {
                System.out.print(three[i]);
                }
            }
        }
    }