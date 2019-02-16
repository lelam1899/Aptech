package Test;

import Animal.Dog;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4};
        //for (int i = 0; i< x.length; i++){
        //      System.out.println(x[i]);
        //  }
        for (int value : x) {
            System.out.println(value);
        }
//        int[][] y = new int[2][3];
//        int[][] y = {{1, 2, 3}, {4, 5, 6}};
//        for (int i = 0; i < y.length; i++) {
//            for (int value : y[i]) {
//
//            }
//        }
//
        ArrayList arr = new ArrayList();
        arr.add(3);
        arr.add(3.14);
        arr.add(1, "hello");
        for (int i=0; i<arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        ArrayList<String> stringsArr = new ArrayList<String>();
        stringsArr.add("hello");
        stringsArr.add("world");

        ArrayList<Dog> dogArrayList = new ArrayList<Dog>();
        Dog dog1 = new Dog(1,"Cho Nhat","den", 3,2);
        Dog dog2 = new Dog(2, " Cho Nhat ", "Vang", 3,2);
        Dog dog3 = new Dog(3, "Cho Nhat"," Xanh", 4,3);
        dogArrayList.add(dog1);
        dogArrayList.add(dog2);
        dogArrayList.add(dog3);
        for (Dog dog:dogArrayList){
            System.out.println("Cho co mau:" +dog.color);
            for (String thuc_an: dog.danh_sach_thuc_an){
                System.out.println(thuc_an);
            }
        }
    }
}
