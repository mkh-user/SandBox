import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("---");
        System.out.println("Welcome to Java Programming");
        System.out.println("---");
        int[] aryNums = new int[10];
        aryNums[4] = 2;
        System.out.println(Arrays.toString(aryNums));
        int[] aryNums2 = {1, 23, 243, 123};
        System.out.println(aryNums2[2]);
    }
}
