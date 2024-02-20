package com.websocket.demo.chat;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ChatMessage {
    private String content;
    private String sender;
    private String timestamp;
    private MessageType type;
    private int connectedUser;
    private static int user;

    public static int online(){
        return ++user;
    }

    public static int offline(){
        return --user;
    }

    public void setOnlineUser(int user){
        connectedUser = user;
    }





}