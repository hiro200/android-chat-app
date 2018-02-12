package id.hawari.nongki;

import java.util.Date;

public class Model {

    /***
     * Chat model
     */
    public static class Chat {
        String roomId, name, message, time;
        int count;
        public Chat(String roomId, String name, String message, String time, int count) {
            this.roomId = roomId;
            this.name = name;
            this.message = message;
            this.time = time;
            this.count = count;
        }
    }

    /***
     * Chat model
     */
    public static class User {
        String userId, name, email, bio, image;
        boolean isLoggedIn;
        Date lastSeen, registeredAt;
        public User(String userId, String name, String email, String bio, String image, boolean isLoggedIn, Date lastSeen, Date registeredAt) {
            this.userId = userId;
            this.name = name;
            this.email = email;
            this.bio = bio;
            this.image = image;
            this.isLoggedIn = isLoggedIn;
            this.lastSeen = lastSeen;
            this.registeredAt = registeredAt;
        }
    }
}