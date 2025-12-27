package keniu.users;

import keniu.ChatMediator;

public class RegularUser extends User {
    public RegularUser(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println("Regular user is sending message...");
        chatMediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.printf("Regular user with name %s is reading message: %s%n", name, message);
    }

    @Override
    public UserType getType() {
        return UserType.REGULAR;
    }
}
