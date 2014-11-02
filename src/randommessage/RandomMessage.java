/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randommessage;

import java.util.*;

/**
 *
 * @author emanion
 */
public class RandomMessage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Message> messages = new ArrayList<>();
        
        messages.add(new Message("message 0 "));
        messages.add(new Message("message 1 "));
        messages.add(new Message("message 2 "));
        messages.add(new Message("message 3 "));
        messages.add(new Message("message 4 "));
        
        //generate random indes...
        Random r = new Random();
        
        int low = 0;
        int high = messages.size();
        int randomMessageNumber = r.nextInt(high - low) + low;
        System.out.println("random index= " + randomMessageNumber);
        
        
        Message randomMessage = messages.get(randomMessageNumber);
        System.out.println("Random message..." + randomMessage.toString());
        
        /*
        System.out.println("random message is.. " + 
                messages(randomMessageNumber).toString());
        
        for (int i = 0;i < 10; i++){
            System.out.println(messages(i));
        }
        */
        
        
        
        
        
        }
}
