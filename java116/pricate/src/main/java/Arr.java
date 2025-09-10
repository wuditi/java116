import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Arr {
    public static void main(String[] args) {
//        //选择排序
//        int[] a = {1, 3, 4, 5, 6, 0, 7};
//        int min = 1;
//        int minIndex = 0;
//        for (int i = 1; i < a.length; i++) {
//            if (a[i] < min) {
//                min = a[i];
//                minIndex = i;
//
//            }
//        }
        //map遍历
        //io输出流
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("student.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
