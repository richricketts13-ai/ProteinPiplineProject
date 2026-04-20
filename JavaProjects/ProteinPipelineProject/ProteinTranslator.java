

public class ProteinTranslator {


    public String transcribeDNA(String dna) {

        if (dna == null || dna.length() == 0) {

            return "";

        }

       StringBuilder rna = new StringBuilder();

        for (int i = 0; i < dna.length(); i++) {

            switch (dna.charAt(i)) {
                case 'A' -> rna.append('U');
                case 'T' -> rna.append('A');
                case 'C' -> rna.append( 'G');
                case 'G' -> rna.append('C');
                default -> {
                }
            }
        }
        return rna.toString();
    }



    public String translateRNA(String rna) {

        if (rna == null || rna.length() == 0) {

            return "";
        }


        StringBuilder protein = new StringBuilder();

        for (int i = 0; i <= rna.length() - 3; i += 3) {

        String codon = rna.substring(i, i + 3);

        switch (codon) {
            case "AUG" -> protein.append('M');

            case "UUU", "UUC" -> protein.append('F');

            case "UUA", "UUG" -> protein.append('L');

            case "UAC", "UAU" -> protein.append('Y');

            case "UGU", "UGC" -> protein.append('C');

            case "UGG" -> protein.append('W');

            case "UCA", "UCC" -> protein.append('S');

            case "UAA", "UAG", "UGA" -> {
            return protein.toString(); // STOP
        }
        default -> protein.append('?');
       }
     }
 return protein.toString();
}






     
}