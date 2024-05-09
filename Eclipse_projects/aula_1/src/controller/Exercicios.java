package controller;

import util.Teclado;

public class Exercicios {
	
	private static double fahrenheit;

	public static void aaskdba() {
		
	}
	
	public static void soma() 
	{
		// TODO Auto-generated method stub
		int x = Teclado.lerInt("Digite um número inteiro:");
		int y = Teclado.lerInt("Digite um número inteiro:");
		int soma = x + y;
		int sub = x - y;
		int mult = x * y;
		double div = (1.0 * x) / (1.0 * y);
			
		System.out.println("A soma dos números: " + soma + ".");
		System.out.println("A subtração dos números: " + sub + ".");
		System.out.println("A multiplicação dos números: " + mult + ".");
		System.out.println("A divisão dos números: " + div + ".");
	}
	
	
	public static void exercicio1() 
	{
		
		String name = Teclado.lerTexto("Digite seu nome completo:");
		String sex = Teclado.lerTexto("Digite seu sexo: M/F");
		
		System.out.println(name);
		System.out.println(sex);
	}
	
	public static void exercicio2() 
	{
		// TODO Auto-generated method stub
		
		//criando uma array com tamanho de 4 valores
		int[] number = new int[4];
		int sum = 0;
		int multiplication = 1;
		
		//colocando os valores na array
		for (int i = 0; i < 4; i++)
		{
			number[i] =  Teclado.lerInt("Digite um número inteiro: ");
		}
		
		//soma
		for (int i = 0; i < 4; i++) 
		{
			sum = sum + number[i];
			multiplication = multiplication * number[i];
		}
		
		System.out.println("Soma dos 4 inteiros: " + sum);
		System.out.println("Multiplicação dos 4 inteiros: " +  multiplication);
	}
	
	public static void exercicio3() 
	{
		double dol = 0;
		double real = 0;
		
		dol =  Teclado.lerDouble("Digite o valor em dolares para conversão: ");
		real = dol * 3.80;
		
		System.out.println("O valor de " + dol + " dolares em reais é " + real + ".");
	}
	
	public static void exercicio4()
	{
		
		int number = 0;
		
		number = Teclado.lerInt("Digite um valor inteiro:");
		
		int antecessor = number - 1;
		int sucessor = number + 1;
		
		System.out.println("Antecessor: " + antecessor +  ". Sucessor: " + sucessor + ".");
	}
	
	public static void exercicio5()
	{
		double salary = 0;
		
		salary = Teclado.lerFloat("Digite seu salario: X."
				+ "XXX.XXX");
		
		salary = salary + (salary * 0.15);
		
		System.out.println("salario com aumento: " + salary + ".");
						
	}

	public static void exercicio6()
	{
		double celsius = 0;
		double fahrenheit = 0;
		
		fahrenheit = Teclado.lerDouble("Digite uma temperatura em fahrenheit:");
		
		celsius = (f-32) * 5/9
		
	
	}
	
	public static void main(String[] args) 
	{
		
	}

}

