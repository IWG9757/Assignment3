import java.util.Scanner;
public class assignment3{
        private static final Scanner scanner = new Scanner (System.in);

        public static void main (String[] args){

            final String COLOR_RED_BOLD = "\033[31;1m";
            final String COLOR_BLUE_BOLD = "\033[34;1m";
            final String COLOR_GREEN_BOLD = "\033[32;1m";
            final String COLOR_YELLOW_BOLD = "\033[33;1m";
            final String RESET= "\033[30;0m";

            String name;
            int age;
            String subject1;
            String subject2;
            String subject3;
            double marks1;
            double marks2;
            double marks3;

            final String ERROR_MSG = String.format("%S%S%S \n",COLOR_RED_BOLD, "%S", RESET);

            app:{

                System.out.print("Enter your name: ");
                name = scanner.nextLine().strip();
                //System.out.println(name);

                if (name.length()==0){
                    System.out.printf("%sName can't be empty%s\n", COLOR_RED_BOLD,RESET);
                    break app;
                    //System.exit(1);
                }

                System.out.print("Enter your age: ");
                age = scanner.nextInt();
                scanner.nextLine();
                //scanner.skip(System.lineSeparator());

                if (age < 10 || age > 18){
                    System.out.printf("$sInvalid age%s\n", COLOR_RED_BOLD, RESET);
                    System.out.printf(ERROR_MSG, "Invalid age");
                    break app;
                }

                System.out.print("Enter subject1: ");
                subject1 = scanner.nextLine().strip();

                if (subject1.isBlank()){
                    System.out.printf(ERROR_MSG, "Subject 1 can't be empty");
                    break app;
                }else if (!subject 1.startsWith("SE-")){
                    System.out.printf(ERROR_MSG, "Invalid Subject 1");
                    break app;
                }

                System.out.printf("Enter Marks for %s: ", subject1);
                marks1 = scanner.nextDouble();
                scanner.nextLine();

                if (marks1<0 || marks>100){
                    System.out.printf(ERROR_MSG, "Invalid Subject 2");

                }

                if (subject1.isBlank()){
                    System.out.printf(ERROR_MSG, "Subject 2 can't be empty");
                    break app;
                }else if (!marks1.startsWith("SE-")){
                    System.out.printf(ERROR_MSG, "Invalid Subject 2");
                    break app;
                }else if(subject2.equals(subject1)){
                    System.out.printf(ERROR_MSG, "Invalid Subject 2: subject already exist.");
                    break app;


                }

                System.out.printf("Enter Marks for %s: ", subject3);
                marks3 = scanner.nextDouble();
                scanner.nextLine();

                if (subject1.isBlank()){
                    System.out.printf(ERROR_MSG, "Subject 3 can't be empty");
                    break app;
                }else if (!subject 1.startsWith("SE-")){
                    System.out.printf(ERROR_MSG, "Invalid Subject 1");
                    break app;
                }else if(subject2.equals(subject1)){
                    System.out.printf(ERROR_MSG, "Invalid Subject 2: subject already exist.");

                    

                }

                String status; //overall status
                String subject1Status;
                String subject2Status;
                String subject3Status;

                final String DISTINGUISHED_PASS = COLOR_BLUE_BOLD + "Distinguished Pass (DP)" +RESET;
                final String CREDIT_PASS = COLOR_GREEN_BOLD + "CREDIT PASS (CP)" + RESET;
                final String PASS = COLOR_YELLOW_BOLD + "PASS (P)" + RESET;
                final String FAIL = COLOR_RED_BOLD + "FAIL (F)" + RESET;




                //overall status
                if (avg>=75)status = String.format(subject)DISTINGUISHED_PASS;
                else if (avg >=65)status = CREDIT_PASS;
                else if (avg>=55)status = PASS;
                else status = FAIL;

                //subject1 status
                if (avg>=75)subject1Status = DISTINGUISHED_PASS;
                else if (avg >=65)subject1Status = CREDIT_PASS;
                else if (avg>=55)subject1Status = PASS;
                else subject1Status = FAIL;

                //subject2 status
                if (avg>=75)subject2Status = DISTINGUISHED_PASS;
                else if (avg >=65)subject2Status = CREDIT_PASS;
                else if (avg>=55)subject2Status= PASS;
                else subject2Status = FAIL;

                //subject3 status
                if (avg>=75)subject3Status = "Distinguished Pass (DP)";
                else if (avg >=65)subject3Status= "Credit Pass (CP)";
                else if (avg>=55)subject3Status = "Pass (P)";
                else subject3Status = "Fail (F)";

                subject1 = String.format("SE-%03d", Integer.valueOf(subject1.substring(3)));
                subject2 = String.format("SE-%03d", Integer.valueOf(subject2.substring(3)));
                subject3 = String.format("SE-%03d", Integer.valueOf(subject3.substring(3)));

                name = String.format("%s%s%s",COLOR_BLUE_BOLD,name.toUpperCase(), RESET);


                //Let's generate the table
                System.out.println("+".concat("-".repeat(40)).concat("+"));
                System.out.printf("|%-10s: %-28s|\n","Name",name.toUpperCase());
                System.out.printf("|%-10s: %-28s|\n","Age",age + " years old");
                System.out.printf("|%-10s: %-28s|\n","Status",status.toUpperCase());
                System.out.printf("|%-10s: %-28s|\n","Total",String.format("%.2f",total));
                System.out.printf("|%-10s: %-28s|\n","Average",String.format("%.2f",avg).concat("%"));

                final String LINE = "+".concat("-".repeat(7).concat("+")).concat("-".repeat(12)).concat("-".repeat(20).concat("+"));
                System.out.println(LINE);
                System.out.printf("|%-7s|%-12s|%-19s|\n", "Subject", "Marks", "Grade");

                System.out.println(LINE);

                System.out.printf("|%-7s|%-12.2f|%-19s|\n", subject1, marks1, subject1Status);
                System.out.printf("|%-7s|%-12.2f|%-19s|\n", subject2, marks2, subject2Status);
                System.out.printf("|%-7s|%-12.2f|%-19s|\n", subject3, marks3, subject3Status);

                System.out.println("+".concat("-".repeat(40)).concat("+"));

            

            }

            


        }
        
    
}
