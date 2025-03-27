package Week05.arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] hari = new String[7];
        hari[0] = "Senin";
        hari[1] = "Selasa";
        hari[2] = "Rabu";
        hari[3] = "Kamis";
        hari[4] = "Jumat";

        System.out.println(hari[2]);

        for (String h : hari) {
            System.out.println(h);
        }

            ArrayList<String> days = new ArrayList<>();
            days.add("Senin");
            days.add("Selasa");
            days.add("Rabu");

            System.out.println(days.get(2));

            days.set(1, "Minggu");
            System.out.println(days.get(1));

            days.remove(0);
            System.out.println(days.get(0));

            System.out.println(days.size());
   
        }
    }

