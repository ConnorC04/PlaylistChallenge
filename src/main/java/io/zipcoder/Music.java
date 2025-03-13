package io.zipcoder;

import java.util.ArrayList;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        ArrayList<Integer> idx = new ArrayList<>();

        for (int i = 0; i < playList.length; i++){
            if (playList[i].equals(selection)){
                idx.add(i);
            }
        }

        int minDistance = Integer.MAX_VALUE;
        for (int j = 0; j < idx.size(); j++){
            if ((playList.length - idx.indexOf(j)) < minDistance){
                minDistance = idx.get(j) -1;
            }

        }


        return minDistance;
    }
}
