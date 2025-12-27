package keniu.users;

import keniu.ChatMediator;

import java.util.Objects;

public abstract class User {
    protected final ChatMediator chatMediator;
    protected final String name;

    protected User(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    public abstract void send(String message);

    public abstract void receive(String message);

    public abstract UserType getType();

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof User user)) return false;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
