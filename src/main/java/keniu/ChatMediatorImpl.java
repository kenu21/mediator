package keniu;

import keniu.users.User;
import keniu.users.UserType;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void registerUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            switch (sender.getType()) {
                case ADMIN -> user.receive("[from ADMIN " + sender + "] " + message);
                case REGULAR -> {
                    if (!user.equals(sender)) {
                        user.receive("[from USER " + sender + "] " + message);
                    }
                }
                case BOT -> {
                    if (user.getType() == UserType.ADMIN) {
                        user.receive("[from BOT] " + message);
                    }
                }
            }
        }
    }
}
