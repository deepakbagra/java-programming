//==================================
// Foundations of Computer Science
// students: Deepak Kumar Sharma
// id: a1778228 
// Semester: 2
// Year:33
// Practical Number: 06 Part II
//===================================
public class WaitingList {
    protected Node head;
    protected int numNodes;

    public WaitingList(){
        this.head = null;
        this.numNodes = 0;
    }

    /**
     * This method will pop the first patient from the waiting list
     * @return the patient popped from the waiting list
     */
    public Patient popPatient() {
        //TODO: Implement this method
        // if Waiting list is empty 
        if(this.head == null){
            return null;
        }
        else{
            Node tmp = this.head; // preserving the head node before deleting
            this.head = this.head.getNext();
            return tmp.patient; // return first patient from the list 
        }        
    }
    /**
     * This method will pop the patient By Id from the waiting list
     * @return the patient popped from the waiting list
     */
    public Patient popPatientById(int id) {
        //TODO: Implement this method
        // if Waiting list is empty 
        if(this.head == null){
            return null;
        }
        // if the first patient in the list needs immediate ambulance 
        else if(this.head.getPatient().getId() == id) {          
            Node tmp = this.head; // preserving the head node before deleting
            this.head = this.head.getNext();
            return tmp.patient; // return first patient from the list          
        }
        else {
            Node tmp = this.head; // pointer to the current patient
            Node prev = null; // pointer to the previous patient 
            // traverse the list until :> find the Id or reach the end
            while(tmp != null && tmp.getPatient().getId() != id){
                prev = tmp;
                tmp = tmp.getNext();             
            }
            if(tmp != null) { // Id found 
                prev.setNext(tmp.getNext());                
            }
            return tmp.patient; // return patient from the list            
        }        
    }
    // count how many patients are waiting before this patient given the patient's Id
    public int checkPosition(int id) {
        // travesring the list to identify given Id while counting patients
        int counter = 0; // initialising counter
        Node tmp = this.head;
        while(tmp != null && tmp.getPatient().getId() != id) {
            tmp = tmp.getNext();
            counter++;
        }
        return counter;
    }

    /**
     * This method will add patient into the waiting list according to the triage level
     * @param patient patient's data
     */
    public void addToList(Patient patient) {
        //TODO: Implement this method 
        // if the waiting list is empty -> insert new patient as head 
        if (this.head == null) {
            this.head = new Node(patient);
        }        
        
        // if new patient's triage level is higher than the patient at top in the waiting list
        // insert the new patient at top  
        if(this.head.getPatient().getTriageLevel() < patient.getTriageLevel()){
            Node newNode = new Node(patient);
            newNode.setNext(this.head);
            this.head = newNode;
        }
        else {  // traverse the queue
            Node tmp = this.head; // current pointer
            Node prev = null; // previous pointer                          
                
            // if patient's traige level is smaller than the exisiting patient in Queue            
            // traverse the Queue until smaller traige level is found 
            while (tmp != null && tmp.getPatient().getTriageLevel() >= patient.getTriageLevel()){
                prev = tmp;
                tmp = tmp.getNext();
            }
            // when loop terminates
            if (tmp != null) { //found a position in between               
                // insert in between
                Node newNode = new Node(patient); // preserving node for new patient
                prev.setNext(newNode);
                newNode.setNext(tmp);               
            }
            else { // not found a suitable position in between 
                prev.setNext(new Node(patient)); // insert at end
            }
        }          
    }

    /**
     * print out the information for each patient in waiting list
     */
    public void printList() {
        //TODO: Implement this method
        this.getHeader();  // print header             
        // if the waiting list is empty
        if(this.isEmpty()){
            System.out.println("Waiting list is empty.");
        }
        // traversing the list and printing current nodes
        else{
            Node tmp = this.head;
            while(tmp !=null) {
                System.out.printf("%-15s %-15s %-15d %-15s %12d", tmp.patient.getName(),
                tmp.patient.getPhoneNumber(), tmp.patient.getTriageLevel(),
                tmp.patient.getLocation(), tmp.patient.getId());
                System.out.println();
                tmp = tmp.getNext();
            }
        }
    }
    private void getHeader() {
        // print header
        System.out.println("===============================================================================");
        String name = "Name", phoneNumber = "Phone Number", triageLevel = "Triage Level", location = "Location", id = "ID";         
        System.out.printf("%-15s %-15s %-15s %-15s %12s\n", name, phoneNumber, triageLevel, location, id);
        System.out.println("==============================================================================="); 
    }
    // Return TRUE when the list is empty, otherwise, return FALSE.
    public boolean isEmpty() {
        // for empty Queue
        if(this.head == null){
            return true;
        }
        else {
            return false;
        }
    }
    

    /**
     * Check whether the patient is in this list or not
     * @return
     */
    public boolean isInList(Patient patient) {
        if (this.head == null) {
            return false;
        }
        Node temp = this.head;
        while(temp != null) {
            if(temp.getPatient().getName().equals(patient.getName())
                    && temp.getPatient().getPhoneNumber().equals(patient.getPhoneNumber())){
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }
    /**
     * Check whether the patient is in this list or not -> check By id
     * @return
     */
    public boolean isInListById(int id) {
        if (this.head == null) {
            return false;
        }
        Node temp = this.head;
        while (temp != null) {
            if (temp.getPatient().getId() == id) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }
}