package dnscache;

import java.util.*;

class DNSEntry{

    String ip;
    long expiryTime;

    DNSEntry(String ip,long ttl){
        this.ip = ip;
        this.expiryTime = System.currentTimeMillis()+ttl;
    }

}

public class DNSCache {

    private HashMap<String,DNSEntry> cache = new HashMap<>();

    public void addEntry(String domain,String ip,long ttl){

        cache.put(domain,new DNSEntry(ip,ttl));

    }

    public String resolve(String domain){

        DNSEntry entry = cache.get(domain);

        if(entry==null)
            return "Cache miss";

        if(System.currentTimeMillis()>entry.expiryTime){
            cache.remove(domain);
            return "Cache expired";
        }

        return entry.ip;

    }

}
