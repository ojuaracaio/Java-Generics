import java.util.ArrayList;
import java.util.List;

public class Caixa<T extends Fruta> {
	
	private List<T> caixa;

	public Caixa() {
		caixa = new ArrayList<T>();
	}

	public List<T> getFrutas() {
		return caixa;
	}
	
	public void adicionar (T fruta) {
		caixa.add(fruta);
	}

}

