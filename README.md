

🧬 Protein Translation Pipeline (Java)

📌 Description

A Java console application that simulates a biological protein translation pipeline using core data structures. DNA sequences are processed through transcription (DNA → RNA) and translation (RNA → Protein), demonstrating how multiple data structures can work together in a real-world system.

⸻

🚀 Features

* Add DNA sequences to a processing queue (FIFO)
* Process sequences through a full pipeline:
    * DNA → RNA (transcription)
    * RNA → Protein (translation)
* Store processed proteins in a stack (LIFO)
* Undo the most recent protein translation
* View next DNA sequence (queue peek)
* View last processed protein (stack peek)
* Print DNA queue and protein history

⸻

🧠 Concepts Demonstrated

* Queue (First-In-First-Out processing)
* Stack (Last-In-First-Out history tracking)
* Linked List implementation (custom nodes)
* Data structure integration into a system
* String processing and pattern mapping
* Control flow and menu-driven applications

⸻

🧬 Biological Simulation

🔹 Transcription (DNA → RNA)

Base pairing rules:

* A → U
* T → A
* C → G
* G → C

Example:
DNA: ATGC → RNA: UACG

⸻

🔹 Translation (RNA → Protein)

RNA is read in codons (groups of 3):

Example:
RNA: AUGUUU → Protein: MF

* AUG → Methionine (M, start codon)
* UUU → Phenylalanine (F)
* STOP codons terminate translation

⸻

⚙️ How It Works

DNA Queue → Transcription → Translation → Protein Stack

1. DNA is added to a queue
2. The next sequence is processed
3. It is transcribed into RNA
4. RNA is translated into a protein sequence
5. The result is stored in a stack for history and undo functionality

⸻

📋 Menu Options

1. Add DNA Sequence
2. Process Next Sequence
3. View Next DNA Sequence
4. View Last Protein
5. Undo Last Translation
6. Print DNA Queue
7. Print Protein History
8. Exit

⸻

▶️ How to Run

Compile

javac *.java

Run

java Main

⸻

🧩 Project Structure

* SequenceNode.java → Linked list node
* BioSequenceQueue.java → Queue implementation
* MutationStack.java → Stack implementation
* ProteinTranslator.java → Transcription & translation logic
* Main.java → User interface and system integration

⸻

💡 Key Learning Outcomes

* Building and integrating multiple data structures
* Understanding real-world applications of stacks and queues
* Implementing linked data structures from scratch
* Designing a multi-step processing pipeline

⸻

🔮 Future Improvements

* Expand full codon-to-amino acid mapping
* Validate DNA input sequences
* Add file input/output support
* Visualize the pipeline with a GUI
* Add reverse translation (protein → RNA)

⸻

👨‍💻 Author

Richard Ricketts

⸻
