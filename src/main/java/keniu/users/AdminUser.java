package keniu.users;

import keniu.ChatMediator;

public class AdminUser extends User {
    public AdminUser(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println("Admin is sending message...");
        chatMediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.printf("Admin with name %s is reading message: %s%n", name, message);
    }

    @Override
    public UserType getType() {
        return UserType.ADMIN;
    }
}
