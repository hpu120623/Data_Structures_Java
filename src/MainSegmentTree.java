public class MainSegmentTree {
    public static void main(String[] args) {
        Integer[] nums = {-2, 0, 3, 5, 6, -4, -1, 2, -8};
//        SegmentTree<Integer> segmentTree = new SegmentTree<>(nums, new Merger<Integer>() {
//            @Override
//            public Integer merge(Integer a, Integer b) {
//                return a + b;
//            }
//        });
        // 计算区间内元素和
        SegmentTree<Integer> segmentTree = new SegmentTree<>(nums, Integer::sum);
//        System.out.println(segmentTree);
        System.out.println(segmentTree.query(1,4));
        System.out.println(segmentTree.query(0,2));
        System.out.println(segmentTree.query(1,2));

    }
}
