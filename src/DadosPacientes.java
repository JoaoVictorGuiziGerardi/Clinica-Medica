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
		//m�todo mostrarDados();
		}
		}
		//este m�todo retorna o objeto Paciente caso encontrado, ou null,
		public Pacientes buscar(String cpf) {//pode-se usar tamb�m int
		Pacientes c = null;
		for ( Pacientes objeto: this.vetPac) {
		if (objeto.getCpf().equals(cpf)) {
		c = objeto;
		break;
		}
		}
		return c;
		}
		//este m�todo usa o m�todo buscar j� implementado
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

