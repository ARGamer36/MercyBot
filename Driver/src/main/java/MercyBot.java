import commands.MercyMain;
import main.BotDriver;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class MercyBot extends BotDriver {
    @Override
    protected void setup() {
        VERSION = "1.0";
        activity = Activity.playing("Overwatch 3");
        TOKEN = "TEST_BOT";
    }

    public MercyBot() throws LoginException {
        super();
        shardManager.addEventListener(new MercyMain(VERSION));
    }
    public static void main(String[] args) {
        try {
            MercyBot bot = new MercyBot();
        } catch (LoginException e) {
            System.out.println("ERROR: provided bot token invalid");
        }
    }
}
