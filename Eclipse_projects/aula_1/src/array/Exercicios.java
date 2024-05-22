package array;

import util.Teclado;

public class Exercicios {

    void exercicio1() {
        
        String[] nome = new String[5];
        String[] profissao = new String[5];

        for (int i = 0; i < nome.length; i++) {
            
            nome[i] = Teclado.lerTexto("Digite seu nome e a seguir sua profissão:");
            profissao[i] = Teclado.lerTexto("Digite sua profissão agora.");
        }

        for (int i = 0; i < profissao.length; i++) {
            
            System.out.println(nome[i]);
            System.out.println(profissao[i]);
        }
    } 

    void exercicio2() {

        int[] soma = new int[5];
        int soma_array = 0;

        for (int i = 0; i < soma.length; ++i) {

            soma[i] = Teclado.lerInt("Digite um valor inteiro:");
            soma_array += soma[i];
        }
        System.out.println("Soma dos valores inseridos " + soma_array);
    }

    void exercicio3() {
        
        int[] soma = new int[5];
        int soma_array = 0;

        for (int i = 0; i < soma.length; ++i) {

            soma[i] = Teclado.lerInt("Digite um valor inteiro:");
            
            if (soma[i] % 2 != 0) {
                soma_array += soma[i];
            }
        }
        System.out.println("Soma dos valores impares inseridos " + soma_array);
    }

    void exercicio4() {

        int[] a = new int[8];
        int[] b = new int[8];

        for (int i = 0; i < a.length; ++i) {
            
            a[i] = Teclado.lerInt("Digite um valor inteiro:");
            b[i] = a[i] * 3;
        }

        for (int i = 0; i < b.length; ++i) {

            System.out.println(b[i]);
        }
    }

    void exercicio5() {

        int[] a = new int[5];
        int[] b = new int[5];

        for (int i = 0; i < a.length; ++i) {
            
            a[i] = Teclado.lerInt("Digite um valor inteiro:");
            b[i] = (int) Math.pow(a[i], 2);
        }

        for (int i = 0; i < b.length; ++i) {

            System.out.println(b[i]);
        }
    }

    void exercicio6() {

        
    }

    public static void main(String[] args) {
        
	}
}

