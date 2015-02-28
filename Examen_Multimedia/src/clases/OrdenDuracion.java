package clases;

import java.util.Comparator;

public class OrdenDuracion implements Comparator<Multimedia>{


	@Override
	public int compare(Multimedia o1, Multimedia o2) {
		if(o1.duracion<o2.duracion)
		return 1;
		else{
			if(o1.duracion==o2.duracion)
				return 0;
			else{
				return -1;
			}
		}
		
	}

}
