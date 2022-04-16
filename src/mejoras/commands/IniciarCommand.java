package mejoras.commands;

import interfaz.InterfazZombieKiller;

public class IniciarCommand implements Command {

	InterfazZombieKiller izk;
	
	public IniciarCommand(InterfazZombieKiller izk) {
		this.izk = izk;
	}

	@Override
	public void execute() {
			izk.partidaIniciada();
	}

}
