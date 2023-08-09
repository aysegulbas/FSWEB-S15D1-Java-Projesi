package com.workintech.model;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MarketCar {
    private static String getInput(){
        Scanner scanner=new Scanner(System.in);
        return scanner.nextLine();
    }
    public static void addItems(List<String> groceryList){
        System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
        String input=getInput();
        if(input.contains(",")){
            String[]elements=input.split(",");
            for(String element:elements){
                if(element!=null&&!element.trim().isEmpty()){
                    if(!checkItems(groceryList,element))
                    groceryList.add(element);
                }
            }
        }else{if(input!=null&&!input.isEmpty()){
        groceryList.add(input);}
        }
        printSorted(groceryList);
    }

    public static void removeItems(List<String> groceryList){
        System.out.println("Cıkarılmasını istediğiniz elemanları giriniz:");
        String input=getInput();
        if(input.contains(",")){
            String[]elements=input.split(",");
            for(String element:elements){
                if(element!=null&&!element.trim().isEmpty()){
                    if(checkItems(groceryList,element))
                        groceryList.remove(element);
                }
            }
        }else{if(input!=null&&!input.isEmpty()){
            groceryList.remove(input);}
        }
        printSorted(groceryList);
    }

    public static boolean checkItems(List<String>products,String product){
        return products.contains(product);

    }
    public static void printSorted(List<String >products){
        Collections.sort(products);
        for(String product:products){
        System.out.println();}


    }
}
