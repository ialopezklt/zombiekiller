package mejoras.commands;

import interfaz.InterfazZombieKiller;

public class CargarPartidaCommand implements Command{
	InterfazZombieKiller izk;
	
	public CargarPartidaCommand(InterfazZombieKiller izk) {
		this.izk = izk;
	}
	
	@Override
	public void execute() {
		izk.cargarJuego();
	}

}
