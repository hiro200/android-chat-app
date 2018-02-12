package id.hawari.nongki;

import java.util.Date;

public class Model {

    /***
     * Chat model
     */
    public static class Chat {
        String id, roomId, name, message, time, senderId;
        int count;
        public Chat(String id, String roomId, String senderId, String name, String message, String time, int count) {
            this.roomId = roomId;
            this.id = id;
            this.name = name;
            this.message = message;
            this.time = time;
            this.senderId = senderId;
            this.count = count;
        }
    }

    /***
     * Chat model
     */
    public static class User {
        String id, name, email, bio, image;
        boolean isLoggedIn;
        Date lastSeen, registeredAt;
        public User(String id, String name, String email, String bio, String image,
                    boolean isLoggedIn, Date lastSeen, Date registeredAt) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.bio = bio;
            this.image = image;
            this.isLoggedIn = isLoggedIn;
            this.lastSeen = lastSeen;
            this.registeredAt = registeredAt;
        }
    }

    /***
     * Room model
     */
    public static class Room {
        String id, name, members, creatorId;

        public Room(String id, String name, String members, String creatorId) {
            this.id = id;
            this.name = name;
            this.members = members;
            this.creatorId = creatorId;
        }
    }
}