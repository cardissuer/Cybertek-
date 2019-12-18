package utilities;

import java.util.ArrayList;

public class SchoolSystem {
    public static void main(String[] args) {
        //MyCollection.getStringsList();
        ArrayList <String> list = new ArrayList<>();
        list.add ("three");
        list.add("jesus");
        list.add("ready");
        list.add("TRON");
        list.add("jesus");
        //ArrayList <String> k = MyCollection.filterList(list, 5);
        //System.out.println(k);
        ArrayList <String> k = MyCollection.unique(list);
        System.out.println(k);
    }
}
