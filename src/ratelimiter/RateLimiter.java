package ratelimiter;

import java.util.*;

class Client{

    int requests;
    long resetTime;

}

public class RateLimiter {

    private HashMap<String,Client> clients = new HashMap<>();

    private final int LIMIT = 1000;

    public boolean checkLimit(String clientId){

        Client c = clients.getOrDefault(clientId,new Client());

        if(System.currentTimeMillis()>c.resetTime){
            c.requests = 0;
            c.resetTime = System.currentTimeMillis()+3600000;
        }

        if(c.requests < LIMIT){
            c.requests++;
            clients.put(clientId,c);
            return true;
        }

        return false;

    }

}