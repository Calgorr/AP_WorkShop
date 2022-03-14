
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //nokte ghabel tavajoh ine ke dar inja 4 halat asli barname test shode ba yek halat az random voting
        //va az tarafi dar har kodoom az 4 halat az yeki az person ha estefade shode ke be rahati mishe menu tashkil dad
        //va barname ro kamel tar kard vali dar dastoor kar faqat zekr shode ke barname test beshe
        Scanner input = new Scanner(System.in);
        VotingSystem votingSystem = new VotingSystem();
        Person person1 = new Person("Amirali", "Homayonui");
        Person person2 = new Person("Amir", "Homayoun");
        Person person3 = new Person("mahdi", "Homayoon");
        Person person4 = new Person("mahi", "Homayoon");
        ArrayList<String> choices = new ArrayList<>();
        choices.add("Are");
        choices.add("na");
        choices.add("faghat yekam");
        choices.add("nazari nadaram");
        choices.add("mikham az forsat zang zadan be pedaram estefade bokonam");
        votingSystem.createVoting("ghormesabzi doost dari", true, 1, choices);
        votingSystem.createVoting("ghormesabzi doost dari", true, 0, choices);
        votingSystem.createVoting("gheyme doost dari", false, 1, choices);
        votingSystem.createVoting("gheyme doost dari", false, 0, choices);
        System.out.println("So if you want to see the example of a voting which is anonymous and with multiple choices enter 1");
        System.out.println("So if you want to see the example of a voting which is anonymous and without multiple choices enter 2");
        System.out.println("So if you want to see the example of a voting which is not anonymous and with multiple choices enter 3");
        System.out.println("So if you want to see the example of a voting which is not anonymous and without multiple choices enter 4");
        System.out.println("if you want to see the random voting enter 5");
        int whichone;
        whichone = input.nextInt();
        if (whichone == 1) {
            votingSystem.printVoting(0);
            ArrayList<String> order1 = new ArrayList<>();
            String order = new String();
            System.out.println("if you want to stop enter 0");
            do {
                order = input.next();
                if (order.charAt(0) != '0')
                    order1.add(order);
            } while (order.charAt(0) != '0');
            votingSystem.getVoting(0).vote(person1, order1);
            votingSystem.printResults(0);
        } else if (whichone == 2) {
            votingSystem.printVoting(1);
            ArrayList<String> order1 = new ArrayList<>();
            String order = new String();
            System.out.println("enter your choice");
            order = input.next();
            if (order.charAt(0) != '0') {
                order1.add(order);
            }
            votingSystem.getVoting(1).vote(person2, order1);
            votingSystem.printResults(1);
        } else if (whichone == 3) {
            votingSystem.printVoting(2);
            ArrayList<String> order1 = new ArrayList<>();
            String order = new String();
            System.out.println("if you want to stop enter 0");
            do {
                order = input.next();
                if (order.charAt(0) != '0')
                    order1.add(order);
            } while (order.charAt(0) != '0');
            votingSystem.getVoting(2).vote(person3, order1);
            votingSystem.printVoters(2);
        } else if (whichone == 4) {
            votingSystem.printVoting(4);
            ArrayList<String> order1 = new ArrayList<>();
            String order = new String();
            System.out.println("enter your choice");
            order = input.next();
            if (order.charAt(0) != '0') {
                order1.add(order);
            }
            votingSystem.getVoting(3).vote(person4, order1);
            votingSystem.printVoters(3);
        }
        else if(whichone==5){
            votingSystem.printVoting(2);
            votingSystem.getVoting(2).vote(person4);
            votingSystem.printVoters(2);
        }
    }
}