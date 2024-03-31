import java.util.Random;

class ChatterBot {

    static final String REQUEST_PREFIX = "Say ";
    static final String REQUEST_PHRASE_PLACEOLDER = "<phrase>";
    String[] repleisToRequest;
    Random random = new Random();
    String name;


    ChatterBot(String name, String[] repleisToRequest){
        this.name = name;
        this.repleisToRequest = new String[repleisToRequest.length];
       
        for(int i=0;i<repleisToRequest.length;i++){
            this.repleisToRequest[i] = repleisToRequest[i];
        }
    }

    String replyTo(String statement){
        if(statement.startsWith(REQUEST_PREFIX)){
            statement = statement.replaceFirst(REQUEST_PREFIX, "");
        }
        int randomIndex = random.nextInt(repleisToRequest.length);
        return repleisToRequest[randomIndex].replaceAll(REQUEST_PHRASE_PLACEOLDER, statement);
         
       
}

   
    String getName() {
        return this.name;
    }
}