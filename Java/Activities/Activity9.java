package Acivities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("apple");
        myList.add("mango");
        myList.add("orange");
        myList.add(3,"Grapes");
        myList.add(1, "papaya");
        System.out.printf("Print all the objects");
        for (String s:myList){
            System.out.printf(s);
        }
        System.out.printf("3rd element in the list is:" + myList.get(2));
        System.out.printf("Is chicku is in list: " + myList.contains("chicku"));
        System.out.printf("Size of the ArrayList:" + myList.size());
        myList.remove("papaya");
        System.out.printf("new size of ArrayList:" + myList.size());

    }
}
