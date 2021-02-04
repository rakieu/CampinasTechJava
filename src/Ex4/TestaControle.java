package Ex4;

public class TestaControle {

		public static void main(String[] args) {
			
			ControleRemoto controle = new ControleRemoto();
			Televisao televisao = new Televisao();
			
			televisao.setControleRemoto(controle);

			televisao.getControleRemoto();
			
			televisao.getControleRemoto().aumentarVolume();
			televisao.getControleRemoto().aumentarCanal();
			televisao.getControleRemoto().aumentarCanal();
			
			System.out.println("Volume da tv: "+ televisao.getControleRemoto().getVolume());
			System.out.println("Canal da tv: "+ televisao.getControleRemoto().getCanal());
			System.out.println("");
			
			televisao.getControleRemoto().aumentarVolume();
			televisao.getControleRemoto().aumentarVolume();
			televisao.getControleRemoto().aumentarVolume();
			televisao.getControleRemoto().mudarCanal(500);

			
			System.out.println("Volume: "+ controle.getVolume());
			System.out.println("Canal: "+ controle.getCanal());

		}
	}