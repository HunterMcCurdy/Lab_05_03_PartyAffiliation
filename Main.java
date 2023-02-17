public class Main {
    public static void main(String[] args) {
        // asks what party affiliation are they
        String partyAffiliation = "O";
        // asks if republican 
        if (partyAffiliation == "R")
        {
            // displays republican saying
            System.out.println("You get a Republican Elephant!");
        }
        // asks if democrat
        else if (partyAffiliation == "D")
        {
            // displays democrat saying
            System.out.println("You get a Democratic Donkey!");
        }
        // asks if independent 
        else if (partyAffiliation == "I")
        {
            // displays independent saying
            System.out.println("You get an Independent Man!");
        }
        else
        {
            // displays other saying
            System.out.println("You support another affiliation!");
        }



    }
}