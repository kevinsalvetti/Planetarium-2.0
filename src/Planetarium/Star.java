package Planetarium;

public class Star {
	
	private final static String MESS_ID_NEWSTAR = "Inserisci il nome della stella"; 
	private final static String MESS_MASS_NEWSTAR = "Inserisci la massa della stella"; 
	private final static String MESS_POS_X_NEWSTAR = "Inserisci la posizione x della stella"; 
	private final static String MESS_POS_Y_NEWSTAR = "Inserisci la posizione y della stella"; 
	
	//Attributi
	private String id;
	private int mass;
	private int position_x;
	private int position_y;
	
	// costruttore 
	
	public Star (String id,int mass,int position_x,	int position_y) {
		this.id = id;
		this.mass = mass;
		this.position_x = position_x;
		this.position_y = position_y;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	public int getPosition_x() {
		return position_x;
	}

	public void setPosition_x(int position_x) {
		this.position_x = position_x;
	}

	public int getPosition_y() {
		return position_y;
	}

	public void setPosition_y(int position_y) {
		this.position_y = position_y;
	}

	public void addStella() {
		// TODO Auto-generated method stub
		
		setId(mylib.InputDati.leggiStringa(MESS_ID_NEWSTAR + "\t >> \t" ));
		setMass(mylib.InputDati.leggiIntero(MESS_MASS_NEWSTAR + "\t >> \t" ));
		setPosition_x(mylib.InputDati.leggiIntero(MESS_POS_X_NEWSTAR + "\t >> \t" ));
		setPosition_y(mylib.InputDati.leggiIntero(MESS_POS_Y_NEWSTAR + "\t >> \t" ));
	}
}
