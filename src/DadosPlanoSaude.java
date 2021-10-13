import java.util.ArrayList;

public class DadosPlanoSaude implements Dados{
	private ArrayList<PlanoSaude> vetPS = new ArrayList<PlanoSaude>();
	public void cadastrar(PlanoSaude c) {
	this.vetPS.add(c);
	System.out.println("Total de planos de saude: ");
	System.out.println(this.vetPS.size());
	}
	public void listar(){
	for (PlanoSaude objeto: this.vetPS) {
	//objeto.mostrarDados();
	//método mostrarDados();
	}
	}

	public PlanoSaude buscar(String cnpj) {
	PlanoSaude c = null;
	for ( PlanoSaude objeto: this.vetPS) {
	if (objeto.getCnpj().equals(cnpj)) {
	c = objeto;
	break;
	}
	}
	return c;
	}
	
	public boolean excluir(String cnpj){
	PlanoSaude c = this.buscar(cnpj);
	if (c != null) {
	this.vetPS.remove(c);
	return true;
	}
	else {
	return false;
	}
	}
	
	public static void salvar(ArrayList<PlanoSaude> a) {
		boolean r= Persist.gravar(a,"D:\\planosaude.dat");
		if(r == true)
			System.out.println("Planos de saude salvos com sucesso");
	}
	
}
