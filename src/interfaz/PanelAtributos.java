package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.plaf.basic.BasicRootPaneUI;

import mejoras.Weapon;
import mejoras.WeaponFactory;
import mundo.Boss;
import mundo.Granada;
import mundo.Remington;
import mundo.Zombie;

public class PanelAtributos extends JPanel {

	private JProgressBar[] barValores;
	private JLabel[] labAtributos;

	// La cantidad de atributos y valores debe ser la misma
	public PanelAtributos(String[] atributos, int[] valores) {
		setBackground(Color.BLACK);
		setLayout(new GridLayout(valores.length, 2));
		
		labAtributos = new JLabel[atributos.length];
		barValores = new JProgressBar[valores.length];
		Weapon remington = WeaponFactory.getWeapon("Remington");
		Weapon granada = WeaponFactory.getWeapon("Granada");
		
		Font letra = new Font("Chiller", Font.ITALIC, 34);
		for (int i = 0; i < valores.length; i++) {

			labAtributos[i] = new JLabel(atributos[i]);
			labAtributos[i].setFont(letra);
			labAtributos[i].setForeground(Color.white);
			add(labAtributos[i]);

			barValores[i] = new JProgressBar();
			barValores[i].setForeground(Color.RED);
			barValores[i].setBackground(Color.WHITE);
			add(barValores[i]);
			
			if (atributos[i].equals("Daño"))
				barValores[i].setMaximum(granada.getDanio());
			else if (atributos[i].equals("Salud"))
				barValores[i].setMaximum(Boss.SALUD);
			else if (atributos[i].equals("Lentitud"))
				barValores[i].setMaximum(Zombie.LENTITUD1);
			else if (atributos[i].equals("Retroceso"))
				barValores[i].setMaximum(remington.getRetroceso() + 100);
			else if (atributos[i].equals("Tiempo de Carga"))
				barValores[i].setMaximum(remington.getTiempoCarga() + 200);
			
			barValores[i].setValue(valores[i]);
		}
	}
}
