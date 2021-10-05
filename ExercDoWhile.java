package Familia36;

import java.util.Scanner;

public class ExercDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,soma=0;
		
		Scanner i = new Scanner(System.in);
		
		System.out.println("***********************************************************");
		System.out.println("******** A TECLA DE ENCERRAMENTO DO PROGRAMA É '0' ********");
		System.out.println("***********************************************************");
		
		System.out.println("\nDigite um número: ");
		x=i.nextInt();
		
		do 
		{
			if(x!=0) 
			{
			soma+=x;
			System.out.println("\nDigite mais um número: ");
			x=i.nextInt();
			}
			
			else
			{
				System.out.println("Você optou por encerrar o programa na primeira entrada de dados!!");
			}
			
		}
		while(x!=0);

		System.out.println("\nA soma é dos valores digitados é: "+soma);
	}

}
