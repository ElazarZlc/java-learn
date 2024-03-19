
class ChatterBot {
    String replyTo(String statement){
        if(statement.startsWith("say ")){
            return statement.replace("say ", "");
        }
        return "what";
    }
}