package objetoPessoa;

import java.util.Scanner;

public class sistemaNomeLista {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		dadosPessoa pessoa=new dadosPessoa();
		
		String[] nomes=new String[3];
		
		System.out.print("Manda seu nome aí: ");
		pessoa.nome=sc.next();
		System.out.print("Manda seu sobrenome: ");
		pessoa.sobreNome=sc.next();
		System.out.print("Manda sua idade: ");
		pessoa.idade=sc.nextInt();
		
		System.out.println("Nome: "+pessoa.nome);
		System.out.println("Sobrenome: "+pessoa.sobreNome);
		System.out.println("Idade: "+pessoa.idade);
		
		sc.nextLine();
		for(int i=0;i<3;i++) {
			System.out.print("Manda seu nome aí: ");
			nomes[i]=sc.nextLine();
		}
		
		for(String nome:nomes) {
			System.out.println(nome);
		}
		
		sc.close();

	}

}
