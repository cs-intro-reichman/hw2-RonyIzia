//feedback
/*
Great work boaz!
*/
// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String phrase = args[0].toUpperCase(); // get phrase to cheer
        String howManyTimes = args[1]; // get how many times to repeat
        int times = Integer.parseInt(howManyTimes); 
        
        for (int i = 0; i < phrase.length(); i++) {
                char letter = phrase.charAt(i); // get each letter
                 if(letter == 'A' || letter == 'E' || letter == 'F' || letter == 'H' || letter == 'I' || // determine if letter needs "an" or "a"
                   letter == 'L' || letter == 'M' || letter == 'N' || letter == 'O' || letter == 'R' || letter == 'S' || letter == 'X') {
                    System.out.println("Give me an " + letter +  ':' + letter + "!");
                }else {
                        System.out.println("Give me a " + letter +  ':' + letter + "!");
                      }   
         }
                       
                       System.out.println("What does that spell?");
                       for(int j = 0; j < times; j++) { // repeat cheering phrase
                        System.out.println(phrase + "! ! !");
                       }
        }
 }

