public class Q1 {
    public static void main(String[] args) {

    }
    interface iRobot {
        boolean move();
        void turnLeft();
        void turnRight();
        void clean();
    }
    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Roomba implements iRobot {
        int[][] room;
        int rows;
        int cols;

        //current x
        int x=0;
        //current y
        int y=0;
        //current direction
        Direction myDirection=Direction.DOWN;

        //up left down right
        int[][] dirs=new int[][]{{0,1},{-1,0},{0,-1},{1,0}};
        public Roomba(int[][] matrix){
            this.room=matrix;
            this.rows=matrix.length;
            this.cols=matrix[0].length;

        }

        @Override
        public boolean move() {
            int newX=0;
            int newY=0;
            if(myDirection==Direction.DOWN){
                newX=x+dirs[2][0];
                newY=y+dirs[2][1];

            }else if(myDirection==Direction.UP){
                newX=x+dirs[0][0];
                newY=y+dirs[0][1];

            }else if(myDirection==Direction.LEFT){
                newX=x+dirs[1][0];
                newY=y+dirs[1][1];

            }else if(myDirection==Direction.RIGHT){
                newX=x+dirs[3][0];
                newY=y+dirs[3][1];
            }
            if(newX<0||newX>=rows||newY<0||newY>=cols||room[newX][newY]==-1){
                return false;
            }else{
                x=newX;
                y=newY;
                return true;
            }

        }

        @Override
        public void turnLeft() {
            myDirection=Direction.LEFT;

        }

        @Override
        public void turnRight() {
            myDirection=Direction.RIGHT;

        }

        @Override
        public void clean() {
            this.room[x][y]=1;
        }

    }

}

