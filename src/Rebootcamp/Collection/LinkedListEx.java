package Rebootcamp.Collection;

import java.util.LinkedList;
import java.util.List;

import static com.sun.tools.attach.VirtualMachine.list;

public class LinkedListEx {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.addFirst("c");
        list.addLast(null);

        System.out.println(list);
        System.out.println(list.get(0));
    }
}
