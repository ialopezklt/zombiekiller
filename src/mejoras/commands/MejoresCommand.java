package mejoras.commands;

import interfaz.InterfazZombieKiller;

public class MejoresCommand implements Command{

	InterfazZombieKiller izk;
	
	public MejoresCommand(InterfazZombieKiller izk) {
		this.izk = izk;
	}

	@Override
	public void execute() {
		izk.mostrarPuntajes();
	}


}
