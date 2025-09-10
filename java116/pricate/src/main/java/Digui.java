import java.util.ArrayList;
import java.util.List;

public class Digui {

    public static void main(String[] args) {
        feiBoNaQi();


    }

    private static void feiBoNaQi() {
        int n1 = 1;
        int n2 = 2;

        for (int i = 1; i < 20; i++) {

            int ren = digui(i);
            System.out.print(ren + " ");
        }
        int n = 10;

        System.out.println(jiecheng(n));
    }


    public static int digui(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return digui(n - 1) + digui(n - 2);
        }
    }

    public static int jiecheng(int n) {
        if (n == 1) {
            return 1;
        } else {
            return jiecheng(n - 1) * n;
        }
    }
}
