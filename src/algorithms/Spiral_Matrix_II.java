package algorithms;

/**
 * Created by wangjinzhao on 2017/3/22.
 */
public class Spiral_Matrix_II {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        if(n==0)
            return matrix;
        int rowBegin=0;
        int colBegin=0;
        int rowEnd=matrix.length-1;
        int colEnd=matrix[0].length-1;
        int value=1;
        while(rowBegin<=rowEnd && colBegin<=colEnd)
        {
            for(int i=colBegin;i<=colEnd;i++)
            {
                matrix[rowBegin][i]=value++;
            }
            rowBegin++;
            for(int i=rowBegin;i<=rowEnd;i++)
            {
                matrix[i][colEnd]=value++;
            }
            colEnd--;
            if(rowBegin<=rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    matrix[rowEnd][i]=value++;
                }
            }
            rowEnd--;
            if(colBegin<=colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    matrix[i][colBegin]=value++;
                }
            }
            colBegin++;
        }
        return matrix;
    }
}
