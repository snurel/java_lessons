import Car.*;

import java.lang.reflect.Array;
import java.util.*;

public class MainUnit {
    public static void main(String[] args) {
//        Wolkswagen wolks = new Wolkswagen();
//        Opel opel = new Opel("cat");
//        Vosvos vosvos = new Vosvos();
//
//        ArrayList<Car> cars = new ArrayList<Car>();
//        cars.add(opel);
//        cars.add(vosvos);
//        cars.add(wolks);


        //ArrayList
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("hakan");
        strings.add("samet");
        strings.add("a");
        strings.add("hakan");
        strings.add(1, "alis");

        if(!strings.contains("hakan")){
            strings.add("hakan");
        }

        ArrayList<String> group1 = new ArrayList<String>();
        group1.add("kasa");
        group1.add("masa");
        group1.add("anahtar");
        group1.add("sandalye");
        group1.add("perde");

        ArrayList<String> envanterler = new ArrayList<String>();
        envanterler.add("masa");
        envanterler.add("perde");

        boolean isHaveAll = group1.containsAll(envanterler);

//        System.out.println("isHaveAll: " + isHaveAll);
//
//
//        for(String groupElement: group1){
//            System.out.println("group element is: " + groupElement);
//        }


//        System.out.println("strings size: " +  strings.size());
//
//        for (int i = 0; i < strings.size(); i++) {
//            System.out.println(String.format("next index: %d => %s", i, strings.get(i)));
//        }

//        for(String name: strings){
//            System.out.println(name);
//        }

        //Array
        String[] liste = new String[]{"hakan", "samet", "zehra"};
        String myElement =  liste[2];
        String[] users = new String[5];


        //Set
        Set<String> mySet = new HashSet<String>();
        mySet.add("samet");
        mySet.add("hakan");
        mySet.add("hakan");
        mySet.add("zehra");
        mySet.add("samet");

//        for(String name: mySet){
//            System.out.println("name is : " + name);
//        }


//        System.out.println("is samet exist : " + mySet.contains("samet"));

       // {"samet", "hakan", "zehra"}

        HashMap<String, Integer> myHash = new HashMap<String, Integer>();
        myHash.put("samet", 35);
        myHash.put("hakan", 30);
        myHash.put("zehra", 22);

     //   System.out.println(myHash.get("samet"));

        for (String key: myHash.keySet()){
            System.out.println("next key is: "+ key + " and value is: " + myHash.get(key));
        }

        for (Integer value: myHash.values()){
            System.out.println("next value is: "+ value);
        }

        for (Map.Entry<String, Integer> map: myHash.entrySet()){
            String key = map.getKey();
            Integer value = map.getValue();

            System.out.println("ENTRY | key is: "+ key + " and value is: " + value);
        }






       // {"samet": 34, "hakan": 20}


    }
}