package basis.holding;

/**
 * @author luojun
 * @create 2021-08-18 21:40
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String[] s = "My dog has fleas".split(" ");

        for (String e:s) {
            stack.push(e);
        }
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
