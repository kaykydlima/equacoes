
package equacoes;

public class Equacoes {

        int a = 10;
        int b = 7;
        int c = a - b;
        int d = c + a;
        int e = d + c;

    public static void main(String[] args) {
        Equacoes variaveis = new Equacoes();
        
        System.out.println("a = 10 e b = 7");
    
        System.out.println("O valor de c = a - b é: " + variaveis.c);

        System.out.println("O valor de d = c + a é: " + variaveis.d);
        
        System.out.println("O valor de e = d + c é: " + variaveis.e);
    }
    
}
