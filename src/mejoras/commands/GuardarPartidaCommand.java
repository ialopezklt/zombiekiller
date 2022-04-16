package mejoras.commands;

import interfaz.InterfazZombieKiller;

public class GuardarPartidaCommand implements Command{

	InterfazZombieKiller izk;
	
	public GuardarPartidaCommand(InterfazZombieKiller izk) {
		this.izk = izk;
	}

	@Override
	public void execute() {
		izk.guardarJuego();
	}

}
