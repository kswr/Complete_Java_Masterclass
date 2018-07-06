import java.util.Arrays;

public class Reversing {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5};
//        reverse(ints);
//        for (int i : ints) {
//            System.out.println(i);
//        }
        modifyArray(ints);
        System.out.println(Arrays.toString(ints));

    }
    public static void reverse(int[] ints) {
        int[] temp = new int[ints.length];
        int iter = 0;
        for (int i = ints.length-1; i >= 0; i--){
            temp[iter] = ints[i];
            iter++;
        }
        for (int i = 0; i<temp.length;i++) {
            ints[i] = temp[i];
        }
        System.out.println(Arrays.toString(ints));
    }

    public static void modifyArray(int[] array) {
        array = new int[]{1, 2, 3};
    }
}
