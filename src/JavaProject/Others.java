package JavaProject;

import java.text.SimpleDateFormat;
import java.util.Scanner;
/**
 * Created by pg18sia on 02/12/2018
 * Program to define Other Class (Subclass)
 */

    public class Others extends Patient {
        Scanner keyboard = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        public Others(){
            noOfPatients++;
        }//Default Constructor

        public Others(String pFirstName, String pLastName, String pDateOfBirth,
                      String pAddress, String pPostCode, String pTelephone) {
            super( pFirstName, pLastName, pDateOfBirth,pAddress, pPostCode,pTelephone);
            noOfPatients++;
        }//Alternative Constructor

        protected String getInfo(){
            System.out.println("Please answer the following questions relating to the patient's condition.\n");
            System.out.print(" Is the patient known to have any long standing unstable medical conditions such as cancer,COPD, dementia, diabetes?");
            String answer = keyboard.nextLine();

            if ("Yes".equals(answer)) {
                setPriority("Urgent");
            }//if
            else {
                System.out.print("Is the patient calling regarding any of the following conditions? Vomiting, diarrhoea, migrane, backpain.");
                answer = keyboard.nextLine();
                if ("Yes".equals(answer)) {
                    setPriority("Routine");
                }//if
                else {
                    System.out.println("Is there any other reason why the case may be considered urgent?");
                    answer = keyboard.nextLine();

                    if ("yes".equals (answer)){
                        setPriority("Routine");
                    }//if
                    else {
                        setPriority("Urgent");
                    }//else
                }//else
            }//else
            return getPriority();
        }//getInfo
}//class
