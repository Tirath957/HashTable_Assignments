package autocomplete;

import java.util.*;

public class AutocompleteSystem {

    private HashMap<String,Integer> queries = new HashMap<>();

    public void addQuery(String query){

        queries.put(query,queries.getOrDefault(query,0)+1);

    }

    public List<String> search(String prefix){

        List<String> results = new ArrayList<>();

        for(String q:queries.keySet()){

            if(q.startsWith(prefix))
                results.add(q);

        }

        return results;

    }

}
