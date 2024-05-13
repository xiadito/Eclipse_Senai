package controller;

import util.Teclado;

public class Exercicios3 {

	public static void exercicio1()
	{
		double n1 = Teclado.lerInt("Digite um número:");
		
		if (n1 > 20)
		{
			n1 = n1/2;
			System.out.println(n1);
		}
		else
		{
			System.out.println(n1);
		}
	}	
	
	public static void exercicio2()
	{
		String capital = Teclado.lerTexto("Digite o nome da capital do brasil:");
		
		if (capital.toLowerCase().equals("brasília"))
		{
			System.out.println("Brasília é a capital do Brasil.");
		}
		else
		{
			String cap = capital.substring(0,1).toUpperCase() + capital.substring(1);
			System.out.println(cap + " não é a capital do Brasil, a capital é Brasília.");
		}
	}
	
	public static void exercicio3()
	{
		int n1 = Teclado.lerInt("Digite um numero inteiro:");
			
		if (n1 % 2 == 0)
		{
			System.out.println("Par");
		}
		else
		{
			System.out.println("Impar");
		}
		
	}
	
	public static void exercicio4()
	{
		int n1 = Teclado.lerInt("Digite um número inteiro:");
		
		if (n1 % 4 == 0)
		{
			System.out.println("O valor é divisivel por 4");
		}
		else if (n1 % 5 == 0)
		{
			System.out.println("O valor é divisivel por 5");
		}
		else
		{
			System.out.println("O valor não é divisivel por 4 nem por 5.");
		}
	}
	
	public static void exercicio5()
	{
		double[] notas = new double[4];
		double media = 0;
				
		for (int i = 0; i < 4; i++)
		{
			notas[i] = Teclado.lerDouble("Digite as notas do aluno:");
			media =  media + notas[i];
		}
		
		media = media / notas.length;
	
		if (media >= 5)
		{
			System.out.println("Sua média é " + media + " e você foi aprovado.");
		}
		else
		{
			System.out.println("Sua média é " + media + " e você foi reprovado.");
		}
	}
	
	public static void exercicio6()
	{
		int x = Teclado.lerInt("Digite 2 nuemros inteiros:"), y = Teclado.lerInt("");
		
		if (x > y)
		{
			int dif = x - y;
			System.out.println("A diferença entre os dois numeros é: " + dif);
		}
		else if (x == y)
		{
			int dif = 0;
			System.out.println("A diferença entre os dois numeros é: " + dif);
		}
		else
		{
			int dif = y - x;
			System.out.println("A diferença entre os dois numeros é: " + dif);
		}
	}
	
	public static void exercicio7()
	{
		int x = Teclado.lerInt("Digit um valor inteiro:");
		if (x < 0 )
		{
			x = x * -1;
		}
				
		System.out.println("O modulo do valor inserido é: " + x);
	}
	
	public static void exercicio8()
	{
		int x = Teclado.lerInt("Digite um valor inteiro:");
		if (x <= 10 && x >= 1)
		{
			System.out.println("O número esta numa faixa de 1 a 10.");
		}
		else
		{
			System.out.println("O número não está numa faixa de 1 a 10.");
		}
	}
	
	public static void exercicio9()
	{
		int x = Teclado.lerInt("Digite um valor inteiro");
		
		if (x > 0)
		{
			System.out.println("positivo");
		}
		else if (x < 0)
		{
			System.out.println("negativo");
		}
		else
		{
			System.out.println("nulo");
		}
	}
	
	public static void exercicio10()
	{
		int x = Teclado.lerInt("Digite 2 valores inteiros");
		int y = Teclado.lerInt("");
		
		if (x % y == 0) 
		{
            System.out.println(y + " é um divisor de " + x + ".");
        } 
		else 
		{
            System.out.println(y + " não é um divisor de " + x + ".");
        }
	}
	
	public static void exercicio11()
	{
		String name = Teclado.lerTexto("Digite um número de 3 casas:");
		name = name.substring(2, 3);
		System.out.println(name);
	}
	
	public static void exercicio12()
	{
		int[] numbers = new int[5];
		for (int i = 0; i < 5; i++)
		{
			numbers[i] = Teclado.lerInt("digite um numero inteiro:");
		}
		
	}
	
	public static void exercicio13()
	{
		int[] numbers = new int[3];
		int n = numbers.length;
		
		for (int i = 0; i < 3; i++)
		{
			numbers[i] = Teclado.lerInt("Digite um número inteiro:");
		}
		
		// One by one move boundary of unsorted subarray
	    for (int i = 0; i < n-1; i++)
	    {
	    	// Find the minimum element in unsorted array
	        int min_idx = i;
	        for (int j = i+1; j < n; j++)
	        	if (numbers[j] < numbers[min_idx])
	        		min_idx = j;

	        // Swap the found minimum element with the first
	        // element
	        int temp = numbers[min_idx];
	        numbers[min_idx] = numbers[i];
	        numbers[i] = temp;
	    }
	    
	    for (int i = 0; i < numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
	}
	
	public static void main(String[] args) 
	{
		Exercicios3.exercicio13();
	}

}
