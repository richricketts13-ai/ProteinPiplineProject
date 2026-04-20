public class SequenceNode {
    //Fields
    private final String sequence;

    private SequenceNode next;

    //Constructor
    public SequenceNode(String sequence) {
        this.sequence = sequence;

        this.next = null;
    }

    //Methods
    public String getSequence() {
        return sequence;
    }

    public SequenceNode getNext() {
        return next;
    }

    public void setNext(SequenceNode next) {
        this.next = next;
    }
}