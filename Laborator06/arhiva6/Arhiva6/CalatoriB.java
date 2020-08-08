package Lab06;

import java.util.*;
import java.lang.*;

public class CalatoriB extends Vagon {
	public CalatoriB() {
		this.name = "CalatoriB";
		this.pasageri = 50;
		this.colete = 400;
	}

	public void InchidereUsi() {
		System.out.println("Usile se pot inchide automat");
	}

	public void DeschidereUsi() {
		System.out.println("Usile se pot deschide automat");
	}

	public void InchidereGeamuri() {
		System.out.println("Geamurile se pot inchide automat");
	}

	public void DeschidereGeamuri() {
		System.out.println("Geamurile se pot deschide automat");
	}
}