public class LinkedQueueHashTable<E>{
    private int size;
    private int occupied;
    public LinkedQueueHashTable(int size) {
        Course[] hashTable = new Course[size];
    }
    public boolean isFull(){
        if (occupied==size)
            return true;
        return false;
    }
    public int hashInd(int key){
        return key%size;
    }
    public int dbleHashInd(int key){
        int prime = 11;
        return prime -(key%prime);
    }
    public void addCourse(Course c){

        occupied++;
    }
}
