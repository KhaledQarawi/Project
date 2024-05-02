public class Course {
    private int CRN;
    private String coursename;
    private int capacity;
    private SinglyLinkedList<Student> enrolled;
    private LinkedQueue<Student> waitingList;

    public Course(int CRN, String coursename, int capacity, SinglyLinkedList<Student> enrolled, LinkedQueue<Student> waitingList) {
        setCRN(CRN);
        setCoursename(coursename);
        setCapacity(capacity);
        setEnrolled(enrolled);
        setWaitingList(waitingList);
    }

    public int getCRN() {
        return CRN;
    }

    public void setCRN(int CRN) {
        this.CRN = CRN;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public SinglyLinkedList<Student> getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(SinglyLinkedList<Student> enrolled) {
        this.enrolled = enrolled;
    }

    public LinkedQueue<Student> getWaitingList() {
        return waitingList;
    }

    public void setWaitingList(LinkedQueue<Student> waitingList) {
        this.waitingList = waitingList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "CRN=" + CRN +
                ", coursename='" + coursename + '\'' +
                ", capacity=" + capacity +
                ", enrolled=" + enrolled +
                ", waitingList=" + waitingList +
                '}';
    }
}
