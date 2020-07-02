package Planetarium;

public class Planet extends Star{
	
	private final static String MESS_ID_NEWPLANET = "Inserisci il nome del pianeta"; 
	private final static String MESS_MASS_NEWPLANET = "Inserisci la massa del pianeta"; 
	private final static String MESS_POS_X_NEWPLANET = "Inserisci la posizione x del pianeta"; 
	private final static String MESS_POS_Y_NEWPLANET = "Inserisci la posizione y del pianeta"; 
	
	
	// costruttore
	public Planet(String id, int mass, int position_x, int position_y) {
		super(id, mass, position_x, position_y);
		
	}

	
	public void addPlanet() {
		
		setId(mylib.InputDati.leggiStringa(MESS_ID_NEWPLANET + "\t >> \t" ));
		setMass(mylib.InputDati.leggiIntero(MESS_MASS_NEWPLANET + "\t >> \t" ));
		setPosition_x(mylib.InputDati.leggiIntero(MESS_POS_X_NEWPLANET + "\t >> \t" ));
		setPosition_y(mylib.InputDati.leggiIntero(MESS_POS_Y_NEWPLANET + "\t >> \t" ));
		
		
	}

	
	
	
}
