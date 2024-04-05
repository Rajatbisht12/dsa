import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        LinkedList<Integer> list3 = new LinkedList<Integer>();


        list1.add(1);
        list1.add(2);
        list1.add(4);
        list2.add(1);
        list2.add(3);
        list2.add(4);
        
       
            while(!list1.isEmpty() && !list2.isEmpty()){
                if(list1.getFirst() <= list2.getFirst()){
                    list3.add(list1.removeFirst());
                }else if(list2.getFirst() <= list1.getFirst()){
                    list3.add(list2.removeFirst()); 
                }
                else{
                    System.out.println("index out of bound");
                }
            }
            list3.addAll(list1);
            list3.addAll(list2);
        

        for(Integer element : list3){
            System.out.println(list3.get(element));
        }
    }
}
