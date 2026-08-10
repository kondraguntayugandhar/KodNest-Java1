public class oute {
    public static void main(String[] args) {
        outer: for (int i = 0; i <= 5; i++) {
            inner: for (int j = 0; j <= 5; j++) {
                if (j == 2) {
                    break outer;
                }
                System.out.println("i: " + i + "j " + j);
            }
        }
    }

}
