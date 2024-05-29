package org.example;

public class Messages {
    private int message_id;
    private String message_content;
    private int user_id;
    private String message_date;

    public Messages() {

    }

    public Messages(String message_content, int user_id, String message_date) {
        this.message_content = message_content;
        this.user_id = user_id;
        this.message_date = message_date;
    }

    public String getMessage_content() {
        return message_content;
    }

    public void setMessage_content(String message_content) {
        this.message_content = message_content;
    }

    public String getMessage_date() {
        return message_date;
    }

    public void setMessage_date(String message_date) {
        this.message_date = message_date;
    }

    public int getMessage_id() {
        return message_id;
    }

    public void setMessage_id(int message_id) {
        this.message_id = message_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Messages{" +
                "message_content='" + message_content + '\'' +
                ", message_id=" + message_id +
                ", user_id=" + user_id +
                ", message_date='" + message_date + '\'' +
                '}';
    }
}
