import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte[] arr1 = new byte [] {1, 2, 3};
        float[] arr2 = {1.57f, 7.654f, 9.986f};
        boolean[] arr3 = {true, false};
        //Задача 2
        for (byte i = 0; i < arr1.length; i++) {
            if (i==arr1.length-1) {
                System.out.println(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");
        }
        for (byte i = 0; i < arr2.length; i++) {
            if (i==arr2.length-1) {
                System.out.println(arr2[i]);
                break;
            }
            System.out.print(arr2[i] + ", ");
        }
        for (byte i = 0; i < arr3.length; i++) {
            if (i==arr3.length-1) {
                System.out.println(arr3[i]);
                break;
            }
            System.out.print(arr3[i] + ", ");
        }
        //Задача 3
        for (int i = arr1.length-1; i >= 0; i--) {
            if (i==0) {
                System.out.println(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");
        }
        for (int i = arr2.length-1; i >= 0; i--) {
            if (i==0) {
                System.out.println(arr2[i]);
                break;
            }
            System.out.print(arr2[i] + ", ");
        }
        for (int i = arr3.length-1; i >= 0; i--) {
            if (i==0) {
                System.out.println(arr3[i]);
                break;
            }
            System.out.print(arr3[i] + ", ");
        }
        //Задача 4
        for (byte i = 0; i < arr1.length; i++) {
            if (arr1[i]%2!=0) {
                arr1[i]++;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}