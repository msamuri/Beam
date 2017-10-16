package com.example.grace.messaging;
//
//
// Taken from
// http://www.devexchanges.info/2016/03/design-chat-bubble-ui-in-android.html
//
//

/**
 * Created by evanl on 28/09/2017.
 */

public class ChatMessage {

    private String content;
    private boolean isMine;
    private String sender;

    public ChatMessage(String content, boolean isMine, String sender) {
        System.out.println("It is mine is " + isMine);

        this.content = content;
        this.isMine = isMine;
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public boolean isMine() {
        return isMine;
    }

    public String getSender() {
        return sender;
    }
}
