package JavaProject;
/**
 * Created by pg18sia on 02/12/2018
 * Program to define patient class (Super Class)
 */
public abstract class Patient {

   private String lastName, firstName;
   private String dateOfBirth, address, postCode, telephone;
   private String category;
   private String priority;
   int noOfPatients = 0;

   public Patient(){
      noOfPatients++;
   }//DefaultConstructor

   public Patient(String pFirstName, String pLastName, String pDateOfBirth,
                  String pAddress, String pPostCode, String pTelephone) {
      firstName = pFirstName;
      lastName = pLastName;
      dateOfBirth = pDateOfBirth;
      address = pAddress;
      postCode = pPostCode;
      telephone = pTelephone;
      category = "";
      noOfPatients++;
   }//Alternative Constructor

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }//setFirstName

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }//setLastName

   public void setDateOfBirth(String dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
   }//setDateOfBirth

   public void setAddress(String address) {
      this.address = address;
   }//setAddress

   public void setPostCode(String postCode) {
      this.postCode = postCode;
   }//setPostCode

   public void setTelephone(String telephone) {
      this.telephone = telephone;
   }//setTelephone

   public void setCategory(String category) {
      this.category = category;
   }//setCategory

   public void setPriority(String priority) {

      this.priority = priority;
   }//setPriority

   public void setNoOfPatients(int noOfPatients) {
      this.noOfPatients = noOfPatients;
   }//setNoOfPatients

   public String getFirstName() {
      return firstName;
   }//getFirstName

   public String getLastName() {
      return lastName;
   }//getLastName

   public String getCategory() {
      return category;
   }//getCategory

   public String getAddress() {
      return address;
   }//getAddress

   public String getDateOfBirth() {
      return dateOfBirth;
   }//getDateOfBirth

   public String getPostCode() {
      return postCode;
   }//getPostCode

   public String getTelephone() {
      return telephone;
   }//getTelephone

   public int getNoOfPatients() {
      return noOfPatients;
   }//getNoOfPatients

   public String getPriority() {
      return priority;
   }//getPriority

   abstract protected String getInfo();

   public String toString() {
      return "Based on the answers given Case Priority will be set to " + getPriority()
              + "\n==========================================================="
              + "\nCONFIRM DETAILS AND ADVISE CASE PRIORITY"
              + "\nPlease confirm details and advise of priority and time frame for treatment" +
              "\nPatient Name:\t" + getFirstName()
              + " " + getLastName()
              + "\nAddress:\t" + getAddress() +
              "\nTelephone:\t" + getTelephone() +
              "\nDate of Birth:\t" + getDateOfBirth()
              + "\nPost Code:\t" + getPostCode() +
              "\nCategory:\t" +getCategory() +
              "\nCase Priority:\t" + getPriority();
   }
}//class
