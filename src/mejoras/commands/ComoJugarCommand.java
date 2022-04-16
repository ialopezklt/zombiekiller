package mejoras.commands;

import interfaz.InterfazZombieKiller;

public class ComoJugarCommand implements Command{


	InterfazZombieKiller izk;
	
	public ComoJugarCommand(InterfazZombieKiller izk) {
		this.izk = izk;
	}


	@Override
	public void execute() {
		izk.mostrarComoJugar();
	}


}
