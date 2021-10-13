import java.util.ArrayList;

public interface Dados {
	public void listar();
	public Object buscar(String hash);
	public boolean excluir(String hash);
}
