package Lab06;

import java.util.*;
import java.lang.*;

public abstract class Vagon {
	protected int pasageri;
	protected int colete;
	protected String name;

	public abstract void InchidereUsi();
	public abstract void DeschidereUsi();
	public abstract void InchidereGeamuri();
	public abstract void DeschidereGeamuri();
}