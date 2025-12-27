package keniu;

import keniu.users.AdminUser;
import keniu.users.BotUser;
import keniu.users.RegularUser;
import keniu.users.User;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImpl();
        User admin = new AdminUser(chatMediator, "Yurii");
        User regular = new RegularUser(chatMediator, "Viktor");
        User bot = new BotUser(chatMediator, "Andrii");
        chatMediator.registerUser(admin);
        chatMediator.registerUser(regular);
        chatMediator.registerUser(bot);
        admin.send("Hi there. It's admin");
        regular.send("Hi everyone. It's Viktor");
        bot.send("Hi. It's service message from bot");
    }
}
