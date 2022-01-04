package SWAPI;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PersonagemApareceMais {

	// Método void para mostra os personagem que mais aparece nos filmes.
	public void Personagem_Aparece_Mais() {

		// As imagem fora colocado dentro do pacote e chamado pelo getClass().getResource().
		ImageIcon ObiWanKenobi = new ImageIcon(getClass().getResource("ObiWanKenobi.png"));
		ImageIcon C3PO = new ImageIcon(getClass().getResource("C3PO.png"));
		ImageIcon R2D2 = new ImageIcon(getClass().getResource("R2D2.png"));

		//Usando um showMessageDialog para mostra as imagem dos personagens que mais aparece.
		JOptionPane.showMessageDialog(null, "Personagem que mais aparece em 1° lugar: ObiWanKenobi", "Personagens", 0,
				ObiWanKenobi);
		JOptionPane.showMessageDialog(null, "Personagem que mais aparece em 2° lugar: C3PO", "Personagens", 0, C3PO);
		JOptionPane.showMessageDialog(null, "Personagem que mais aparece em 3° lugar: R2D2", "Personagens", 0, R2D2);

	}

}
