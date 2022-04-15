package mundo;

import mejoras.EstadoArma;
import mejoras.Weapon;

public class M1911 extends ArmaDeFuego implements Weapon {

	private byte danio;

	private short tiempoCarga;

	private short retroceso;
	
	private int rango;
	
	private EstadoArma estado;
	
	/**
	 * Constructor del arma M1911 con sus características
	 */
	public M1911 () {
		super();
		danio = 1;
		tiempoCarga = 1300;
		retroceso = 100;
		estado = EstadoArma.LISTA;
		settBombeo(retroceso);
		setTiempoCarga(tiempoCarga);
		setDanio(danio);
		setLimBalas((byte) 8);
		setMunicion(getLimBalas());
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
		
		return "M1911";
	}
		
	
}
