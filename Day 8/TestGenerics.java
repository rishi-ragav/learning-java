import java.util.*;
class TestGenerics
{
    public static void main(String args[]){
    ArrayList<String>list=new ArrayList<String>();
    list.add("rahul");
    list.add("jai");
    list.add("ravi");
    list.add("jai");
    list.add("rahul");
    list.add("ajay");
    list.add("beena");
    list.add("rahul");
    list.add("jai");
    list.add("ravi");
    list.add("jai");
    list.add("rahul");
    
    String s=list.get(1);
    System.out.println("element is: "+s);
    Iterator<String> itr=list.iterator();
    int i=0;
    while(itr.hasNext())
    {
        System.out.println(itr.next()+ " "+i++);
    }
}
}