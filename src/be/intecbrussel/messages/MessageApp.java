package be.intecbrussel.messages;

public class MessageApp {
    public static void main(String[] args) {
//        System.out.println(Message.GREETING.getMessageText());
//        System.out.println(Message.BYEBYE.toString());
//        System.out.println(Message.FOOD);
//        System.out.println(Message.WORK);

        Message[] messages = Message.values();

        for (Message message : messages) {
            System.out.println(message.ordinal());
            System.out.println(message.name());
            System.out.println(message);
            System.out.println("-------------------------");
        }

        Message myMessage = Message.valueOf("FOOD");
        System.out.println(myMessage);

    }
}
