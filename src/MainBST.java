import java.util.Random;
import java.util.ArrayList;

public class MainBST {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        Random random =new Random();
//        int[] nums = {5,3,4,6,2,8};
//        for(int num:nums){
//            bst.add(num);
//        }
//        bst.preOrder();
//
//        System.out.println(bst);
//
//        bst.inOrder();
//        System.out.println("----------");
//        bst.postOrder();

        int n = 1000;
        for (int i=0;i<n;i++){
            bst.add(random.nextInt(10000));
        }
        ArrayList<Integer> nums = new ArrayList<>();
        while (!bst.isEmpty()){
            nums.add(bst.removeMin());
        }
        System.out.println(nums);
        for(int i=1;i<nums.size();i++){
            if(nums.get(i-1)>nums.get(i)){
                throw new IllegalArgumentException("Error");
            }
        }

        System.out.println("removeMin test completed.");
    }
}
