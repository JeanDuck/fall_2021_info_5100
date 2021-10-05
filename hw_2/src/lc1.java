public class lc1 {
    public static void main(String[] args) {
        int[][] matrix1=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2=new int[][]{{1,2,3},{4,5,6}};
        int[][] ans1=transpose(matrix1);
        int[][] ans2=transpose(matrix2);
        for(int i=0;i<ans1.length;i++) {
            for (int j = 0; j < ans1[0].length; j++) {
                if(j==ans1[0].length-1){
                    System.out.println(ans1[i][j]);
                }else{
                    System.out.print(ans1[i][j]+ " ");
                }
            }
        }
        for(int i=0;i<ans2.length;i++) {
            for (int j = 0; j < ans2[0].length; j++) {
                if(j==ans2[0].length-1){
                    System.out.println(ans2[i][j]);
                }else{
                    System.out.print(ans2[i][j]+ " ");
                }
            }
        }



    }
    public static int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] res=new int[col][row];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                res[j][i]=matrix[i][j];

            }
        }
        return res;
    }

}
