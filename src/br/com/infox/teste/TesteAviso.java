package br.com.infox.teste;

<<<<<<< HEAD
import java.util.List;
import java.util.Scanner;


=======
import java.util.Scanner;

>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
import br.com.infox.entidades.Aviso;
import br.com.infox.jdbc.AvisoDAO;

public class TesteAviso {

<<<<<<< HEAD

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 
		//cadastro();
		alterar();
		//excluir();
		//buscarPorMatricula();		
		//buscarTodos();
		//testeAutenticar();
		
=======
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		cadastro();
		alterar();
		excluir();
		buscar();
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315

	}

	private static void cadastro() {
		Aviso avi = new Aviso();
		
		AvisoDAO avidao = new AvisoDAO();
		
		avi.setNomeAviso("Aula extra sábado");
		avi.setIdAviso(2);
		avi.setHoraPublicacao("17:12:00");
		avi.setIdDisciplina(2);
		avi.setMensagemaviso("Hoje não vai ter aula por motivo de doença.");
		
		
		
		avidao.Cadastrar(avi);
	}
	
	
	private static void alterar(){
		
		Scanner ler = new Scanner(System.in);

		Aviso avi = new Aviso();
		
		AvisoDAO avidao = new AvisoDAO();
		System.out.println("Entre com o id do aviso a ser alterado:");
		int ia = ler.nextInt();
		avi.setIdAviso(ia);

<<<<<<< HEAD
		avi.setNomeAviso("Aula");
		avi.setHoraPublicacao("17:12:00");
		avi.setIdDisciplina(1);
		avi.setMensagemaviso("Hoje não vai ter aula.");
=======
		avi.setNomeAviso("Aula extra sábado");
		avi.setHoraPublicacao("17:12:00");
		avi.setIdDisciplina(2);
		avi.setMensagemaviso("Hoje vai ter aula.");
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315

		
		
		avidao.Alterar(avi);
		
		
	}

	
	private static void excluir(){
		
		Scanner ler = new Scanner(System.in);

		Aviso avi = new Aviso();
		
		AvisoDAO avidao = new AvisoDAO();
		System.out.println("Entre com o id do aviso a ser excluído:");
		int ia = ler.nextInt();
		avi.setIdAviso(ia);

		
		
		avidao.Excluir(avi);
		
		
	}
	
<<<<<<< HEAD
	private static void buscarTodos(){
		
		AvisoDAO avidao = new AvisoDAO();
		
		List<Aviso> lista = avidao.BuscarTodos();
		
		for(Aviso a : lista){
			
			System.out.println(a.getNomeAviso()+"\n"+a.getIdAviso()+"\n"+a.getHoraPublicacao()+"\n"+a.getIdDisciplina()+"\n"+a.getMensagemaviso());
		}

	}
=======
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
	
	private static void buscar(){
		
		Scanner ler = new Scanner(System.in);
<<<<<<< HEAD
		Aviso av = new Aviso();
		
		AvisoDAO avidao = new AvisoDAO();
		
		System.out.println("Entre com o id do aviso a ser consultado:");
		int ma = ler.nextInt();
		
		if(av != null){

		
		System.out.println(av.getHoraPublicacao()+"\n"+av.getIdAviso()+"\n"+av.getIdDisciplina()+"\n"+av.getMensagemaviso()+"\n"+av.getNomeAviso());
		} 
=======
		
	
		
		AvisoDAO avidao = new AvisoDAO();
		
		if(avidao != null){
		System.out.println("Entre com o id do aviso a ser consultado:");
		int ia = ler.nextInt();

		
		System.out.println(avidao.BuscarIdAviso(ia).getIdAviso()+"\n"+avidao.BuscarIdAviso(ia).getNomeAviso()+"\n"+avidao.BuscarIdAviso(ia).getHoraPublicacao()+"\n"+avidao.BuscarIdAviso(ia).getIdDisciplina()+"\n"+avidao.BuscarIdAviso(ia).getMensagemaviso());
		} 
		else{
			
			System.out.println("Valor não encontrado.");
		}
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315


		
	}
<<<<<<< HEAD
=======

	
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
}
