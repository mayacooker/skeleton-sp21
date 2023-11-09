public class HelloNumbers {
    public static void main(String[] args) {
        for (int i = 0, j = 0; i < 10; i += 1, j = i + j) {
            System.out.println(j);
        }
    }
}