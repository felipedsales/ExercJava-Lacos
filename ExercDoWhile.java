package Familia36;

import java.util.Scanner;

public class ExercDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,soma=0;
		
		Scanner i = new Scanner(System.in);
		
		System.out.println("***********************************************************");
		System.out.println("******** A TECLA DE ENCERRAMENTO DO PROGRAMA � '0' ********");
		System.out.println("***********************************************************");
		
		System.out.println("\nDigite um n�mero: ");
		x=i.nextInt();
		
		do 
		{
			if(x!=0) 
			{
			soma+=x;
			System.out.println("\nDigite mais um n�mero: ");
			x=i.nextInt();
			}
			
			else
			{
				System.out.println("Voc� optou por encerrar o programa na primeira entrada de dados!!");
			}
			
		}
		while(x!=0);

		System.out.println("\nA soma � dos valores digitados �: "+soma);
	}

}
