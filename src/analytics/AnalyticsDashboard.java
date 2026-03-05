package analytics;

import java.util.*;

public class AnalyticsDashboard {

    private HashMap<String,Integer> pageViews = new HashMap<>();
    private HashMap<String,Set<String>> uniqueVisitors = new HashMap<>();

    public void processEvent(String url,String userId){

        pageViews.put(url,pageViews.getOrDefault(url,0)+1);

        uniqueVisitors.putIfAbsent(url,new HashSet<>());
        uniqueVisitors.get(url).add(userId);

    }

}