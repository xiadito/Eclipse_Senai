package array;

import java.util.Scanner;

import util.Teclado;

public class Exercicios {

    static void exercicio1() {
        
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

    static void exercicio2() {

        int[] soma = new int[5];
        int soma_array = 0;

        for (int i = 0; i < soma.length; ++i) {

            soma[i] = Teclado.lerInt("Digite um valor inteiro:");
            soma_array += soma[i];
        }
        System.out.println("Soma dos valores inseridos " + soma_array);
    }

    static void exercicio3() {
        
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

    static void exercicio4() {

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

    static void exercicio5() {

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

    static void exercicio6() {

        int[] a = new int[20];
        int[] b = new int[20];

        for (int i = 0; i < a.length; ++i) {

            a[i] = Teclado.lerInt("Digite um valor inteiro:");
        }
        for (int j = 0, i = 19; i > b.length * 0; --i, j++) {

            b[i] = a[j]; 
        }
    }

    static void exercicio7() {

        String[] semana = {"domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sábado"};
        int escolha = Teclado.lerInt("Digite o dia da semana: 1 a 7");
        escolha -= 1;

        System.out.println("O dia da semana escolhido é: " + semana[escolha]);
    }

    static void exercicio8() {

        String[] alunos = new String[5];
        int[] notas1 = new int[5];
        int[] notas2 = new int[5];
        int[] notas3 = new int[5];
        String[] situacao = new String[5];

        for (int i = 0; i < alunos.length; ++i) {

            alunos[i] = Teclado.lerTexto("Digite o nome do aluno:");
            notas1[i] = Teclado.lerInt("Digite a primeira nota do aluno:");
            notas2[i] = Teclado.lerInt("Digite a segunda nota do aluno:");
            notas3[i] = Teclado.lerInt("Digite a terceira nota do aluno:");

            if (notas1[i] + notas2[i] + notas3[i] / 3 >=6) {
                situacao[i] = "AP";
            }
            else {
                situacao[i] = "RP";
            }
        }   
    }

    static void exercicio9() {

        String[] nome = new String[10];
        String pesquisa;

        for (int i = 0; i < nome.length; i++) {

            nome[i] = Teclado.lerTexto("Digite um nome:");
        }

        pesquisa = Teclado.lerTexto("Deseja realizar uma pesquisa: S/N");
        if (pesquisa.equals("S")) {
            pesquisa = Teclado.lerTexto("Digite um valor para ser pesquisado na lista:");
            for (int i = 0; i < nome.length; ++i) {
                
                if (pesquisa.equals(nome[i])) {
                System.out.println("O nome " + pesquisa + " esta presente na lista.");
                }
            }
        }
    }

    static void exercicio10() {

        String[] nomes = new String[5];
        String[] telefones = new String[5];
        String[] enderecos = new String[5];

        // Coletar os dados de 5 pessoas
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            nomes[i] = Teclado.lerTexto("");
            
            System.out.println("Digite o telefone da pessoa " + (i + 1) + ":");
            telefones[i] = Teclado.lerTexto("");
            
            System.out.println("Digite o endereço da pessoa " + (i + 1) + ":");
            enderecos[i] = Teclado.lerTexto("");
        }
        
        // Perguntar o número da pessoa que o usuário quer consultar
        System.out.println("Digite um número de 1 a 5 para ver os dados da pessoa cadastrada:");
        int numero = Teclado.lerInt("");
        
        // Exibir os dados da pessoa correspondente ao número informado
        if (numero >= 1 && numero <= 5) {
            int indice = numero - 1; // Ajustar o índice para começar em 0
            System.out.println("Nome: " + nomes[indice]);
            System.out.println("Telefone: " + telefones[indice]);
            System.out.println("Endereço: " + enderecos[indice]);
        } else {
            System.out.println("Número inválido. Por favor, digite um número de 1 a 5.");
        }    
    }

    static void exercicio11() {

        int[] array = new int[5];
        int teste = 0;
        int media = 0;
        
        for (int i = 0; i < array.length; i++) {
            teste = Teclado.lerInt("Digite um valor inteiro:");
            int menor = 0;
            int maior = 0;

            if (maior < teste) {
                maior = teste;
            }
            else if (teste < menor) {
                menor = teste;
            }
            array[i] = teste;
        }
        for (int i = 0; i < array.length; i++) {
            media += array[i];
            media /= array.length;
            System.out.println(media);
        }
            
    }
    

    public static void main(String[] args) {
        
	}
}
