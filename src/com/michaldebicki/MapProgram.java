package com.michaldebicki;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String,String> languages = new HashMap<>();
        //java.util.Map<String,String> languages = new HashMap<>();
        //bo map się powtarza więc robimy java.util

        if(languages.containsKey("Java")){
            System.out.println("Java already exist");
        } else {
            languages.put("Java", "a compiled high level, object-oriented,, platform independent language");
            System.out.println("Java added successfully");
        }


        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Istruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }

        System.out.println(languages.get("Java"));
        System.out.println(languages.put("Java", "this course is about Java"));
        System.out.println(languages.get("Java"));

        System.out.println("=======================================");
        //removing maps
        //musi się zgadzać key i value żeby usunęło

        //languages.remove("Lisp");
        if(languages.remove("Algol", "a family of algorithmic languages")){
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }
        //jak bedzie oldValue inne to się nie zmieni
        if(languages.replace("Lisp","This will not work", "a functional blah blah blah")){
            System.out.println("Lisp repleaced");
        } else {
            System.out.println("Lisp was not replaced");
        }
 //       System.out.println(languages.replace("Scala", "this will not be added"));

        for (String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }


    }
}
