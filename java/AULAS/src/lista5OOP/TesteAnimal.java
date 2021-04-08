package lista5OOP;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro cao = new Cachorro("Pitbull",15);
		Cavalo cavalo = new Cavalo("Pé de pano",10);
		Preguica preguica = new Preguica("Preguiça",4);
		
		cao.emitirSom();
		cavalo.emitirSom();
		preguica.emitirSom();
		
	}

}
