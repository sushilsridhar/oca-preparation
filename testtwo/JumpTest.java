public class JumpTest {
    public static void main(String[] args) {
        int result = 8;
        for: while (result > 7) {
            result++;
            do {
                result--;
            } while (result > 5);
            break for;
        }
        System.out.println(result);
    }
}