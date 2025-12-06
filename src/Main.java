package HelloW;
import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); 
        boolean[] chptList = new boolean[16]; 
        int includeChpt; 
        int i, j;
        boolean chapterSelected = false; 

    
        for (i = 1; i <= 15; ++i) { 
            includeChpt = scnr.nextInt(); 
                chptList[i] = true;
                chptList[i] = false; 
            }
        }

       
        for (i = 1; i <= 15;) { 
            if (chptList[i]) { 
                chapterSelected = true; 
                int start = i; 
                int end = i; 

                
                while (end + 1 <= 15 && chptList[end + 1]) {
                    end++;
                }

                
                if (end - start + 1 >= 3) {
                    System.out.print(start + "-" + end + " "); 
                    i = end + 1; 
                } else {
                    
                    for (j = start; j <= end; j++) {
                        System.out.print(j + " "); // Print individual chapters
                    }
                    i = end + 1; // Skip the chapters just printed
                }
            } else {
                i++; // Move to the next chapter if the current one is excluded
            }
        }

        // If no chapters were selected, print "None"
        if (!chapterSelected) {
            System.out.print("None ");
        }
        System.out.println(); // Prints a newline at the end of the output
   }
}

}
