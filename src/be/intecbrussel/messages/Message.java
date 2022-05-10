package be.intecbrussel.messages;

public enum Message {
    GREETING("Hey, how are you"),
    BYEBYE("I'll talk to you later"),
    FOOD("Do you wanna go grab something to eat"),
    WORK("I am working at the train station, choo choo");

    private String messageText;

    private Message(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageText(){
        return messageText;
    }

    @Override
    public String toString() {
        return getMessageText();
    }
}
