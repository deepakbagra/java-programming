//==================================
// Foundations of Computer Science
// students: Deepak Kumar Sharma
// id: a1778228 
// Semester: 2
// Year:33
// Practical Number: 06 Part I
//===================================
public class Node {
    protected Node next;
    protected Patient patient;

    public Node(Patient patient) {
        this.patient = patient;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    // print node --> implemented
    public void printNode() {
        System.out.print(getPatient() + "  ");
    }
}