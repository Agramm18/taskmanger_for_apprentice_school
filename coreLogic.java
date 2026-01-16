import java.util.Scanner;

public class coreLogic {

    //Set the basic class values like self.val in python
    //These are the default values for the list
    String taskTitle;
    Integer Priority;
    String dueDate;

    //Build a constructor to set the class like def init in python
    public coreLogic() {

        //set the values to none or null to have empty default values
        this.taskTitle = null;
        this.Priority = null;
        this.dueDate = null;
    }

    //Core Functions to build the list

    void buildList(Scanner scanner) {
        System.out.println("\n You can now build your list from scratch \n");

        //Endelss loop that ends if the conditions are valid to catch errors correct
        while(true) {
        
            try {
                //Get the user Task
                System.out.println("Task Title: ");
                String task = scanner.nextLine();

                if (task == "" || task.trim().isEmpty()) {
                    throw new IllegalArgumentException("This field can't be empty please enter your task");
                } else {
                    this.taskTitle = task;
                    System.out.println("\nYour task is setted sucsessfully");
                    System.out.println("Your task is: " + this.taskTitle + "\n");
                }

                //Get the priority from the task
                System.out.println("\nPlease set the priority from your task: ");
                System.out.println("Please note that you only can set a priority between 1 and 5\n");

                Integer priority = scanner.nextInt();
                scanner.nextLine();

                //Check if priority is higher than 5 or less than 5
                //Check if priority is null
                if (priority < 1 || priority > 5) {
                    throw new IllegalArgumentException("The priority can't be higher than 5 or be less than 1");
                } else {
                    this.Priority = priority;
                    System.out.println("\nThe priority is setted sucsessfully \n");
                    System.out.println("\nThe priority from your task is: " + this.Priority + "\n");
                }

            } catch (IllegalArgumentException error) {
                System.out.println("\nThere is an error in the input validation");
                System.out.println("The error is: " + error + "\n");
            }
        }
    }
}
