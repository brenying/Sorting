package week.pkg8.sorting;

import java.util.ArrayList;
//import java.util.Collections;

public class Week8Sorting {

    public static void main(String[] args) {
        ArrayList<house> houses = new ArrayList<>();
        
        houses.add(new house(100, 80, 2, "MidMod", "White"));
        houses.add(new house(400, 70, 6, "Apt", "Brown"));
        houses.add(new house(150, 60, 1, "Ranch", "Blue"));
        houses.add(new house(90, 200, 2, "Split", "Red"));
        houses.add(new house(120, 50, 3, "McMansion", "Yellow"));
        
        // before sort
        System.out.println(houses);
        
        //Collections.sort(houses);
         houses.sort((h1, h2) -> { quickSort(houses, 0, houses.size() - 1); return 0; });
         
        // after sort
        System.out.println(houses);
    }
 public static void quickSort(ArrayList<house> list, int low, int high) {
        if (low < high) {
            int pi = partition(list, low, high);
            quickSort(list, low, pi - 1);
            quickSort(list, pi + 1, high);
        }
    }

    public static int partition(ArrayList<house> list, int low, int high) {
        house pivot = list.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (list.get(j).compareTo(pivot) <= 0) {
                i++;
                swap(list, i, j);
            }
        }

        swap(list, i + 1, high);
        return i + 1;
    }

    public static void swap(ArrayList<house> list, int i, int j) {
        house temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
