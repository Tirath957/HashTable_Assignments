package plagiarism;

import java.util.*;

public class PlagiarismDetector {

    private HashMap<String,Set<String>> ngramIndex = new HashMap<>();

    public void indexDocument(String docId,String text){

        String[] words = text.split(" ");

        for(int i=0;i<words.length-4;i++){

            String gram = words[i]+" "+words[i+1]+" "+words[i+2]+" "+words[i+3]+" "+words[i+4];

            ngramIndex.putIfAbsent(gram,new HashSet<>());
            ngramIndex.get(gram).add(docId);

        }

    }

}
