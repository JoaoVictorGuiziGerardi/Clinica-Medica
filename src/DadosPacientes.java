import java.util.ArrayList;

public class DadosPacientes implements Dados{
		private ArrayList<Pacientes> vetPac = new ArrayList<Pacientes>();
		public void cadastrar(Pacientes c) {
		this.vetPac.add(c);
		System.out.println("Total de pacientes: ");
		System.out.println(this.vetPac.size());
		}
		public void listar(){
		for (Pacientes objeto: this.vetPac) {
		objeto.mostrarDados();
		//método mostrarDados();
		}
		}
	
		public Pacientes buscar(String cpf) {
		Pacientes c = null;
		for ( Pacientes objeto: this.vetPac) {
		if (objeto.getCpf().equals(cpf)) {
		c = objeto;
		break;
		}
		}
		return c;
		}
		
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
		
		public static void salvar(ArrayList<Pacientes> a) {
			boolean r= Persist.gravar(a,"D:\\pacientes.dat");
			if(r == true)
				System.out.println("Pacientes salvos com sucesso");
		}
		
		}

