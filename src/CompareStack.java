import java.util.Random;

public class CompareStack {

    // 测试使用stack运行opCount个push和pop操作所需的时间，单位：秒
    private static double testStack(Stack<Integer> stack, int opCount){

        long startTime = System.nanoTime();

        Random random = new Random();
        for (int i = 0; i< opCount; i++){
            stack.push(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i<opCount; i++){
            stack.pop();
        }


        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }
    public static void main(String[] args) {

        int opCount = 10000000;

        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        double time1 = testStack(arrayStack, opCount);
        System.out.println("arrayStack, time: " + time1 + "s");

        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        double time2 = testStack(linkedListStack, opCount);
        System.out.println("linkedListStack, time: " + time2 + "s");

        // 其实这个时间比较很复杂，因为LinkedListStack中包含更多的new操作(node)，需要不停的在内存中寻找地方开辟空间，当数量越多，耗时越长。
        // 实际上不管是arrayStack还是linkedListStack在我们的测试中，他们的时间复杂度都是一样的

    }
}