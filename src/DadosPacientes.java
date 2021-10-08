import java.util.ArrayList;

public class DadosPacientes{
		private ArrayList<Pacientes> vetPac = new ArrayList<Pacientes>();
		public void cadastrar(Pacientes c) {
		this.vetPac.add(c); //ADICIONA O PACIENTE NO ARRAY
		System.out.println("Total de pacientes: ");
		System.out.println(this.vetPac.size());
		}
		public void listar(){
		for (Pacientes objeto: this.vetPac) {
		objeto.mostrarDados();
		//método mostrarDados();
		}
		}
		//este método retorna o objeto Paciente caso encontrado, ou null,
		public Pacientes buscar(String cpf) {//pode-se usar também int
		Pacientes c = null;
		for ( Pacientes objeto: this.vetPac) {
		if (objeto.getCpf().equals(cpf)) {
		c = objeto;
		break;
		}
		}
		return c;
		}
		//este método usa o método buscar já implementado
		public boolean excluir(String cpf){
		Pacientes c = this.buscar(cpf);
		if (c != null) {
		this.vetPac.remove(c);
		return true;
		}
		else {
		return false;
		}
		}
		}

