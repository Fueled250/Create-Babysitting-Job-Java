/*S.McDonald 11/12/2016
CreateBabysittingJob.java
This program prompts the user for data for a babysitting job (the information that will be used for input-
must be valid). This program prompts the user for a year, a job number, a babysitter code, the number of
children that need to be watched and the number of hours worked.
After all valid entries are submited, a job number is created using the last 2 digits of the year, and a sequential
number based off the job number entered to complete the final 4 numbers, creating a 6 digit job number. Finally,
a new BabysittingJob object is created, and the program calls the jobDetails() method to display the values.
*/


import java.util.Scanner; //import Scanner class
public class CreateBabysittingJob
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in); //Scanner input
      
      //input
      System.out.print("Enter a four-digit year between 2013 and 2025: ");
      int year = input.nextInt(); //capture year input from user
      //if user inputs a year outside of desired range:
      while(year < 2013 || year > 2025) //year range is set between 2013 and 2025
      {
         System.out.println("Error! Year must be between 2013 and 2025."); //error message
         System.out.print("Enter a four-digit year between 2013 and 2025: "); //user is prompted to enter the year again
         year = input.nextInt(); //capture year input from user
      }
         
      System.out.print("Enter a job number for the year between 1 and 9999 inclusive: ");
      int jobNum = input.nextInt(); //capture number from user
      //if user inputs a job number outside of desired range:
      while(jobNum < 1 || jobNum > 9999) //job number range is set between 1 and 9999
      {
         System.out.println("Error! Job number for the year must be between 1 and 9999 inclusive."); //error message
         System.out.print("Enter a job number for the year between 1 and 9999 inclusive: "); //user is prompted to enter the job number again
         jobNum = input.nextInt(); //capture number from user
      }
         
      System.out.print("Enter a babysitter code of 1, 2, or 3: ");
      int employeeNum = input.nextInt(); //capture number from user
      //if user inputs an employee number outside of 1-3:
      while(employeeNum < 1 || employeeNum > 3) //employee number range is set between 1 and 3
      {
         System.out.println("Error! Babysitter code must be either 1, 2, or 3."); //error message
         System.out.print("Enter a babysitter code of 1, 2, or 3: "); //user is prompted to enter the employee number again
         employeeNum = input.nextInt(); //capture number from user
      }
        
      System.out.print("Enter a number of children between 1 and 9 inclusive: ");
      int numChild = input.nextInt(); //capture number from user
      //if user inputs a number outside of the range of 1-9:
      while(numChild < 1 || numChild > 9) //number of children range is set between 1 and 9
      {
         System.out.println("Error! Number of children must be between 1 and 9."); //error message
         System.out.print("Enter a number of children between 1 and 9 inclusive: "); //user is prompted to enter number again
         numChild = input.nextInt(); //capture number from user
      }
         
      System.out.print("Enter a number of hours between 1 and 12 inclusive: ");
      int numHours = input.nextInt(); //capture number from user
      //if user inputs number outside of the range of 1-12
      while(numHours < 1 || numHours > 12) //number of hours range is set between 1 and 12
      {
         System.out.println("Error! Number of hours must be between 1 and 12."); //error message
         System.out.print("Enter a number of hours between 1 and 12 inclusive: "); //user is prompted to enter number again
         numHours = input.nextInt(); //capture number from user
      }
      
      //if all data is valid, create a job number using last 2 digits of year & four-digit sequential number
      int seqNum = jobNum; //sequential number will be based off the number the user entered for the job number earlier
      jobNum = BabysittingJob.createJobNum(year, seqNum); //this will create a job number using the last 2 digits of the year entered-
      //and the last 4 digits will be a sequential number based off the job number entered.
      //example for jobNum: if user entered 2021 for the year & it was the 224 job of the year, the job number assigned would be: 210224
      
      //construct a new BabysittingJob object
      BabysittingJob job1 = new BabysittingJob(jobNum, employeeNum, numChild, numHours);
      
      //output
      //call the jobDetails() method
      job1.jobDetails();
   
   }//main method

}//class