public class Collatz {
    public static void main(String args[]) {
        int number = Integer.parseInt(args[0]);  // starting number
        String mode = args[1]; // mode: v or c
        int seed = 1;
        
        if(mode.equals("v")) {                  // verbose mode
            for(seed = 1; seed <= number; seed++) {         // for each starting number
                int currentNumero = seed;              
                int counter = 0;                        // counts how many actions taken
          
                System.out.println();
            
                do { 
                    System.out.print(currentNumero + " ");
                    counter++;
            
                    if (currentNumero % 2 == 0) {            // even
                       currentNumero /= 2;
                    } else {                                 // not even
                      currentNumero = 3 * currentNumero + 1;
                    }
                } while (currentNumero != 1);          // repeat until we reach 1
            
                System.out.print(currentNumero + " ");
                counter++;
             
                System.out.print("(" + counter + ")");
            }
        }
        
        System.out.println();
        System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
    } 
}