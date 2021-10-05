package Familia36;

import java.util.Scanner;

public class ExercWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade,maior=0,menor=0;
		
		Scanner i =new Scanner(System.in);
		
		System.out.println("Digite uma idade: ");
		idade=i.nextInt();
		
		while(idade!=-99) 
		{
		    if(idade>50) 
			{
				maior++;
			}
		    if(idade>0 && idade<21) 
		    {
		    	menor++;
		    }
		    
		  System.out.println("Digite uma idade: ");
		  idade=i.nextInt();
		}
		System.out.println("\nO número de pessoas com mais de 50 anos é: "+ maior);
		System.out.println("\nO número de pessoas com menos de 21 anos é: "+ menor);
		
	}

}
