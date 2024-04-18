package cursojava;

public class ArrayBidimensionalForEach {
    
    public static void main(String args[]){

        int[][] num1 = {
            {51, 12},
            {87, 95}
        };
    
        for (int[] i : num1){
            for (int j : i){
                System.out.println(j);
            }
        }
        
    }
}
