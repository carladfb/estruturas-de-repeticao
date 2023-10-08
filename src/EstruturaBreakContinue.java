public class EstruturaBreakContinue {
    public static void main(String[] args) {

        // imprime só até o dois
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        // imprime todos menos o 3, ele lê o 3 e pula
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
