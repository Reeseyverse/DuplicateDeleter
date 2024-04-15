package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }
    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        Map<String, Integer> freqMap = new HashMap<>();
        for(String string : array){
            freqMap.put(string, freqMap.getOrDefault(string, 0) + 1);
        }

        List<String> results = new ArrayList<>();

        for(String string : array){
            if(freqMap.get(string) < maxNumberOfDuplications){
                results.add(string);
            }
        }
        return results.toArray(new String[0]);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Map<String, Integer> freqMap = new HashMap<>();
        for(String string : array){
            freqMap.put(string, freqMap.getOrDefault(string, 0) + 1);
        }

        List<String> results = new ArrayList<>();

        for(String string : array){
            if(freqMap.get(string) != exactNumberOfDuplications){
                results.add(string);
            }
        }
        return results.toArray(new String[0]);
    }

}
