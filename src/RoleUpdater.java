import net.dv8tion.jda.core.events.role.RoleCreateEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import java.util.Scanner;

public class RoleUpdater extends ListenerAdapter {
    public void onRoleCreate​(RoleCreateEvent event){
        Scanner scan = new Scanner(System.in);
        String role = event.getRole().getName();

        if(role.startsWith("!addrole")){
            String respond = "Enter new role: ";
            scan.nextLine();
            String name = event.getRole().getName();
            String response = name + ", new role is created";
            event.getRole();
        }
    }
}
