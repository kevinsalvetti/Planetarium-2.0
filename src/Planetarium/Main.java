package Planetarium;


import mylib.MyMenu;

public class Main {

	private final static String MESS_BENVENUTO = "BENVENUTO NEL ROGRAMMA";
	private final static String CHOOSE_OPTIONS = "Scegli cosa fare";
	private final static String[] MAIN_MENU_ITEMS = { "Creazione nuovo sistema solare" };
	private final static String ERROR_MESSAGE = "ATTENZIONE INPUT NON VALIDO";
	private final static String MESS_BYE = "BYE BYE";

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(MESS_BENVENUTO);

		MyMenu principale = new MyMenu(CHOOSE_OPTIONS, MAIN_MENU_ITEMS);
		boolean fine = false;

		do {

			int voceSelezionata = principale.scegli();

			switch (voceSelezionata) {

			case 0:
				fine = true;
				System.out.println(MESS_BYE);
				break;

			case 1:
				
				// Creazione nuovo sistema solare

				SolarSystem sistemaSolare = new SolarSystem(null);
				sistemaSolare.addSolarSystem();

				
				// creazione nuova stella
				Star stella  = new Star(null, 0, 0, 0);
				stella.addStella();
				
				// creazione nuovo pianeta
				Planet pianeta = new Planet(null, 0, 0, 0);
				pianeta.addPlanet();
				
				//creazione nuova luna
				Moon luna = new Moon(null, 0, 0, 0);
				luna.addMoon();
				
				
				break;

			case 2:

				break;

			default:
				System.out.println(ERROR_MESSAGE);

				break;
			}

		} while (!fine);

	}

}
