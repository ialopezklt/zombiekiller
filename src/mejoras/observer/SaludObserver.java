package mejoras.observer;

import hilo.HiloSonido;
import interfaz.InterfazZombieKiller;
import mundo.Personaje;

public class SaludObserver extends Observer {
	
	Personaje personaje;
	InterfazZombieKiller izk;
	int bonoAnterior = 0;
	int deltaParaObtenerBono = 100;
	
	
	public SaludObserver(Subject subject, Personaje personaje, InterfazZombieKiller izk) {
	      this.subject = subject;
	      this.personaje = personaje;
	      this.izk = izk;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
		   Boolean reproducirSonido = false;
		   if ( subject.getState()-bonoAnterior >= deltaParaObtenerBono) {
			   bonoAnterior = ( Math.floorDiv(subject.getState(), 100) * 100);
			   if ( personaje.getSalud() < Personaje.SALUD) {
				   reproducirSonido = true;
				   personaje.setSalud((byte) (personaje.getSalud() + 1));
			   } else {
				   if (personaje.getGranadas().getMunicion() < 2) {
					   personaje.getGranadas().setMunicion((byte) (personaje.getGranadas().getMunicion() + 1));
					   reproducirSonido = true;
				   }
			   }
			   if (reproducirSonido) {
				   HiloSonido sonidoMoneda = new HiloSonido("coin");
				   sonidoMoneda.start();
			   }
			   izk.getPanelCampo().actualizarMatador(personaje);
		   }
	   }
}
