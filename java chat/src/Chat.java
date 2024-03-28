import java.util.Scanner;

class Chat {
    public static void main(String[] args) {
        System.out.println("hi! what do you want to talk about?");
        Scanner scanner = new Scanner(System.in);
        String statement = scanner.nextLine();
        String[] repleisToLegalRequest = {
                "You want my to say " + ChatterBot.REQUEST_PHRASE_PLACEOLDER + ", do you? alright: "
                        + ChatterBot.REQUEST_PHRASE_PLACEOLDER,
                "OK here goes: " + ChatterBot.REQUEST_PHRASE_PLACEOLDER };
        String[] repleisToIllegalRequest = {
                "Say what? " + ChatterBot.ILLEGAL_REQUEST_PLACEHOLDER + " what's "
                        + ChatterBot.ILLEGAL_REQUEST_PLACEHOLDER,
                "i don't want to say: " + ChatterBot.ILLEGAL_REQUEST_PLACEHOLDER};

        ChatterBot[] bots = new ChatterBot[2];
        bots[0] = new ChatterBot("Moshe", repleisToLegalRequest, repleisToIllegalRequest);
        bots[1] = new ChatterBot("Elazar", repleisToLegalRequest, repleisToIllegalRequest);
        int indexOfCarBot = 0;
        while (!statement.equals("finish")) {
            statement = bots[indexOfCarBot].replyTo(statement);
            System.out.print("bot " + bots[indexOfCarBot].getName() + " say: " + statement);
            scanner.nextLine();
            indexOfCarBot = 1 - indexOfCarBot;
        }
    }
}
