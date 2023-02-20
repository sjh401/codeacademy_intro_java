// Program to see if there is a protein in a strand of DNA

public class DNA {
    public static void main(String[] args) {
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
    
        String dna = dna3;
    
        int ATG = dna.indexOf("ATG");
        int TGA = dna.indexOf("TGA");
    
        if(ATG > -1 
        && TGA > -1
        && dna.substring(3,TGA).length() % 3 == 0){
            String protein = dna.substring(ATG,TGA+3);
            System.out.println(protein);
        } else {
            System.out.println("No Protein");
        }
    } 
}