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
	
	
	
	public static void main(String[] args) 
	{
		Exercicios.exercicio8();
	}

}
