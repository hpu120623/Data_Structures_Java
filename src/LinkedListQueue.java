public class LinkedListQueue<E> implements Queue<E> {

    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this.e = e;
            this.next = null;
        }

        public Node() {
            this.e = null;
            this.next = null;
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node head, tail;
    private int size;

    public LinkedListQueue(){
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int getSize(){
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(E e){
        // 当tail为空时，也就意味着head也为空
        if(tail == null){
            tail = new Node(e);
            head = tail;
        }
        else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public E dequeue(){
        if (isEmpty()){
            throw new IllegalArgumentException("Cannot dequeue from an empty queue.");
        }

        Node retNode = head;
        head = head.next;
        retNode.next = null;

        // 特殊情况：链表中只有一个元素，若删除，则为空
        if (head == null){
            tail = null;
        }
        size--;
        return retNode.e;
    }

    @Override
    public E getFront(){
        if (isEmpty()){
            throw new IllegalArgumentException("Cannot dequeue from an empty queue.");
        }
        return head.e;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Queue: front ");

        Node cur = head;
        while (cur!=null){
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("Null tail");
        return res.toString();
    }

    public static void main(String[] args) {

        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);

            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
