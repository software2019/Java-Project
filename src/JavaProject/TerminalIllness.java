package JavaProject;

import java.util.Scanner;
/**
 * Created by pg18sia on 02/12/2018
 * Program to define Terminal Illness class (Subclass)
 */

public class TerminalIllness extends Patient {
   Scanner keyboard = new Scanner(System.in);

   public TerminalIllness() {
      noOfPatients++;
   }//Default Constructor

   public TerminalIllness(String pFirstName, String pLastName, String pDateOfBirth,
                          String pAddress, String pPostCode, String pTelephone) {
      super(pFirstName, pLastName, pDateOfBirth, pAddress, pPostCode, pTelephone);
      noOfPatients++;
   }//Alternative Constructor

   protected String getInfo() {
      System.out.println("Please answer the following questions relating to the patient's condition.\n");
      System.out.print("Is the patient severely distressed and/or in pain? Yes/No: ");
      String answer = keyboard.nextLine();

      if ("Yes".equals(answer)) {
         setPriority("Urgent");
      }//if

      else {
         System.out.print("Is there any other reason why the patient needs urgent care? Yes/No: ");
         answer = keyboard.nextLine();
         if ("Yes".equals(answer)) {
            setPriority("Urgent");
         }//if

         else {
            setPriority("Routine");
         }//else

      }//else
      return getPriority();

   }//getInfo
}//class
