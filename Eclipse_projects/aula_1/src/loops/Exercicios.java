package loops;

import util.Teclado;

public class Exercicios 
{
	public static void exercicio1()
	{
		for (int i = 0; i <= 100; i++)
		{
			System.out.println(i);
		}
	}
	
	public static void exercicio2()
	{
		for (int i = 100; i >= 1; i--)
		{
			System.out.println(i);
		}
	}
	
	public static void exercicio3()
	{
		for (int i = 15; i <= 200; i = i * i)
		{
			System.out.println(i);
		}
	}
	
	public static void exercicio4()
	{
		int soma = 0;
		for (int i = 0; i <= 100; i++)
		{
			soma += i;
			System.out.println(soma);
		}
	}
	
	public static void exercicios5()
	{
		int mult = Teclado.lerInt("Digite um número para ser multiplicado:");
		for (int resultado, i = 1; i < 11; i++)
		{
			resultado = mult * i;
			System.out.println(mult  + " * " + i + " = " + resultado);
		}
	}
	
	public static void exercicio6()
	{
		int n = Teclado.lerInt("Digie um valor inteiro:");
		for (int i = 3; n <= 250;)
		{
			n *= i;
			System.out.println(n);
		}
	}
	
	public static void exercicio7()
	{
		for (int i = 1; i < 201; i++)
		{
			if (i % 4 == 0)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void exercicio8()
	{
		for (int i = 0; i < 21; i++)
		{
			if (! (i % 2 == 0))
			{
				System.out.println(i);
			}
		}
	}
	
	public static void exercicio9()
	{
		for (int soma = 0, i = 0; i < 501; i++)
		{
			if (i % 2 == 0)
			{
				soma += i;
				System.out.println(soma);
			}
		}		
	}
	
	public static void exercicio10()
	{
		for (int i = 0; i < 16; i++)
		{
			int resultado = (int) Math.pow(3, i);
			System.out.println("3 elevado a " + i + " = " + resultado);
		}
	}
	
	public static void exercicio11()
	{
		int b = Teclado.lerInt("Digite o valor da base da potencia:");
		int e = Teclado.lerInt("Digite o valor do expoente da potência:");
		int result = b;

		for (int i = 1; i < e; i++)
		{
			result *= b;
		}
		System.out.println(result);
	}
	
	public static void exercicio12()
	{	
		float result = 0;
		boolean x = true;

		while (x)
		{
			float aws = Teclado.lerFloat("Digite qualquer número real:");
			
			if (aws < 0)
			{
				System.out.println(result);
				x = false;
			}
			else
			{
				result += aws;
			}
		}
	}

	public static void exercicio13()
	{
		for (int i = 0; i <= 10; i++)
		{
			System.out.println(3*i);
		}
		for (int i = 0; i <= 10; i++)
		{
			System.out.println(6*i);
		}
	}

	public static void exercicio14()
	{
		int fatorial = Teclado.lerInt("Digite o nome que deseja ver o fatorial:");
		int soma_fat = 1;

		for (int i = 1; i <= fatorial; i++)
		{
			soma_fat *= i;
		}
		System.out.println(soma_fat);
	}

	public static void exercicio15()
	{

	}

	public static void main(String[] args) 
	{
	
	}

}
