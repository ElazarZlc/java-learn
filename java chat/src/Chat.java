import java.util.Scanner;

class Chat {
    public static void main(String[] args) {
        System.out.println("\u001B[35m"+"hi! what do you want to talk about?"+ "\u001B[35m");
        Scanner scanner = new Scanner(System.in);
        String statement = scanner.nextLine();
        String[] repleisToRequest = {"\u001B[0m"+
                "You want my to say " + ChatterBot.REQUEST_PHRASE_PLACEOLDER + ", do you? alright: "
                        + ChatterBot.REQUEST_PHRASE_PLACEOLDER + "\u001B[0m","\u001B[30m" +
                "OK here goes: " + ChatterBot.REQUEST_PHRASE_PLACEOLDER + "\u001B[30m","\u001B[31m" +  "Say what? " + ChatterBot.REQUEST_PHRASE_PLACEOLDER + " what's "
                + ChatterBot.REQUEST_PHRASE_PLACEOLDER + "\u001B[31m","\u001B[32m" +
        "i don't want to say: " + ChatterBot.REQUEST_PHRASE_PLACEOLDER + "\u001B[32m"};


        ChatterBot[] bots = new ChatterBot[2];
        bots[0] = new ChatterBot("Moshe", repleisToRequest);
        bots[1] = new ChatterBot("Elazar", repleisToRequest);
        int indexOfCarBot = 0;
        while (!statement.equals("finish")) {
            statement = bots[indexOfCarBot].replyTo(statement);
            System.out.print("bot " + bots[indexOfCarBot].getName() + " say: " + statement);
            scanner.nextLine();
            indexOfCarBot = 1 - indexOfCarBot;
        }
    }
}
