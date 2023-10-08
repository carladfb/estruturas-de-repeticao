public class EstruturaForArray {
    public static void main(String[] args) {
        String cachorros[] = { "Pastor Alemão", "Doberman", "Pincher", "Pitbull" };

        // for
        for (int i = 0; i < cachorros.length; i++) {
            System.out.println("O cachorro na posição " + i + "º é: " + cachorros[i]);
        }

        // foreach
        for (String cachorro : cachorros) {
            System.out.println("A raça do cachorro é: " + cachorro);
        }
    }
}
