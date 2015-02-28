package clases;

import java.util.ArrayList;

public class ListaMultimedia {
	ArrayList<Multimedia> listamultimedia;
	int cuantosDiscos;
	int cuantasPeliculas;
	
	public ListaMultimedia(ArrayList<Multimedia> listamultimedia) {
		super();
		this.listamultimedia = listamultimedia;
		this.cuantosDiscos = 0;
		this.cuantasPeliculas = 0;
	}

	public ArrayList<Multimedia> getListamultimedia() {
		return listamultimedia;
	}

	public void setListamultimedia(ArrayList<Multimedia> listamultimedia) {
		this.listamultimedia = listamultimedia;
	}

	public int getCuantosDiscos() {
		return cuantosDiscos;
	}

	public void setCuantosDiscos(int cuantosDiscos) {
		this.cuantosDiscos = cuantosDiscos;
	}

	public int getCuantasPeliculas() {
		return cuantasPeliculas;
	}

	public void setCuantasPeliculas(int cuantasPeliculas) {
		this.cuantasPeliculas = cuantasPeliculas;
	}
	

}
