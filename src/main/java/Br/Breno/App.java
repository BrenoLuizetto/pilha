package Br.Breno;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Stack pilha = new Stack(3);

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        while(!pilha.isEmpty()){
            System.out.println(pilha.pop());
        }
    }
}
