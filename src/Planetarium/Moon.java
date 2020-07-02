package Planetarium;

public class Moon extends Planet {
	
	private final static String MESS_ID_NEWMOON = "Inserisci il nome della luna"; 
	private final static String MESS_MASS_NEWMOON = "Inserisci la massa della luna"; 
	private final static String MESS_POS_X_NEWMOON = "Inserisci la posizione x della luna"; 
	private final static String MESS_POS_Y_NEWMOON = "Inserisci la posizione y della luna"; 
	
	// costruttore
	
	public Moon(String id, int mass, int position_x, int position_y) {
		super(id, mass, position_x, position_y);
		// TODO Auto-generated constructor stub
	}

	public void addMoon() {
		// TODO Auto-generated method stub
		setId(mylib.InputDati.leggiStringa(MESS_ID_NEWMOON + "\t >> \t" ));
		setMass(mylib.InputDati.leggiIntero(MESS_MASS_NEWMOON + "\t >> \t" ));
		setPosition_x(mylib.InputDati.leggiIntero(MESS_POS_X_NEWMOON + "\t >> \t" ));
		setPosition_y(mylib.InputDati.leggiIntero(MESS_POS_Y_NEWMOON + "\t >> \t" ));
	}

}
