
public class Quitanda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caixa<Maca> maca = new Caixa<Maca>();
		maca.adicionar(new Maca("Argentina",2));
		maca.adicionar(new Maca("Fuji",2.5));
		
		Caixa<Banana> banana = new Caixa<Banana>();
		banana.adicionar(new Banana("Nanica",0.5));
		banana.adicionar(new Banana("Prata",3));
		
		Caixa<Laranja> laranja = new Caixa<Laranja>();
		laranja.adicionar(new Laranja("Lima",3.5));
		laranja.adicionar(new Laranja("Pera Rio",3.10));
		
		Caixa<Fruta> mista = new Caixa<Fruta>();
		mista.adicionar(new Maca("Argentina",2));
		mista.adicionar(new Banana("Nanica",0.5));
		mista.adicionar(new Laranja("Lima",3.5));
		
	}

}
