public class lc4 {
    public static void main(String[] args) {
        int[][] m1=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] m2=new int[][]{{1}};
        rotate(m1);
        rotate(m2);
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[0].length;j++){
                if(j==m1[0].length-1){
                    System.out.println(m1[i][j]);
                }else{
                    System.out.print(m1[i][j]+" ");
                }
            }
        }
        for(int i=0;i<m2.length;i++){
            for(int j=0;j<m2[0].length;j++){
                if(j==m2[0].length-1){
                    System.out.println(m2[i][j]);
                }else{
                    System.out.print(m2[i][j]+" ");
                }
            }
        }


    }
    public static void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n-1-i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[n-1-j][i];
                matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
                matrix[j][n-1-i]=temp;

            }

        }

    }
}
