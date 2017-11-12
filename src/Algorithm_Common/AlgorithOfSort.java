package Algorithm_Common;

public class AlgorithOfSort {

    /**
     * 选择排序
     */
    public static void selectCort(int[] n) {
        int len = n.length;
        int min = 0;
        for (int i = 0; i < len; i++) {
            min = i;
            for (int j = i + 1; j < len; j++) {
                if (n[j] < n[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int tmp = n[min];
                n[min] = n[i];
                n[i] = tmp;
            }
        }
//        for(int i:n)
//        {
//            System.out.print(i+",");
//        }
    }

    /**
     * 插入排序
     */
    public static void sortType(int[] n) {
        int len = n.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j > 0 && n[j] > n[j - 1]; j--) {
                int tmp = n[j];
                n[j] = n[j - 1];
                n[j - 1] = tmp;
            }
        }

//        for(int i:n)
//    {
//        System.out.print(i + ",");
//    }
}

    /**
    * 插入排序优化
    * */
    public static void sortAdvance(int[] n)
    {
        int len=n.length;
        for(int i=0 ; i<len-1;i++) {
                int rep=n[i];
                int j;
                for(j=i;j>0&&n[j-1]>rep;j--)
                {
                           n[j]=n[j-1];
                            }
           n[j]=rep;
        }
//        for(int i:n)
//        {
//            System.out.print(i+",");
//        }
    }
}
