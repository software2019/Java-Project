
package JavaProject;
import java.util.Scanner;
/**
 * Created by pg18sia on 02/12/2018
 * Program to Test Patient Class
 */
abstract class TestPatient extends Patient  {
   static Scanner keyboard = new Scanner(System.in);

   public static void main(String[] args) {
      System.out.println("\nPATIENT PRIORITISATION");
      System.out.println("============================================================================");
      System.out.println("NEW CASE ENTRY");
      System.out.println("Please enter all required patient details");
      System.out.print("First name:\t\t");
      String firstName = keyboard.nextLine();
      System.out.print("Last name:\t\t");
      String lastName = keyboard.nextLine();
      System.out.print("Date of birth:\t");
      String dateOfBirth = keyboard.nextLine();
      System.out.print("Address:\t\t");
      String address = keyboard.nextLine();
      System.out.print("Post Code:\t\t");
      String postCode = keyboard.nextLine();
      System.out.print("Telephone:\t\t");
      String telephone = keyboard.nextLine();
      System.out.println("============================================================================");
      System.out.println("PATIENT CONDITION");
      System.out.println("Most common reasons for patients requiring treatment from GP:");
      System.out.println("\n1. Death\t\t\t\t\t\t\t4. Pregnancy");
      System.out.println("2. Terminal Illness\t\t\t\t\t5. Chest Pain");
      System.out.println("3. Mental Health\t\t\t\t\t6. Other");
      System.out.println("\t\t\t\t\t\t");
      System.out.print("Please select from the list above the most appropriate reason for contact: ");
      int type = keyboard.nextInt();
      String category = "";
      switch (type) {
         case 1:
            category = "Death";
            break;
         case 2:
            category = "Terminal Illness";
            break;
         case 3:
            category = "Mental Health";
            break;
         case 4:
            category = "Pregnancy";
            break;
         case 5:
            category = "Chest Pain";
            break;
         case 6:
            category = "Others";
         default:
      }//Switch

      System.out.println();
      System.out.println("The category selected is: " + category);

      if (category == "Death") {
         Death patient = new Death();
         patient.setFirstName(firstName);
         patient.setLastName(lastName);
         patient.setDateOfBirth(dateOfBirth);
         patient.setAddress(address);
         patient.setPostCode(postCode);
         patient.setTelephone(telephone);
         patient.setCategory(category);
         patient.getInfo();
         System.out.println(patient);
      }//else if

      else if (category == "Terminal Illness") {
         TerminalIllness patient = new TerminalIllness();
         patient.setFirstName(firstName);
         patient.setLastName(lastName);
         patient.setDateOfBirth(dateOfBirth);
         patient.setAddress(address);
         patient.setPostCode(postCode);
         patient.setTelephone(telephone);
         patient.setCategory(category);
         patient.getInfo();
         System.out.println(patient);

      }//if
      else if (category == "Mental Health"){
         MentalHealth patient = new MentalHealth();
         patient.setFirstName(firstName);
         patient.setLastName(lastName);
         patient.setDateOfBirth(dateOfBirth);
         patient.setAddress(address);
         patient.setPostCode(postCode);
         patient.setTelephone(telephone);
         patient.setCategory(category);
         patient.getInfo();
         System.out.println(patient);
      }
      else if (category == "Pregnancy"){
         Pregnancy patient = new Pregnancy();
         patient.setFirstName(firstName);
         patient.setLastName(lastName);
         patient.setDateOfBirth(dateOfBirth);
         patient.setAddress(address);
         patient.setPostCode(postCode);
         patient.setTelephone(telephone);
         patient.setCategory(category);
         patient.getInfo();
         System.out.println(patient);
      }
      else if (category == "Chest Pain"){
         ChestPain patient = new ChestPain();
         patient.setFirstName(firstName);
         patient.setLastName(lastName);
         patient.setDateOfBirth(dateOfBirth);
         patient.setAddress(address);
         patient.setPostCode(postCode);
         patient.setTelephone(telephone);
         patient.setCategory(category);
         patient.getInfo();
         System.out.println(patient);
      }
      else if (category == "Other"){
         Others patient = new Others();
         patient.setFirstName(firstName);
         patient.setLastName(lastName);
         patient.setDateOfBirth(dateOfBirth);
         patient.setAddress(address);
         patient.setPostCode(postCode);
         patient.setTelephone(telephone);
         patient.setCategory(category);
         patient.getInfo();
         System.out.println(patient);
      }
   }//main
}//class
