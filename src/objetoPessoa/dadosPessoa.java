package objetoPessoa;

public class dadosPessoa{
		public int[] idades;
		public String[] nomes;
		public String[] sobreNomes;
		
		void dado(){
			System.out.println("Nome: "+ nomes+sobreNomes +"\n"
					+"Idade: "+String.format("", idades));
		}
		public String toString (){
			return "Nome: "+ nomes+sobreNomes +"\n"
					+"Idade: "+String.format("", idades);
		}
}
