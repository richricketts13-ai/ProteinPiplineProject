public class BioSequenceQueue {
    //Fields
    private SequenceNode head;

    private SequenceNode tail;

    //Constructor
    public BioSequenceQueue() {

        this.head = null;
        
        this.tail = null;
    }

    //Methods

    //Enqueue
    public void addSequence(String sequence) {

        SequenceNode newNode = new SequenceNode(sequence);

        if (head == null) {

            head = newNode;

            tail = newNode; 

        } else {

            tail.setNext(newNode);

            tail = newNode;
        }
    }

    //Dequeue
    public String processNextSequence() {

        if (head == null) {

            return null;
        }

        String sequence = head.getSequence();

        head = head.getNext();

        if (head == null) {

            tail = null;
        }

        return sequence;
    }


    public String peekNextSequence() {

        if (head == null) {

            return null;
        }

        return head.getSequence();
    }


    public void printQueue() {

        if (head == null) {

            

            return;
        }

        SequenceNode current = head;

        while (current != null) {

            System.out.println(current.getSequence());

            current = current.getNext();
        }
    }


    public int sizeOfQueue() {

        SequenceNode current = head;

        int count = 0;

        while (current != null) {

            count++;

            current = current.getNext();
        }

        return count;
    }

    public boolean containsSequence(String sequence) {

        if (head == null) {

            return false;
        }

        SequenceNode current = head;

        while (current != null) {

            if (current.getSequence().equals(sequence)) {

                return true;

            }

            current = current.getNext();
        }
       return false;
    }

    public void processAllSequences() {

        while(head != null) {

            String sequence = processNextSequence();

            System.out.println(sequence);
        }

    } 



        public void reverseQueue() {

            SequenceNode current = head;

            SequenceNode previous = null;

            SequenceNode oldHead = head;

            while (current != null) {

                SequenceNode next = current.getNext();

                current.setNext(previous);

                previous = current;

                current = next;
            }
            head = previous;

            tail = oldHead;

        }     


    }

        
    


    


