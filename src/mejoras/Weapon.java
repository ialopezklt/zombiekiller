package mejoras;

import java.io.Serializable;

public interface Weapon extends Serializable {

	public byte getDanio();

	public void setDanio(byte danio);

	public short getTiempoCarga();

	public void setTiempoCarga(short tiempoCarga);

	public short getRetroceso();

	public void setRetroceso(short retroceso);
	
	public int getRango();

	public void setRango(int rango);
	
	byte getMunicion();

	void setMunicion(byte municion);
	
	void setEstado(EstadoArma estado);
	
	EstadoArma getEstado();
	
	long calcularDescanso();
	
	String getAudioName();
}
