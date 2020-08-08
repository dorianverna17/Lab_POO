package Lab06;

import java.util.*;
import java.lang.*;

public class CalatoriA extends Vagon {
	public CalatoriA() {
		this.name = "CalatoriA";
		this.pasageri = 40;
		this.colete = 300;
	}

	public void InchidereUsi() {
		System.out.println("Usile se pot inchide automat");
	}

	public void DeschidereUsi() {
		System.out.println("Usile se pot deschide automat");
	}

	public void InchidereGeamuri() {
		System.out.println("Geamurile nu se pot inchide automat");
	}

	public void DeschidereGeamuri() {
		System.out.println("Geamurile nu se pot deschide automat");
	}
}