package resources;


import java.util.ArrayList;
import java.util.List;
class Band {
    private int debutYear;
    private List<String> members;
    public Band (int debutYear) {
        this.debutYear = debutYear;
    }
}
public class RockBand extends Band {
    public RockBand(int amount) {
        super(1);
    }
    public RockBand() {
        super(10);
    }

    public static void main(String[] args) {
   //     double [] array = new double[2];
     //   System.out.println(array[0] + array[1]);
        List<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(2));
        list.add(new Integer(1));
        list.add(new Integer(0));

        list.remove(Integer.valueOf(0));

        System.out.println(list);

    }
}
