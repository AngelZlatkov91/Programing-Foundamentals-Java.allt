package FundamentalsFinalExam;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class MessagesManager_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int capacity = Integer.parseInt(scanner.nextLine());
        Map<String,Integer> sentMessage = new LinkedHashMap<>();
        Map<String,Integer> receivedMessage = new LinkedHashMap<>();
        int count = 0;
      String input = scanner.nextLine();
        while (!input.equals("Statistics")) {
            String[] tokens  = input.split("=");
            if (tokens[0].equals("Add")) {
                String userName = tokens[1];
                int sent = Integer.parseInt(tokens[2]);
                int received = Integer.parseInt(tokens[3]);
                if (!sentMessage.containsKey(userName)) {
                    count++;
                    sentMessage.put(userName,sent);
                    receivedMessage.put(userName,received);
                }
            } else if (tokens[0].equals("Message")) {
                String sender = tokens[1];
                String receiver = tokens[2];
                if (sentMessage.containsKey(sender) && sentMessage.containsKey(receiver)) {
                    int currentSend = sentMessage.get(sender);
                    int currentReceiver = receivedMessage.get(receiver);
                    sentMessage.put(sender,currentSend+1);
                    receivedMessage.put(receiver,currentReceiver+1);
                    String name = "";
                    if ((sentMessage.get(sender) + receivedMessage.get(sender)) >= capacity) {
                        name = sender;
                        sentMessage.remove(sender);
                        receivedMessage.remove(sender);
                        count--;
                        System.out.println(name + " reached the capacity!");
                    }

                    if ((receivedMessage.get(receiver) + sentMessage.get(receiver)) >= capacity) {
                        name = receiver;
                        sentMessage.remove(receiver);
                        receivedMessage.remove(receiver);
                        count--;
                        System.out.println(name + " reached the capacity!");
                    }
                }

            } else if (tokens[0].equals("Empty")) {
                String userName = tokens[1];
                if (sentMessage.containsKey(userName)) {
                    count--;
                    sentMessage.remove(userName);
                    receivedMessage.remove(userName);
                } else if (userName.equals("All")) {
                    sentMessage = new LinkedHashMap<>();
                    receivedMessage = new LinkedHashMap<>();
                    count = 0;
                }
            }
            input = scanner.nextLine();
        }
        if (count ==0) {
            System.out.println("Users count: 0");
        } else {
            System.out.println("Users count: " + count);
            for (Map.Entry<String, Integer> entry : sentMessage.entrySet()) {
                String name = entry.getKey();
                int send = entry.getValue();
                int receive = receivedMessage.get(entry.getKey());
                System.out.println(name + " - " + (send + receive));
            }

        }




    }
}
