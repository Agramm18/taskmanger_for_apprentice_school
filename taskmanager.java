//Import the Scanner for User Input
import java.util.Scanner;

public class taskmanager {
    public static void main(String[] args) {

        //Build the scanner for user input and input validation

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n -----The list is running please add the values for the list -----\n");
        coreLogic logic = new coreLogic(); //var = class() in python
        logic.buildList(scanner); //load the scanner into the class and method simular to var.function() in python

        scanner.close();
    }
}