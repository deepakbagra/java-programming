//==================================
// Foundations of Computer Science
// students: Deepak Kumar Sharma
// id: a1778228 
// Semester: 2
// Year:33
// Practical Number: 06 Part II
//===================================
public class ServiceCenter {
    private WaitingList awl;

    public ServiceCenter() {
        this.awl = new WaitingList();
    }

    /**
     * Record patient's data and add the patient into waiting list
     * @param name
     * @param phoneNumber
     * @param triageLevel
     * @param location
     */
    public void addPatientIntoList(String name, String phoneNumber, int triageLevel, String location) {
        Patient patient = new Patient(name, phoneNumber, triageLevel, location);
        if(this.awl.isInList(patient)){
            System.out.println(patient.getName() + " is in waiting list. ");
        }else{
            this.awl.addToList(patient);
            System.out.println("Add " + patient.getName() + " into waiting list. ");
        }
    }

    /**
     * Pop out the first patient in the waiting list and assign an Ambulance for him/her
     * @return the patient object
     */
    public Patient assignAmbulanceForPatient() {
        // TODO: The tester report that the system will crash when waiting list is empty
        if(this.awl.isEmpty()){
            System.out.println("Error! The waiting list is empty.");
            return null;
        }
        else {
           Patient patient = this.awl.popPatient();
           System.out.println("Assigned an ambulance for patient: " + patient.getName());
           return patient; 
        }
        
    }
     /**
     * Pop out the patient in the waiting list by Id and assign an Ambulance for him/her
     * @return the patient object
     */
    public Patient assignAmbulanceForPatientById(int id) {
        // TODO: The tester report that the system will crash when waiting list is empty
        // if the waiting list is empty
        if(this.awl.isEmpty()){
            System.out.println("Error! The waiting list is empty.");
            return null;
        }
         // if given Id is not in the waiting list
        else if (!this.awl.isInListById(id)) {
            System.out.println("Given Id is not in the waiting list.");
            return null;
        }
        else {
            // pop out patient and return his/her Id
           Patient patient = this.awl.popPatientById(id);
           System.out.println("Success! An ambulance is assigned for patient " + patient.getId());
           return patient;  // return popped patient
        }        
    }
    // check how many patients are waiting before this patient given the patient's Id
    public void checkPositionById(int id) {
         // if the waiting list is empty
        if(this.awl.isEmpty()){
            System.out.println("Waiting list is empty!!");        
        }
        // if given Id is not in the waiting list
        else if (!this.awl.isInListById(id)) {
            System.out.println("Given Id is not in the waiting list.");
        }
        else {
            int pos = this.awl.checkPosition(id);
            System.out.println("There are " + pos + " patients before patient " + id);
        }       
    }

    /**
     * Print out the waiting list
     */
    public void printWaitingList(){
        this.awl.printList();
    }
}