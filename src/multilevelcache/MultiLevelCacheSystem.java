package multilevelcache;

import java.util.*;

public class MultiLevelCacheSystem {

    private HashMap<String,String> L1 = new HashMap<>();
    private HashMap<String,String> L2 = new HashMap<>();

    public String get(String key){

        if(L1.containsKey(key))
            return L1.get(key);

        if(L2.containsKey(key)){

            String value = L2.get(key);

            L1.put(key,value);

            return value;

        }

        return "Cache miss";

    }

}
