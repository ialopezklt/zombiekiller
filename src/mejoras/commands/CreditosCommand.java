package mejoras.commands;

import interfaz.InterfazZombieKiller;

public class CreditosCommand implements Command{

	InterfazZombieKiller izk;
	
	public CreditosCommand(InterfazZombieKiller izk) {
		this.izk = izk;
	}

	@Override
	public void execute() {
		izk.mostrarCreditos();
	}

}
