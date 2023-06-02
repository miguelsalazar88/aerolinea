package modelo;

public class Tiquete {

    private String idTiquete;
    private Pasajero owner;
    private Vuelo vuelo;
    private int precio;
    private String asiento;
    
    
	public Tiquete(int idTiquete, Vuelo vuelo, int precio) {
		super();
		this.idTiquete = idTiquete;
		this.vuelo = vuelo;
		this.precio = precio;
	}


	public int getIdTiquete() {
		return idTiquete;
	}


	public void setIdTiquete(int idTiquete) {
		this.idTiquete = idTiquete;
	}


	public Pasajero getOwner() {
		return owner;
	}


	public void setOwner(Pasajero owner) {
		this.owner = owner;
	}


	public Vuelo getVuelo() {
		return vuelo;
	}


	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public String getAsiento() {
		return asiento;
	}


	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}


	@Override
	public String toString() {
		return "Tiquete [idTiquete=" + idTiquete + ", owner=" + owner + ", vuelo=" + vuelo + ", precio=" + precio
				+ ", asiento=" + asiento + "]";
	}
	
	

    public Tiquete(String idTiquete, Pasajero owner, Vuelo vuelo) {
        this.idTiquete = idTiquete;
        this.owner = owner;
        this.vuelo = vuelo;
    }

    public String getIdTiquete() {
        return idTiquete;
    }

    public Pasajero getOwner() {
        return owner;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }
}
