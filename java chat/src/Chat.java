import java.util.Scanner;

class Chat {
    public static void main(String[] args){
        System.out.println("hi! what do you want to talk about?");
        Scanner scanner = new Scanner(System.in);
        String statement = scanner.nextLine();
        String[] repleisToIllegalRequest = {"what ", "say i should say ", "WTF "};
        ChatterBot bot1 = new ChatterBot(repleisToIllegalRequest);
        while (!statement.equals("finish")) {
            String reply = bot1.replyTo(statement);
            System.out.println(reply);
            statement =scanner.nextLine();
        }
    }
}

