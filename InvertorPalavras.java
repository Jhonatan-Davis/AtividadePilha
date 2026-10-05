package pilha;

public class InvertorPalavras {

    public static String inverterLetras(String frase) {
        StringBuilder resultado = new StringBuilder();
        PilhaChar pilha = new PilhaChar(frase.length());

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c == ' ') {
                while (!pilha.isEmpty()) {
                    resultado.append(pilha.pop());
                }
                resultado.append(' ');
            } else {
                pilha.push(c);
            }
        }

        while (!pilha.isEmpty()) {
            resultado.append(pilha.pop());
        }

        return resultado.toString();
    }
}