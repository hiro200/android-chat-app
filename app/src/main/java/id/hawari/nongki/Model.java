package id.hawari.nongki;

public class Model {

    public static class Chat {

        String roomId;
        String name;
        String message;
        String time;
        int count;

        public Chat(String roomId, String name, String message, String time, int count) {
            this.roomId = roomId;
            this.name = name;
            this.message = message;
            this.time = time;
            this.count = count;
        }
    }

}
