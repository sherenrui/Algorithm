package Algorithm_Common;

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
        AlgorithOfSort.sortAdvance(n);
        Long end = System.currentTimeMillis();
        Long progamtime = end - start;
        System.out.println("sortAdvance:" + progamtime + "ms");

        Long start1 = System.currentTimeMillis();
        AlgorithOfSort.sortType(n);
        Long end1 = System.currentTimeMillis();
        Long progamtime1 = end1 - start1;
        System.out.println("sortType:" + progamtime1+ "ms");

    }
}
