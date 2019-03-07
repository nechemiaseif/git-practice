/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author neche
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String oneWrong = "wrong";
        String anotherWrong = "wrong";
        String aRight = "right";

        if ((oneWrong + anotherWrong).equals(aRight)) {
            System.out.println("Two wrongs make a right.");
        } else {
            System.out.println("Two wrongs don't make a right.");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Do you like gitcamp? Push 1 for yes, 0 for no. Then push enter.");
        int numero = input.nextInt();

        if (numero == 1) {
            System.out.println("\nThis is the correct choice");
        }
        else if (numero == 0) {
            System.out.println("\nGitHub is sad now...");
        }
        else {
            System.out.println("\nThat is invalid input, so run the program again, please :) ");
        }

	System.out.println("I hate not having sout!");
        
        System.out.println("Something stupid");
        
    }

}


/*
Ugh, I hate template garbage!
 */
 /*
Ugh, I hate template garbage!
 */
 /*
Ugh, I hate template garbage!
 */
 /*
Ugh, I hate template garbage!
 */
 /*
Ugh, I hate template garbage!
 */
 /*
Ugh, I hate template garbage!
 */
 /*
Ugh, I hate template garbage!
 */
 /*
Ugh, I hate template garbage!
 */
