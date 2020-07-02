package Planetarium;

public class SolarSystem {

	private final static String MESS_NAME_NEWSOLARSYSTEM = " Inserisci id del sistema solare";

	// Attributi

	private String id;

	// costruttore

	public SolarSystem(String id) {
		this.id = id;
	}

	// Getter / setter

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void addSolarSystem() {

		setId(mylib.InputDati.leggiStringa(MESS_NAME_NEWSOLARSYSTEM + "\t >> \t"));

	}

}
