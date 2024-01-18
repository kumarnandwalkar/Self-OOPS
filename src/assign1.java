import java.util.Scanner;

class Participant {
    private static int counter;
    private String Reg_ID;
    private String name;
    private int contact_number;
    private String branch;
    public Participant(String name, int contact_number, String branch) {
        this.name = name;
        this.contact_number = contact_number;
        this.branch = branch;

        Reg_ID = "D" + counter;
        counter++;
    }
    static {
        counter = 1001;
    }

    public String getReg_ID() {
        return Reg_ID;
    }

    public int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public long getcontact_number() {
        return contact_number;
    }

    public String getBranch() {
        return branch;
    }
}

class Tester {

    private static Participant createParticipantFromUserInput(Scanner scanner) {
        System.out.print("Enter participant name: ");
        String name = scanner.nextLine();

        System.out.print("Enter contact number: ");
        int contact_number = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter branch: ");
        String branch = scanner.nextLine();

        return new Participant(name, contact_number, branch);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Participant participant1 = createParticipantFromUserInput(scanner);
        Participant participant2 = createParticipantFromUserInput(scanner);
        Participant participant3 = createParticipantFromUserInput(scanner);
        Participant participant4 = createParticipantFromUserInput(scanner);


        Participant[] participants = {participant1, participant2,participant3,participant4};

        for (Participant participant : participants) {
            System.out.println("Hi " + participant.getName() + "! Your registration id is " +
                    participant.getReg_ID() + "your branch is: " + participant.getBranch() + "your contact number is: " + participant.getcontact_number());
        }
        scanner.close();
    }
}