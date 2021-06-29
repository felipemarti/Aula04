import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual é a melhor forma de calcular essa média?*/

		Scanner leitor = new Scanner(System.in);
		int idade;
		int i=0;
		int soma=0, media;
		
		while(i<5) {
			System.out.println("Digite a idade do "+ (i+1) + "º aluno");
			idade = leitor.nextInt();
			soma = soma + idade;
			i = i +1;
		}
		media = soma/5;
		System.out.println("A média de idade dos alunos é " + media);
		leitor.close();
	}

}
