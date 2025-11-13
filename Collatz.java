public class Collatz {
    public static void main(String args[]) {
        int number = Integer.parseInt(args[0]); 
        String mode = args[1];
        int seed = 1;
        
        if(mode.equals("v")){
            for(seed = 1; seed <= number; seed++) {
                int currentNumero = seed;
                int counter = 0; 
          
                System.out.println();
            
                do { 
                    System.out.print(currentNumero + " ");
                    counter++;
            
                    if (currentNumero % 2 == 0) {
                       currentNumero /= 2;
                    } else {
                      currentNumero = 3 * currentNumero + 1;
                    }
                } while (currentNumero != 1);
            
                System.out.print(currentNumero + " ");
                counter++;
             
                System.out.print("(" + counter + ")");
            }
        }
        
        System.out.println();
        // System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
    } 
}