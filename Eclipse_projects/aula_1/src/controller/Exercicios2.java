package controller;

import util.Teclado;

public class Exercicios2 {

	public static void exercicio1()
	{
		double payment;
		
		
		payment = Teclado.lerDouble("Digite o valor a pagar:");
		payment = payment + (payment * 0.10);
		
		System.out.println("O valor total a pagar é: " + payment + ".");
	}
	
	public static void exercicio2()
	{
		int hours;
		int min; 
		int min_total;
		
		hours = Teclado.lerInt("Digite as horas:");
		min = Teclado.lerInt("Digite os minutos:");
		min_total = min + (hours * 60);
		
		System.out.println("Em " + hours + " e " + min + " temos em minutos: " + min_total + ".");
	}	
	
	public static void exercicio3()
	{
		double height;
		double weight;
		
		height = Teclado.lerDouble("Digite seu peso:");
		weight = Teclado.lerDouble("Digite sua alutra");
		
		height = height * 100.00;
		weight = weight * 1000.00;
		
		System.out.println("Seu peso em gramas:" + weight + ".");
		System.out.println("Sua altura em centímetros: " + height + ".");
	}
	
	public static void exercicio4()
	{
		double height;
		double weight;
		double imc;
		
		height = Teclado.lerDouble("Digite seu peso: KG");
		weight = Teclado.lerDouble("Digite sua alutra: M");
		imc = weight / Math.pow(height, 2);
		
		System.out.println("Seu IMC é: " + imc + ".");
	}
	
	public static void exercicio5()
	{
		
		double n1;
		double n2;
		double sum;
		double sub;
		double mult;
		double div;
		double rest_div;
		
		n1 = Teclado.lerInt("Digite um numero:");
		n2 = Teclado.lerInt("Digite um numero:");
		
		sum = n1 + n2;
		sub = n2 - n1;
		mult = n1 * n2;
		div = n1 / n2;
		rest_div = n1 % n2;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		System.out.println(rest_div);
		
	}

	public static void exercicio6()
	{
		String name;
		double salary;
		double sells;
		
		name = Teclado.lerTexto("Digite seu nome:");
		salary = Teclado.lerDouble("Digite o seu salario:");
		sells = Teclado.lerDouble("Digite o total arrecadado com vendas:");
		
		sells = sells * 0.15;
		salary = salary + sells;
		
		System.out.println(name);
		System.out.println("Full salary:" + salary);
		System.out.println("Arrecadção com vendas:" + sells);
		
	}
	
	public static void exercicio7()
	{
		double prestacao;
		double valor;
		
		prestacao = Teclado.lerDouble("Digite quantas prestações vão ser efetuadas:");
		valor = Teclado.lerDouble("Digite qual valor da compra:");
		valor = valor / prestacao;
		
		System.out.println("O valor: " + valor + " será pago em " + prestacao + " prestações.");
		
		
	}
	
	public static void exercicio8()
	{
		double buy;
		double sell; 
		
		buy = Teclado.lerDouble("Digite o valor que o item foi comprado:");
		sell = Teclado.lerDouble("Digite quantos % deve ser acrescentado com base no valor de compra:");
		
		sell = buy + (buy * (sell / 100));
		
		System.out.println("O valor de venda é: " + sell);

	}

	public static void exercicio9()
	{
			int years;
			int months;
			int days;
	
			System.out.println("A seguir digite sua idade em dia, mes e ano:");
			years = Teclado.lerInt(null);
			months = Teclado.lerInt(null);
			days = Teclado.lerInt(null);
			
			days = days + (years * 12 * 30) + (months * 30);
			
	}
	
	public static void exercicio10()
	{
		int total_eleitores = Teclado.lerInt("Digite o numero total de eleitores:");
		int votos_brancos = Teclado.lerInt("Digite o total de votos brancos:");
		int votos_nulos = Teclado.lerInt("Digite o total de votos nulos:");
		int votos_validos = Teclado.lerInt("Digite o total de votos válidos:");
		int total_votos = votos_brancos + votos_nulos + votos_validos;
		
		double percentual_brancos = (double) votos_brancos / total_votos * 100;
		double percentual_nulos = (double) votos_nulos / total_votos * 100;
		double percentual_validos = (double) votos_validos / total_votos * 100;
		
		System.out.println("Percentual de votos brancos: " + percentual_brancos + "%");
        System.out.println("Percentual de votos nulos: " + percentual_nulos + "%");
        System.out.println("Percentual de votos válidos: " + percentual_validos + "%");
		
	}
	
	public static void main(String[] args)
	{

	}
}
