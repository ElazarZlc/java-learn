import java.util.Scanner;

class Chat {
    public static void main(String[] args){
        System.out.println("hi! what do you want to talk about?");
        Scanner scanner = new Scanner(System.in);
        String statement = scanner.nextLine();
        ChatterBot bot = new ChatterBot();
        
        while (true) {
            String reply = bot.replyTo(statement);
            System.out.println(reply);
            statement = scanner.nextLine();
            
        }
        
    }
}

