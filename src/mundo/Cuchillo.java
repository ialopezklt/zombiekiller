package mundo;

import mejoras.EstadoArma;
import mejoras.Weapon;

public class Cuchillo implements Weapon {

	private byte danio;

	private short tiempoCarga;

	private short retroceso;
	
	private EstadoArma estado;
	
	/**
	 * Constructor del cuchillo con su respectivo daño
	 */
	public Cuchillo() {
		setTiempoCarga((short) 200);
		estado = EstadoArma.LISTA;
		danio=4;
	}
	@Override
	public long calcularDescanso() {
		long descanso = 0;
		if(getEstado().equals(EstadoArma.CARGANDO))
			descanso = getTiempoCarga();
		return descanso;
	}

	@Override
	public byte getDanio() {
		return danio;
	}

	@Override
	public void setDanio(byte danio) {
		this.danio = danio;
	}

	@Override
	public short getTiempoCarga() {
		return tiempoCarga;
	}

	@Override
	public void setTiempoCarga(short tiempoCarga) {
		this.tiempoCarga = tiempoCarga;
	}

	@Override
	public short getRetroceso() {
		return retroceso;
	}

	@Override
	public void setRetroceso(short retroceso) {
		this.retroceso = retroceso;
	}

	@Override
	public int getRango() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setRango(int rango) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public byte getMunicion() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setMunicion(byte municion) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setEstado(EstadoArma estado) {
		this.estado = estado;
		
	}
	@Override
	public EstadoArma getEstado() {
		return estado;
	}
	@Override
	public String getAudioName() {
		return "Cuchillo";
	}
		
	
}
