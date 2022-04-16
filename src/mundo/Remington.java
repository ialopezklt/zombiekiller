package mundo;

import mejoras.EstadoArma;
import mejoras.Weapon;

public class Remington extends ArmaDeFuego implements Weapon {

	private static final long serialVersionUID = 1L;

	/**
	 * valor  del daño que genera el arma
	 */
	private byte danio;

	/**
	 * valor  que representa el alcance de la escopeta
	 */
	private short tiempoCarga;

	/**
	 * valor  que representa el tiempo en milisegundos que tarda en cargar el arma
	 */
	private short retroceso;
	
	/**
	 * valor que representa el alcance de la escopeta
	 */
	public int rango;
	
	private EstadoArma estado;


	/**
	 * Constructor del arma de fuego Remington con sus características
	 */
	public Remington () {
		super();
		
		danio = 3;
		tiempoCarga = 1400;
		retroceso = 400;
		rango = 100;
		estado = EstadoArma.LISTA;
		
		settBombeo(retroceso);
		setLimBalas((byte) 3);
		setMunicion(getLimBalas());
		setTiempoCarga(tiempoCarga);
		setDanio(danio);
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
		return rango;
	}

	@Override
	public void setRango(int rango) {
		this.rango = rango;
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
		return "Remington";
	}


	@Override
	public Weapon reset() {
		// TODO Auto-generated method stub
		return null;
	}
		
}
