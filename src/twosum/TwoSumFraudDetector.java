package twosum;

import java.util.*;

public class TwoSumFraudDetector {

    public boolean findTwoSum(int[] arr,int target){

        HashSet<Integer> set = new HashSet<>();

        for(int num:arr){

            if(set.contains(target-num))
                return true;

            set.add(num);

        }

        return false;

    }

}