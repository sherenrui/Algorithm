import java.util.Random;

/**
 * Created by Administrator on 2017/10/19.
 */
public class AlogTestTool {

    /**
    *自动生成一定数量的数组
     *
     * */
    public static int[] getCollections(int num,int startnum,int endnum)
    {
        Random r=new Random();
        int[] m=new int[num];
        for(int i=0;i<num;i++)
        {
            m[i]=r.nextInt(endnum-startnum+1)+startnum;
        }
        return m;
    }

}
