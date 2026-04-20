import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BioSequenceQueue queue = new BioSequenceQueue();

        MutationStack stack = new MutationStack();

        ProteinTranslator translator = new ProteinTranslator();

        queue.addSequence("ATGC");
        queue.addSequence("TTTAAA");
        queue.addSequence("GGGCCC");

        Scanner input = new Scanner(System.in);

        while (true) { 

            runMenu();

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter DNA Sequence:");
                    String dna = input.nextLine();

                    queue.addSequence(dna);

                    System.out.println("Sequence added to DNA Queue");
                    System.out.println();
                }
                case 2 -> {
                    String dna = queue.processNextSequence();

                    if (dna == null) {

                        System.out.println("DNA Queue is empty");
                    } else {
                        String rna = translator.transcribeDNA(dna);

                        String protein = translator.translateRNA(rna);

                        stack.push(protein);

                        System.out.println("DNA: " + dna);
                        System.out.println("RNA: " + rna);
                        System.out.println("Protein: " + protein);
                        System.out.println();
                    }
                    
                }
                case 3 -> {
                    String dna = queue.peekNextSequence();

                    if (dna == null) {

                        System.out.println("DNA Queue is empty");
                    } else {

                        System.out.println("Next DNA Sequence: " + dna);
                        System.out.println();
                    }
                }
                case 4 -> {
                    String protein = stack.peek();

                    if (protein == null) {
                         System.out.println("No Protein History");
                    } else {
                        System.out.println("Last Protein:" + protein);
                        System.out.println();
                    }
                }
                case 5 -> {
                    String protein = stack.pop();

                    if (protein == null) {

                        System.out.println("No Protein History");
                    } else {
                        System.out.println("Removed " + protein);
                    }
                }
                case 6 -> {
                    queue.printQueue();
                    System.out.println();
                }
                case 7 -> {
                    stack.printStack();
                    System.out.println();
                }
                case 8 -> {
                    System.out.println("Exiting...");
                    input.close();
                    return;

                }
                default -> {
                    System.out.println("Invalid choice");
                }
            }

        }
        
    }














    public static void runMenu() {
        System.out.println("1. Add DNA Sequence");
        System.out.println("2. Process Next Sequence");
        System.out.println("3. View Next DNA Sequence");
        System.out.println("4. View Last Protein");
        System.out.println("5. Undo Last Translation");
        System.out.println("6. Print DNA Queue");
        System.out.println("7. Print Protein History");
        System.out.println("8. Exit");
        System.out.println("Enter your choice: ");
    }
   

 }