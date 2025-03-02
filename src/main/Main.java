package main;

import com.workintech.model.MarketCar;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String>groceryList=new LinkedList<>();
        startGrocery(groceryList);
    }

public static void startGrocery(List<String> groceryList){
    Scanner scanner=new Scanner(System.in);
    while (true){
        try {
            System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
            int process = scanner.nextInt();
            if (process < 0 || process > 2) {
                System.out.println("0-2 arasında değer giriniz");
            }
            if (process == 0) {
                System.exit(0);
            }
            if (process == 1) {
                MarketCar.addItems(groceryList);
            }
            if (process == 2) {
                MarketCar.removeItems(groceryList);
            }
        }catch(Exception ex){
                System.out.println("Invalid process: "+ex.getMessage());
                break;
            }
    }
}
}