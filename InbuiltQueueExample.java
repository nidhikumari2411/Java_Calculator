import java.util.LinkedList;
import java.util.Queue;

public class InbuiltQueueExample {
    public static void main(String[]args){
        //CREATE A QUEUE USING LINKEDLIST
    Queue<Integer>queue =new LinkedList<>();

    //ENQUEUE(ADD ELEMENTS TO THE QUEUE)
    queue.offer(1);
    queue.offer(2);
    queue.offer(3);

    //PEEK(VIEW THE FRONT ELEMENT WITHOUT REMOVING)
    int front= queue.peek();
    System.out.println("Front element."+front);


    //DEQUEUE(REMOVE THE ELEMENT)
    int removeElement =queue.poll();
    System.out.println("Dequeue element." +removeElement);

    //CHECK IF THE QUEUE IS EMPTY
    boolean isEmpty= queue.isEmpty();
    System.out.println("is the queue empty:" +isEmpty);

    //SIZE OFTHE QUEUE
    int size=queue.size();
    System.out.println("Queue size:" +size);

}
}