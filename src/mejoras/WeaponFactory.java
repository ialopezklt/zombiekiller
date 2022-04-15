package mejoras;

import mundo.Cuchillo;
import mundo.Granada;
import mundo.M1911;
import mundo.Remington;

public class WeaponFactory {
	
	public static Weapon getWeapon (String kind) {
		Weapon newWeapon = null;
		
		switch (kind.toUpperCase()) {
		case "CUCHILLO":newWeapon = new Cuchillo();
		break;
		case "GRANADA": newWeapon = Granada.getInstance();
		break;
		case "REMINGTON":newWeapon = new Remington();
		break;
		case "M1911": newWeapon = new M1911();
		break;
		}
		return newWeapon;
	}
}
