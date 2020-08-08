package Lab06;

import java.util.*;
import java.lang.*;

public class Marfa extends Vagon {
	public Marfa() {
		this.name = "Marfa";
		this.pasageri = 0;
		this.colete = 400;
	}

	public void InchidereUsi() {
		System.out.println("Usile nu se pot inchide automat");
	}

	public void DeschidereUsi() {
		System.out.println("Usile nu se pot deschide automat");
	}

	public void InchidereGeamuri() {
		System.out.println("Geamurile nu se pot inchide automat");
	}

	public void DeschidereGeamuri() {
		System.out.println("Geamurile nu se pot deschide automat");
	}
}