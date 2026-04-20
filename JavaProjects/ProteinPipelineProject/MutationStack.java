public class MutationStack {

    //Fields
    private SequenceNode head;

    //Constructor
    public MutationStack() {

        head = null;
    }

    //Methods



    //Add a sequence to the top 
    public void push(String sequence) {

        SequenceNode newNode = new SequenceNode(sequence);

        newNode.setNext(head);

        head = newNode;
    }



    //Remove a sequence from the top 
    public String pop() {

        if (head == null) {

            return null;
        }

        String sequence = head.getSequence();

        head = head.getNext();

        return sequence;
    }



    public String peek() {

        if (head == null) {
            
            return null;
        }
      return head.getSequence();
    }




    public int stackSize() {

        if (head == null) {

            return 0;
        }

        SequenceNode current = head;

        int count = 0;

        while (current != null) {

            count++;

            current = current.getNext();
        }

        return count;
     }



     public void printStack() {

        SequenceNode current = head;

        while (current != null) {

            System.out.println(current.getSequence());

            current = current.getNext();
        }
     }


}