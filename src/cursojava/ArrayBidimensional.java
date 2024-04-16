package cursojava;

public class ArrayBidimensional {
    
    public static void main(String args[]){
        
        //Array unidimensional
        int[] num1 = new int[2];
        num1[0] = 12;
        num1[1] = 65;
        
        //Array bidimensional
        int[][] num2 = new int[2][2];
        num2[0][0] = 51;
        num2[0][1] = 89;
        
        num2[1][0] = 60;
        num2[1][1] = 75;
        
        //Y así sucesivamente...
        
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.println(num2[i][j]);
            }
        }
        
    }
    
}
