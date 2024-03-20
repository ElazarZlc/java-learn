import java.util.Scanner;

class Chat {
    public static void main(String[] args){
        System.out.println("hi! what do you want to talk about?");
        Scanner scanner = new Scanner(System.in);
        String statement = scanner.nextLine();
        String[] repleisToIllegalRequest = {"what ", "say i should say ", "WTF "};
        ChatterBot[] bots = new ChatterBot[2];
        bots[0] = new ChatterBot(repleisToIllegalRequest);
        repleisToIllegalRequest[1] = "say say ";
        bots[1] = new ChatterBot(repleisToIllegalRequest);
        int indexOfCarBot = 0;
        while (true) {
            statement = bots[indexOfCarBot].replyTo(statement);
            System.out.print(statement);
            scanner.nextLine();
        }
    }
}

