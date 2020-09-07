public class TestArray {

    public static void main(String[] args) {
        // write your code here
        Array<Integer> arr = new Array<>();
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.add(1,100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);
//
//        arr.set(5, 50);
//        System.out.println(arr);

        arr.remove(3);
        System.out.println(arr);

        arr.removeElement(2);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);

        arr.removeLast();
        System.out.println(arr);
//        System.out.println(arr.get(2));
//        System.out.println(arr.find(100));
//        System.out.println(arr.getSize());
//        System.out.println(arr.removeFirst());
//        System.out.println(arr.contains(200));
//        System.out.println(arr.getCapacity());

    }
}
