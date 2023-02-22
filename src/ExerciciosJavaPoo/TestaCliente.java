package ExerciciosJavaPoo;

public class TestaCliente {

	public static void main(String[] args) {

		//instanciando um objeto da classe Cliente
		
		Cliente cliente1 = new Cliente("Roberta","Rua Tuiti 200 - Jd Pantanal - São Paulo SP",35,1124389245,"30876636811");
		Cliente cliente2 = new Cliente("Carlos","Av Cordeiro de Sá 3098 - Arpoador - Fortaleza CE",29,2126342702,"42524592122");

		cliente1.visualizar();
		cliente2.visualizar();
	}

}
