package hilo;

import interfaz.InterfazZombieKiller;
import mejoras.EstadoArma;
import mejoras.Weapon;
import mundo.ArmaDeFuego;
import mundo.Remington;

public class HiloArma extends Thread {

	// private ArmaDeFuego weapon;
	// private Granada granade;
	private Weapon weapon;
	private InterfazZombieKiller principal;

	public HiloArma(InterfazZombieKiller inter, Weapon weapon) {
		this.weapon = weapon;
		principal = inter;
	}

	@Override
	public void run() {

		try {
			if (weapon instanceof ArmaDeFuego) {
				ArmaDeFuego deFuego = (ArmaDeFuego) weapon;
				if (deFuego.isEnsangrentada()) {
					sleep(100);
					principal.terminarEfectoDeSangre();
				}
				// System.out.println(weapon.getEstado());
				if (weapon.getEstado().equals(EstadoArma.RECARGANDO)) {
					// descanso mientras suena el disparo
					sleep(200);
					if (weapon instanceof Remington && deFuego.getMunicion() > 0) {
						principal.reproducir("recarga_escopeta");
					}
				} else {
					principal.reproducir("carga" + weapon.getAudioName());
				}
			}
			sleep(weapon.calcularDescanso());
			weapon.setEstado(EstadoArma.LISTA);
			principal.cambiarPuntero();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
