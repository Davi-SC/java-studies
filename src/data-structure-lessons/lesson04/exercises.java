
public class exercises {
    public static void main(String[] args) {
        problem4();
    }

    public static void problem2(){
        int m[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};

        for (int i = 0; i<m.length ; i++){
            for (int j = 0; j < m[i].length ; j++){
                System.out.printf("%d");
            }
        }
    }

    public static void problem4(){
        int m[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i<m.length ; i++){
            for (int j = i+1; j < m[i].length ; j++){
                System.out.printf("%d \n",m[i][j]);
            }
        }
    }

    public static void problem5(){
        int m[][] = {
                {1,2,3},         //[0][0]
                {4,5,6},        //[][]
                {7,8,9}         //[][]
        };

        for (int i = 0; i<m.length ; i++){
            System.out.printf("%d \n", m[i][i]);
//          for (int j = i; j == i ; j++){
//              System.out.printf("%d \n", m[i][j]);
//          }
        }
    }

    public static void problem6(){
        int m[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i<m.length ; i++){
            for (int j = 0; j <= m[i].length ; j++){
                System.out.printf("%d \n", m[i][j]);
            }
        }
    }
}
