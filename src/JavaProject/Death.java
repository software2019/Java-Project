package JavaProject;


import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Death extends Patient {
   Scanner keyboard = new Scanner(System.in);
   SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

   public Death(){
      noOfPatients++;
   }//Default Constructor

   public Death(String pFirstName, String pLastName, String pDateOfBirth,
                String pAddress, String pPostCode, String pTelephone) {
      super(pFirstName, pLastName, pDateOfBirth, pAddress, pPostCode, pTelephone);
      noOfPatients++;
   }//Alternative Constructor

   protected String getInfo() {
      System.out.println("Please answer the following questions relating to the patient's condition.\n");
      System.out.print("Is it an expected death? Was the patient elderly or terminally ill? Yes/No: ");
      String answer = keyboard.next();

      if ("Yes".equals(answer)) {
         setPriority("Urgent");
      }//if

      else {
         System.out.print("Is the death the result of an accident or suspicious circumstances? Yes/No: ");
         answer = keyboard.next();

         if ("Yes".equals(answer)){
         setPriority("Referral");
      }//else

         else{
         setPriority("Urgent");
         }//else

      }//else
      return getPriority();
   }//getInfo
  }//class