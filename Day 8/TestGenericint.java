import java.util.*;
public class TestGenericint {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int s=list.get(12);

        System.out.println("element is: "+s);
        Iterator<Integer> itr=list.iterator();
        int i=0;
        while(itr.hasNext())
        {
            System.out.println(itr.next()+ " "+i++);
        }


}
}
