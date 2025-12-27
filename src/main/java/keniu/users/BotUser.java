package keniu.users;

import keniu.ChatMediator;

public class BotUser extends User {
    public BotUser(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println("Bot is sending message...");
        chatMediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.printf("Bot with name %s is reading message: %s%n", name, message);
    }

    @Override
    public UserType getType() {
        return UserType.BOT;
    }
}
