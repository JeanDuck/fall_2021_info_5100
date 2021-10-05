import java.util.*;
public class lc5 {
    public static void main(String[] args) {
        int[][] m1=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> res=spiralOrder(m1);
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }


    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        int rows = matrix.length;
        int columns = matrix[0].length;
        int up=0;
        int left=0;
        int right=columns-1;
        int down=rows-1;
        while(res.size()<rows*columns){
            for(int i=left;i<=right;i++){
                res.add(matrix[up][i]);
            }
            for(int j=up+1;j<=down;j++){
                res.add(matrix[j][right]);
            }
            if(up!=down){
                for(int k=right-1;k>=left;k--){
                    res.add(matrix[down][k]);
                }

            }
            if(left!=right){
                for(int m=down-1;m>up;m--){
                    res.add(matrix[m][left]);
                }

            }
            left++;
            right--;
            up++;
            down--;

        }
        return res;
    }

}
