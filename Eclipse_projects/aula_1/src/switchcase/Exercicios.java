package switchcase;

import util.Teclado;

public class Exercicios {

    public static void exercicio1()
    {
        boolean flag = true;

        System.out.println("1 - Incluir\n2 - Alterar\n3 - Excluir\n4 - Pesquisar\n5 - Sair");

        while (flag)
        {
            int escolha = Teclado.lerInt("Insira a decisão que deseja de acordo com a tabela:");
                switch (escolha)
            {
                case 1:
                    System.out.println("Incluindo\n");
                    break;
                case 2:
                    System.out.println("Alterando\n");
                    break;
                case 3:
                    System.out.println("Excluindo\n");
                    break;
                case 4:
                    System.out.println("Pesquisando\n");
                    break;
                case 5:
                    System.out.println("Saindo\n");
                    flag = false;
                    break;
                default:
                    System.out.println("Insira um valor valido!\n");
                    break;
            }
        }
    }

    public static void exercicio2()
    {
        String sexo = Teclado.lerTexto("Digite seu sexo: M/F");

        switch (sexo)
        {
            case "M":
                System.out.println("Banheiro masculino a direita.");
                break;
            case "F":
                System.out.println("Banheiro feminino a esquerda");
                break;
            default:
                System.out.println("Valor não reconhecido, digite novamente.");
                break;
        }
    }

    public static void exercicio3()
    {
        int n1 = Teclado.lerInt("Digite um valor inteiro:");
        int result = n1 % 2;

        switch (result)
        {
            case 0:
                System.out.println("Par.");
                break;
            default:
                System.out.println("Impar.");
                break;
        }
    }

    public static void exercicio4()
    {
        String sigla = Teclado.lerTexto("Digite a sigla do seu estado.");

        switch (sigla) 
        {
            case "RJ":
                System.out.println("Carioca");             
                break;
            case "SP":
                System.out.println("Paulista");
                break;
            case "MG":
                System.out.println("Mineiro");
                break;
            default:
                System.out.println("Outros estados.");
                break;
        }
    }

    public static void exercicio5()
    {
        int numero = Teclado.lerInt("Digite um número de 1 a 12.");

        String mes;

        switch (numero) {
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
            case 7:
                mes = "Julho";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setembro";
                break;
            case 10:
                mes = "Outubro";
                break;
            case 11:
                mes = "Novembro";
                break;
            case 12:
                mes = "Dezembro";
                break;
            default:
                mes = "Número inválido. Por favor, digite um número de 1 a 12.";
                break;
        }
        System.out.println(mes);
    }

    public static void exercicio6() {
        
        double peso = Teclado.lerDouble("Digite seu peso:");
        int planeta = Teclado.lerInt("Digite o planeta um número de 1 a 6.");
        double peso_planeta = 0; 

        switch (planeta) {
            case 1:
                peso_planeta = (peso/10) * 0.37;
                break;
            case 2:
                peso_planeta = (peso/10) * 0.88;
                break;
            case 3:
                peso_planeta = (peso/10) * 0.38;
                break;
            case 4:
                peso_planeta = (peso/10) * 2.64;
                break;
            case 5:
                peso_planeta = (peso/10) * 1.15;
                break;
            case 6:
                peso_planeta = (peso/10) * 1.17;
                break;
            default:
                System.out.println("Digite um número valido.");
                break;
            }
            System.out.println(peso);
            System.out.println(peso_planeta);
    }

    public static void exercicio7() {
        double n1 = Teclado.lerDouble("Digite um valor inteiro:");
        double n2 = Teclado.lerDouble("Digite um valor inteiro:");
        int choice = Teclado.lerInt("Digite o que quer fazer com os dois números.");

        switch (choice) { 
            case 1:
                double media = (n1 + n2)/2;
                System.out.println("media " + media);
                break;
            case 2:
                if (n1 > n2) {
                    double diferenca = n1 - n2;
                    System.out.println("Dif" + diferenca);
                }
                else {
                    double diferenca = n2 - n1;
                    System.out.println("Dif" + diferenca);
                } 
                break;
            case 3:
                double prod = n1 * n2;
                System.out.println("produto " + prod);
                break; 
            case 4:
                double div = n1/n2;
                System.out.println("divisao " + div);
                break;
            default:
                System.out.println("valor incorreto.");
                break;
        }
    }
    
    public static void main(String[] args) {
        
	}
}


