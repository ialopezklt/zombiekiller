package mundo;

import mejoras.EstadoArma;
import mejoras.Weapon;

public class Granada implements Weapon {

	private byte danio;

	private short tiempoCarga;

	private short retroceso;
	
	private int rango;
	
	private EstadoArma estado;
		
	/**
	 * valor que representa la cantidad de granadas
	 */
	private byte cantidad;
	
	private static Granada instance;

	/**
	 * Constructor de la granada con su respectiva cantidad y daño
	 */
	private Granada() {
		super();
		estado = EstadoArma.LISTA;
		setMunicion((byte) 2);
		setTiempoCarga((short) 200);
		danio = 6;
	}
	
	public static Granada getInstance() {
		if (Granada.instance == null) {
			return new Granada();
		}
		return Granada.instance;
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
		return rango;
	}

	@Override
	public void setRango(int rango) {
		this.rango = rango;
		
	}

	@Override
	public byte getMunicion() {
		return cantidad;
	}

	@Override
	public void setMunicion(byte municion) {
		cantidad = municion;
		
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
		return "Granada";
	}
		

}
