package mundo;

import java.io.Serializable;

import mejoras.EstadoArma;
import mejoras.Weapon;
import mejoras.WeaponFactory;

public class Personaje implements SerViviente, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * valor incambiable de la salud total del personaje
	 */
	public static final byte SALUD = 4;
	/**
	 * valor de la salud del personaje
	 */
	private byte salud;
	/**
	 * cantidad de bajas realizadas
	 */
	private short matanza;
	/**
	 * puntaje que lleva
	 */
	private int score;
	/**
	 * cantidad de bajas con el último disparo en la cabeza
	 */
	private int headShots;
	/**
	 * Arma que el personaje usa en pantalla
	 */
	private ArmaDeFuego armaPrincipal;
	/**
	 * Arma que está guardada
	 */
	private ArmaDeFuego armaSecundaria;
	/**
	 * granadas que posee el jugador
	 */
	private Weapon granadas;
	/**
	 * cuchillo del personaje, es usado cuando un zombie ataca y no tiene la posibilidad de usar otra arma
	 */
	private Weapon cuchillo;
	/**
	 * estado temporal que indica que fue herido
	 */
	private boolean ensangrentado;

	/**
	 * Constructor del personaje cada vez que se inicia una partida
	 * los valores no inicializados tienen por defecto 0
	 */
	public Personaje() {
		salud = SALUD;
		granadas = (Granada) WeaponFactory.getWeapon("Granada");
		armaPrincipal = (M1911) WeaponFactory.getWeapon("M1911");
		armaSecundaria = (Remington)WeaponFactory.getWeapon("Remington");
		cuchillo = new Cuchillo();
		// municion = principal.getLimBalas();
	}

	/**
	 * obtiene el cuchillo del personaje
	 * @return cuchillo 
	 */
	public Weapon getCuchillo() {
		return cuchillo;
	}

	/**
	 * obtiene las granadas para verificar su estado y cantidad
	 * @return granadas
	 */
	public Weapon getGranadas() {
		return granadas;
	}

	/**
	 * pregunta si el personaje se encuentra herido
	 * @return true si acaba de ser arañado
	 */
	public boolean isEnsangrentado() {
		return ensangrentado;
	}

	/**
	 * cambia el estado de herida (sólo sirve para mostrar temporalmente el daño causado)
	 * @param ensangrentado
	 */
	public void setEnsangrentado(boolean ensangrentado) {
		this.ensangrentado = ensangrentado;
	}

	/**
	 * obtiene el arma que se muestra en pantalla
	 * @return
	 */
	public ArmaDeFuego getPrincipal() {
		return armaPrincipal;
	}

	/**
	 * hace el efecto que causa el lanzar una granada
	 */
	public void lanzoGranada() {
		granadas.setMunicion((byte) (granadas.getMunicion() - 1));
		granadas.setEstado(EstadoArma.CARGANDO);
	}

	@Override
	public byte getSalud() {
		return salud;
	}

	@Override
	public void setSalud(byte salud) {
		this.salud = salud;
	}

	/**
	 * retorna la cantidad de bajas que ha realizado el personaje
	 */
	public short getMatanza() {
		return matanza;
	}

	/**
	 * obtiene el puntaje que lleva
	 * @return score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * sube el puntaje que lleva el personaje
	 * @param puntos
	 */
	public void aumentarScore(int puntos) {
		score = score + puntos;
		matanza = (short) (matanza + 1);
	}

	@Override
	public String ataco() {
			armaPrincipal.setMunicion((byte)(armaPrincipal.getMunicion()-1));
			armaPrincipal.setEstado(EstadoArma.RECARGANDO);
			return EstadoArma.RECARGANDO.name();
	}

	/**
	 * se encarga de restaurar la munición del arma principal al máximo
	 */
	public void cargo() {
		armaPrincipal.setMunicion(armaPrincipal.getLimBalas());
		armaPrincipal.setEstado(EstadoArma.CARGANDO);
	}

	/**
	 * cambia del arma principal a la secundaria
	 */
	public void cambiarArma() {
		ArmaDeFuego temporal = armaPrincipal;
		armaPrincipal = armaSecundaria;
		armaSecundaria = temporal;
	}

	/**
	 * aumenta la cantidad de bajas con tiro a la cabeza
	 */
	public void aumentarTirosALaCabeza() {
		headShots++;
	}
	
	/**
	 * obtiene la cantidad de bajas con tiros a la cabeza
	 * @return
	 */
	public int getHeadShots() {
		return headShots;
	}
}
