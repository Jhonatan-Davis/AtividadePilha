package pilha;

public class PilhaChar {
    private char[] elementos;
    private int topo;

    public PilhaChar(int capacidade) {
        elementos = new char[capacidade];
        topo = -1;
    }

    public void push(char c) {
        if (topo < elementos.length - 1) {
            elementos[++topo] = c;
        }
    }

    public char pop() {
        if (!isEmpty()) {
            return elementos[topo--];
        }
        return '\0';
    }

    public boolean isEmpty() {
        return topo == -1;
    }
}
