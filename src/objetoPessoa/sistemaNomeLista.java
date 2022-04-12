package objetoPessoa;


public class sistemaNomeLista {

	public static void main(String[] args) {
		dadosPessoa pessoa=new dadosPessoa();
		pessoa.nomes=new String[3];
		pessoa.sobreNomes=new String[3];
		pessoa.idades=new int[3];
		
		pessoa.nomes[0]= "José";
		pessoa.sobreNomes[0]= " da Silva";
		pessoa.idades[0]=35;
		
		pessoa.nomes[1]= "Tom";
		pessoa.sobreNomes[1]= " Jobim";
		pessoa.idades[1]=67;
		
		pessoa.nomes[2]= "Ruby";
		pessoa.sobreNomes[2]= " Rubynson";
		pessoa.idades[2]=14;
		
		for(int i=0;i<3;i++) {
			System.out.println("Nome: " + pessoa.nomes[i] + pessoa.sobreNomes[i]);
			System.out.println("Idade: " + pessoa.idades[i]);
		}
		
		pessoa.dado();

	}

}
