
package JavaProject;


import java.util.Scanner;

/**
 * Created by pg18sia on 02/12/2018
 * Program to define Pregnancy class (Subclass)
 */
public class Pregnancy extends Patient {

   Scanner keyboard = new Scanner(System.in);

   public Pregnancy(){

   }
   public Pregnancy(String pFirstName, String pLastName, String pDateOfBirth, String pAddress, String pPostCode, String pTelephone) {
      super(pFirstName, pLastName, pDateOfBirth, pAddress, pPostCode, pTelephone);
      noOfPatients++;
   }//Constructor

   @Override
   protected String getInfo() {
      System.out.println("Please answer the following questions relating to the patient's condition.\n");
        System.out.print("Is the patient experiencing heavy bleeding or cramping abdominal pain? Yes/No: ");
        String answer = keyboard.next();

        if ("Yes".equals(answer)) {
            setPriority("Urgent");
   }//if
      else {
      System.out.print("Can she feel the baby moving normally? If under 22 weeks old, please answer Yes ");
      answer = keyboard.nextLine();
      if ("Yes".equals(answer)) {
         setPriority("Urgent");
      }//if
      else {
         setPriority("Routine");
      }//else
   }//else
     return getPriority();
   }

   protected void printInfo() {

   }
}//class
