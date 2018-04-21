import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class MessageRespond extends ListenerAdapter {
    public void onMessageReceived​(MessageReceivedEvent event){
        String message = event.getMessage().getContent();

        if (message.startsWith("k!hello")){
            String name = event.getAuthor().getAsMention();
            String respond = name + ", hello and welcome.";
            event.getTextChannel().sendMessage(respond).queue();
        }else if (message.startsWith("k!scramble")){
            String name = event.getAuthor().getName();
            String respond = name + ", get ready to fight.";
            event.getTextChannel().sendMessage(respond).queue();
        }else if (message.startsWith("k!ping")) {
            String respond = "Ping";
            event.getTextChannel().sendMessage(respond).queue();
        }else if (message.startsWith("k!ask")) {
            String respond = "State your question!";
            event.getTextChannel().sendMessage(respond).queue();
        }else if (message.startsWith("k!flip")) {
            String respond = "This feature is still unavailable for now";
            event.getTextChannel().sendMessage(respond).queue();
        }else if (message.startsWith("k!nyan")) {
            String respond = "Nyan Nyan";
            event.getTextChannel().sendMessage(respond).queue();
        }else if (message.startsWith("k!RNG")){
            double number = Math.floor(Math.random()*1001);
            String name = event.getAuthor().getAsMention();
            String respond = name + ", your number is: " + number ;
            event.getTextChannel().sendMessage(respond).queue();
        }else if (message.startsWith("k!help")) {
            String name = event.getAuthor().getAsMention();
            String respond = name + ", here is the command list :\n"
                    + "- k!hello\n"
                    + "- k!ping\n"
                    + "- k!scramble\n"
                    + "- k!ask\n"
                    + "- k!addrole (still unavailable)\n"
                    + "- k!nyan\n"
                    + "- k!RNG\n"
                    + "- k!flip (unavailable for now)";
            event.getTextChannel().sendMessage(respond).queue();
        }
    }
}
