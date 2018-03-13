package elections;

public class Main {

    public static void main(String[] args) {

        Elections elections = new Elections();

        Vote v1 = new Vote("Yossi");
        Vote v2 = new Vote("Yossi");
        Envelope actualVote1 = new Envelope("123", v1);
        Envelope actualVote2 = new Envelope("123", v2);

        Vote v2b = new Vote("Yossi");
        Envelope actualVote3 = new Envelope("124", v2b);

        Vote v3 = new Vote("David");
        Envelope actualVote4 = new Envelope("125", v3);

        elections.castVote(actualVote1);
        elections.castVote(actualVote2);
        elections.castVote(actualVote3);
        elections.castVote(actualVote4);

        // elections are done
        elections.calcResults();
        System.out.println(elections.getResults());
    }

}
