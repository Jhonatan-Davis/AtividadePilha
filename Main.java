package pilha;

public class Main {
    public static void main(String[] args) {
        String exemplo1 = "UM CIENTISTA DA COMPUTAÇAO E UM TECNÓLOGO EM SISTEMAS PARA INTERNET DEVEM RESOLVER OS PROBLEMAS LOGICAMENTE";
        String exemplo2 = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC E O OGOLÓNCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OÃS SO SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED .SAIOG";

        System.out.println("--- Exemplo 1 ---");
        System.out.println("Entrada: " + exemplo1);
        System.out.println("Saída:   " + InvertorPalavras.inverterLetras(exemplo1));
        System.out.println();

        System.out.println("--- Exemplo 2 ---");
        System.out.println("Entrada: " + exemplo2);
        System.out.println("Saída:   " + InvertorPalavras.inverterLetras(exemplo2));
    }
}
