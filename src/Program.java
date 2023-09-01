import java.util.ArrayList;
import java.util.List;

public class Program {
    int sum = 0;
    private List<Cat> list;

    public Program(){
        this.list = new ArrayList<>();
    }

    public void addCat(Cat cat) {
        list.add(cat);
    }
    Cat cat = new Cat();
    public String printCat(){
       StringBuilder stringBuilder = new StringBuilder();
       stringBuilder.append("List cat \n");
       for(Cat cat: list){
           stringBuilder.append(cat);
           stringBuilder.append("\n");
       }
        return stringBuilder.toString();
    }
    Plate plate = new Plate(22);
    int n = 0;
    public int getApp(){
        for(Cat cat: list){
          if(plate.getFood() <= 0){
              System.out.println("Тарелка пустая");
              return -1;
          } else
          if(plate.getFood() >= sum){
               n += 1;
               sum += cat.getAppetite();
              }else{
               break;
           }
        }
        System.out.printf("[Вы накормили ]  %d [кота] \n", n-1);
        return sum;
    }

}
