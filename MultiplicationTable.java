
package multiplicationtable;

public class MultiplicationTable {

    /*
    2d array
    for loops
    */
    
    public static void main(String[] args) {
        
        int[][] table = new int[10][10];
        
        for (int x = 0; x < table.length; x++) {
            
            for (int y = 0; y < table[x].length; y++) {
                
                table[x][y] = (x + 1) * (y + 1);
                System.out.printf("%s x %s = %s", (x + 1), (y + 1), (table[x][y] + "\t"));
                
            }
            
            System.out.println();
            
        }
        
    }
    
}
