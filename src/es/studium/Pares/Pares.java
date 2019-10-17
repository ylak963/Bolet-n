package es.studium.Pares;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) 
	{
		int numero1, numero2,i;
		numero1=0;
		numero2=0;
		System.out.println("Dame un número entero:");
		Scanner teclado = new Scanner(System.in);
		numero1=teclado.nextInt();
		System.out.println("Dame otro número entero:");
		numero2=teclado.nextInt();

		for(i=numero1; i<=numero2;i++) 
		{
			if(i%2==0) 
			{
				System.out.println(i);
			}
		}
		teclado.close();
	}
}
