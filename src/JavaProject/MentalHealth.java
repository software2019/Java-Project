
package JavaProject;
import java.text.SimpleDateFormat;
import java.util.Scanner;
/**
 * Created by pg18sia on 02/12/2018
 * Program to define Mental Health Class (Subclass)
 */

public class MentalHealth extends Patient {

        Scanner keyboard = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        public MentalHealth(){
           noOfPatients++;
        }//Default Constructor

        public MentalHealth(String pFirstName, String pLastName, String pDateOfBirth,
                            String pAddress, String pPostCode, String pTelephone) {
            super( pFirstName, pLastName, pDateOfBirth,pAddress, pPostCode,pTelephone);
            noOfPatients++;
        }//Constructor

        protected String getInfo() {
            System.out.println("Please answer the following questions relating to the patient's condition.\n");
            System.out.print("Is the patient severely distressed and/ or actively trying to harm/ kill themselves or others? Yes/No: ");
            String answer = keyboard.next();

            if ("Yes".equals(answer)) {
                setPriority("Urgent");
            }//if

                else {
                    setPriority("Routine");
                }//else

            return getPriority();
        }//getInfo
 }//class