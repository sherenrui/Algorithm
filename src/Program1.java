/**
 * Created by Administrator on 2017/10/17.
 */
public class Program1 {
    public static void main(String[] args) {
        /*
        * 测试String的+运算的改变
        * */
//        String a = "hello";
//        System.out.println(a.hashCode());
//        a += " word";
//        System.out.println(a.hashCode());
//        ********************************

        /*
        * 测试printf的格式化作用
        * */
//        System.out.printf("%-14d" ,512);
//        ******************************

        /*
        * 选择排序
        *
        *
        * */

        int[] n = AlogTestTool.getCollections(10000, 0, 10000);
        Long start = System.currentTimeMillis();
        selectCort(n);
        Long end = System.currentTimeMillis();
        Long progamtime = end - start;
        System.out.println("selectCort:" + progamtime + "ms");

        Long start1 = System.currentTimeMillis();
        sortType(n);
        Long end1 = System.currentTimeMillis();
        Long progamtime1 = end1 - start1;
        System.out.println("sortType:" + progamtime1+ "ms");

    }

    /**
     * 选择排序
     */
    public static void selectCort(int[] n) {
        int len = n.length;
        int min = 0;
        for (int i = 0; i < len; i++) {
            min = i;
            for (int j = i + 1; j < len; j++) {
                if (n[j] > n[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int tmp = n[min];
                n[min] = n[i];
                n[i] = tmp;
            }
        }
//        for (int j : n) {
//            System.out.println(j + ",");
//        }
    }

    /**
     * 插入排序
     */
    public static void sortType(int[] n) {
        int len = n.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (n[j] < n[j - 1]) {
                    int tmp = n[j];
                    n[j] = n[j-1];
                    n[j] = tmp;
                }
            }
        }
//        for (int m : n) {
//            System.out.println(m + ",");
//        }
    }
}
