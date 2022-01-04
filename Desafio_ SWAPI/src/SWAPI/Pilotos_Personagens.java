package SWAPI;

import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Pilotos_Personagens {

	// Método void criado.
	public void PilotosDaFalcon() {
		
         //Criado um array para colocar os nomes dos pilotos.
		String[] NomePiloto = { "Chewbacca", "Han Solo", "Lando Calrissian", "Nien Nunb" };

		// Imagem da MillenniumFaclcon, que está sendo chamando dentro do proprio pacote pelo getclass().getResource().
		ImageIcon MillenniumFalcon = new ImageIcon(getClass().getResource("MillenniumFalcon.png"));

		// Criando um for e chamando o array 'NomePiloto' para ele percorre todos os nomes em suas posições.
		for (int i = 0; i < NomePiloto.length; i++) {
            
			//Usando um showMessageDialog para mostra o icone da Falcon e uma mensagem dizendo quem foi o primeiro até o ultima a pilotar a falcon.
			JOptionPane.showMessageDialog(null, "Pilotos da Millennium Falcon" + "\n" + (i + 1 + "° ") + NomePiloto[i],
					"Star Wars", 0, MillenniumFalcon);

		}

	}

}
