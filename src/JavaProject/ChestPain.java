
package JavaProject;

import java.util.Scanner;


/**
 * Created by pg18sia on 02/12/2018
 * Program to define Chest Pain class (Subclass)
 */
public class ChestPain extends Patient {

   Scanner keyboard = new Scanner(System.in);

   public ChestPain(){

       noOfPatients++;
   }
   public ChestPain(String pFirstName, String pLastName, String pDateOfBirth,
                    String pAddress, String pPostCode, String pTelephone) {

      super (pFirstName, pLastName, pDateOfBirth, pAddress, pPostCode, pTelephone);
      noOfPatients++;
   }//Constructor

    protected String getInfo() {
      System.out.println("Please answer the following questions relating to the patient's condition.\n");
      System.out.print("Is the pain in the centre of the chest? Yes/No: ");
      String answer = keyboard.nextLine();

      if ("Yes".equals(answer)) {
         setPriority("Urgent");
      }//if
      else {
         System.out.print("Is the pain described as heavy, crushing or tight? Yes/No: ");
         answer = keyboard.nextLine();

         if ("Yes".equals(answer)) {
            setPriority("Urgent");
         }
         else {
            System.out.print("Does the patient have any known cardiac history, heart attack, Angina Yes/No: ");
            answer = keyboard.nextLine();

            if ("Yes".equals(answer)) {
               setPriority("Urgent");
            } //if

            else {
               setPriority("Routine");
            }//else
         }//else
      }//else
         return getPriority();
   }
 }//class
