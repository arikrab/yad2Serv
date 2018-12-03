package com.company;

import java.util.ArrayList;
import java.util.List;

public class HashItemList {
    private String name;
    private Integer hashCode;
    private List<String> userItemList;



    public HashItemList(){
            this.name=null;
            this.hashCode=null;
            userItemList=null;
        };








        public void addItem(String item){
            userItemList.add(item);
        }
        public void removeItem(String item){
            int removeIndex;
        if (userItemList.contains(item)==true){
            removeIndex=userItemList.indexOf(item);
            userItemList.remove(removeIndex);
            System.out.println(item+" has been removed");

        }
        else{
            System.out.println("no such item is found");
        }
    }

    @Override
    public int hashCode() {
       return this.hashCode;
    }
}
