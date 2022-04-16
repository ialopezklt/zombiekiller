package mejoras.commands;

import interfaz.InterfazZombieKiller;

public class PausarCommand implements Command{

	InterfazZombieKiller izk;
	
	public PausarCommand(InterfazZombieKiller izk) {
		this.izk = izk;
	}

	@Override
	public void execute() {
		izk.pausarJuego();
	}


}
