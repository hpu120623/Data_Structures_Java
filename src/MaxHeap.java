public class MaxHeap<E extends Comparable<E>> {

    private Array<E> data;

    public MaxHeap(int capacity) {
        data = new Array<>(capacity);
    }

    public MaxHeap() {
        data = new Array<>();
    }

    public MaxHeap(E[] arr){
        data = new Array<>(arr);
        for (int i = parent(data.getSize() - 1); i>=0; i--){
            siftDown(i);
        }
    }

    // 返回堆中的元素个数
    public int getSize() {
        return data.getSize();
    }

    // 判断堆中元素是否为空
    public boolean isEmpty() {
        return data.isEmpty();
    }

    // 通过给定节点的索引，计算父节点，左子节点，右子节点索引。
    private int parent(int index) {
        if (index == 0) {
            throw new IllegalArgumentException("index-0 doesn't have parent.");
        }
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }


    private int rightChild(int index) {
        return 2 * index + 2;
    }

    // 向堆中添加元素
    public void add(E e) {
        data.addLast(e);
        // 判断新添加的元素是否需要上浮，传入添加元素位置的索引
        siftUp(data.getSize() - 1); // 上浮操作开始，比大小
    }

    private void siftUp(int k) {
        // 当k索引位置元素比父节点索引位置元素大时，二者交换索引和元素
        while (k > 0 && data.get(parent(k)).compareTo(data.get(k)) < 0) {
            data.swap(k, parent(k));
            k = parent(k);
        }
    }

    // 看堆中的最大元素
    public E findMax() {
        if (data.getSize() == 0) {
            throw new IllegalArgumentException("Can not findMax when heap is empty.");
        }
        return data.get(0);
    }

    // 取出堆中的最大元素
    public E extractMax() {
        E ret = findMax();
        // 0索引位置的元素与最后位置元素互换，之后删除最后位置的元素
        data.swap(0, data.getSize() - 1);
        data.removeLast();
        siftDown(0); // 下沉操作开始，比大小

        return ret;
    }

    private void siftDown(int k) {
        while (leftChild(k) < data.getSize()) {
            // 重点：比较左右节点位置的元素大小，谁大，谁上。
            int j = leftChild(k);
            if (j + 1 < data.getSize() && data.get(j).compareTo(data.get(j + 1)) < 0) {
                j = rightChild(k);
            }
            // 循环停止条件
            if (data.get(k).compareTo(data.get(j)) >= 0) {
                break;
            }
            data.swap(k, j);
            k = j;
        }
    }

    // 取出堆中的最大元素，并且替换成元素e
    public E replace(E e){
        E ret = data.get(0);
        data.set(0, e);
        siftDown(0);
        return ret;
    }



    public static void main(String[] args) {

    }
}
