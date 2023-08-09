import java.util.Scanner;

public class Assignment3{

    private static final Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {

        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_GREEN_BOLD = "\033[32;1m";
        final String COLOR_YELLOW_BOLD ="\033[33;1m";
        final String RESET = "\033[30;0m";
        

        String name;
        int age;
        String subject1;
        String subject2;
        String subject3;
        double marks1;
        double marks2;
        double marks3;


        String status; // overall status

        String subject1Status;
        String subject2Status;
        String subject3Status;

        final String DISTIGUISHED_PASS = COLOR_BLUE_BOLD +"Distiguished Pass"+ RESET;
        final String CREDIT_PASS = COLOR_GREEN_BOLD +"Credit Pass"+ RESET;
        final String PASS = COLOR_YELLOW_BOLD +"Pass"+ RESET;
        final String FAIL = COLOR_RED_BOLD +"Fail"+ RESET;

        final String ERROR_MSG = String.format ("%s%s%s \n",COLOR_RED_BOLD,"%s",RESET); 

    app:{

        System.out.print("Enter Your Name: ");
        name = scanner.nextLine().strip();
        
        if (name.length() == 0) {
            System.out.printf(ERROR_MSG,"Name Can't be Empty");
            break app;
        }

        
        System.out.print("Enter Your Age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        if (age < 10 || age > 18) {
            System.out.printf(ERROR_MSG,"Invalid Age");
            break app;
        }

        /* Subject 1 */
        System.out.print("Enter Your Subject 1: ");
        subject1 = scanner.nextLine().strip();

        if (subject1.isBlank()){
            System.out.printf(ERROR_MSG,"Subject 1 can't be empty");
            break app;
        }else if (!subject1.startsWith("SE-")) {
            System.out.printf(ERROR_MSG,"Invalid Subject");
            break app;
        }

        System.out.printf("Enter Your Marks for %s: ",subject1);
        marks1 = scanner.nextDouble();
        scanner.nextLine();

        if (marks1 < 0 || marks1 > 100){
            System.out.printf(ERROR_MSG,"Invalid Marks");
            break app;
        }

        /* Subject 2 */
        System.out.print("Enter Your Subject 2: ");
        subject2 = scanner.nextLine().strip();

        if (subject2.isBlank()){
            System.out.printf(ERROR_MSG,"Subject 2 can't be empty");
            break app;
        }else if (!subject2.startsWith("SE-")) {
            System.out.printf(ERROR_MSG,"Invalid Subject");
            break app;
        } else if (subject2.equals(subject1)){
            System.out.printf(ERROR_MSG,"Invalid Subject: Subject Already Exist");
            break app;
        }

        System.out.printf("Enter Your Marks for %s: ",subject2);
        marks2 = scanner.nextDouble();
        scanner.nextLine();

        if (marks2 < 0 || marks2 > 100){
            System.out.printf(ERROR_MSG,"Invalid Marks");
            break app;
        }

        /* Subject 3 */
        System.out.print("Enter Your Subject 3: ");
        subject3 = scanner.nextLine().strip();

        if (subject3.isBlank()){
            System.out.printf(ERROR_MSG,"Subject 3 can't be empty");
            break app;
        }else if (!subject3.startsWith("SE-")) {
            System.out.printf(ERROR_MSG,"Invalid Subject");
            break app;
        }else if (subject3.equals(subject1) || subject3.equals(subject2)){
            System.out.printf(ERROR_MSG,"Invalid Subject: Subject Already Exist");
            break app;
        }

        System.out.printf("Enter Your Marks for %s: ",subject3);
        marks3 = scanner.nextDouble();
        scanner.nextLine();

        if (marks3 < 0 || marks3 > 100){
            System.out.printf(ERROR_MSG,"Invalid Marks");
            break app;
        }

        double total = marks1 + marks2 + marks3;
        double avg = total/3;

        //Determine the overall status
        if (avg >= 75) status = DISTIGUISHED_PASS;
        else if (avg >= 65) status = CREDIT_PASS;
        else if (avg >= 55) status = PASS;
        else status = FAIL;

        //Subject1 status
        if (marks1 >= 75) subject1Status = DISTIGUISHED_PASS;
        else if (marks1 >= 65) subject1Status= CREDIT_PASS;
        else if (marks1 >= 55) subject1Status = PASS;
        else subject1Status = FAIL;

        //subject2 status
        if (marks2 >= 75) subject2Status = DISTIGUISHED_PASS;
        else if (marks2 >= 65) subject2Status= CREDIT_PASS;
        else if (marks2 >= 55) subject2Status = PASS;
        else subject2Status = FAIL;

        //subject3 status
        if (marks3 >= 75) subject3Status = DISTIGUISHED_PASS;
        else if (marks3 >= 65) subject3Status= CREDIT_PASS;
        else if (marks3 >= 55) subject3Status = PASS;
        else subject3Status = FAIL;

        //let's generate the table

        subject1 = String.format("SE-%03d",Integer.valueOf(subject1.substring(3)));
        subject2 = String.format("SE-%03d",Integer.valueOf(subject2.substring(3)));
        subject3 = String.format("SE-%03d",Integer.valueOf(subject3.substring(3)));

        name = String.format("%s%s%s",COLOR_BLUE_BOLD,name.toUpperCase(),RESET);
        



        System.out.println("+".concat("-".repeat(50)).concat("+"));
        System.out.printf("|%10s: %-52s|\n","Name",name);
        System.out.printf("|%10s: %-38s|\n","Age",age + " Years Old");
        System.out.printf("|%10s: %-52s|\n","Status",status);
        System.out.printf("|%10s: %-38s|\n","Total",String.format("%.2f",total));
        System.out.printf("|%10s: %-38s|\n","Average",String.format("%.2f",avg).concat("%"));
        

        final String LINE = "+".concat("-".repeat(10).concat("+"))
                                .concat("-".repeat(12).concat("+"))
                                .concat("-".repeat(26).concat("+"));
        
        System.out.println(LINE);
        System.out.printf("|%-10s|%-12s|%-26s| \n","SUBJECT","MARKS","STATUS");
        System.out.println(LINE);
        System.out.printf("|%-10s|%-12.2f|%-40s| \n",subject1,marks1,subject1Status);
        System.out.printf("|%-10s|%-12.2f|%-40s| \n",subject2,marks2,subject2Status);
        System.out.printf("|%-10s|%-12.2f|%-40s| \n",subject3,marks3,subject3Status);
        System.out.println("+".concat("-".repeat(50)).concat("+"));



    }
        
    }
}
