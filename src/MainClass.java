import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args){

    Program list = new Program();
    Cat cat1 = new Cat("Barsik", 9);
    Cat cat2 = new Cat("Tuzik", 10);
    Cat cat3 = new Cat("Pushok", 15);
    Cat cat4 = new Cat("Stas", 15);

    list.addCat(cat1);
    list.addCat(cat2);
    list.addCat(cat3);
    list.addCat(cat4);
   System.out.println(list.printCat());

    Plate plate = new Plate(22);
        plate.info();

   if(plate.getFood() <= list.getApp()){
        System.out.println("Back");
    }else {
        System.out.println("Good");

        }

    }
}
