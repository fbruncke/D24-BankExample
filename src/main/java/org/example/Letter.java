package org.example;

public class Letter {
    private String recipient;
    private String sender;

    public Letter(String recipient, String sender) {
        this.recipient = recipient;
        this.sender = sender;

        int i = 0;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSender() {
        return sender;
    }
}
