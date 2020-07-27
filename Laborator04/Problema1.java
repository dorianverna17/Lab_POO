import java.util.*;
import java.lang.*;

class Patrulater {
    public int latura1, latura2, latura3, latura4;
    public double unghi1, unghi2, unghi3, unghi4;
 
    public Patrulater() {
        this(0, 0, 0, 0);
    }
 
    public Patrulater(int latura1, int latura2, int latura3, int latura4) {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
        this.latura4 = latura4;
    }
 
    public Patrulater(double unghi1, double unghi2, double unghi3, double unghi4) {
        this(0, 0, 0, 0, unghi1, unghi2, unghi3, unghi4);
    }
 
    public Patrulater(int latura1, int latura2, int latura3, int latura4,
                      double unghi1, double unghi2, double unghi3, double unghi4) {
        this(latura1, latura2, latura3, latura4);
        this.unghi1 = unghi1;
        this.unghi2 = unghi2;
        this.unghi3 = unghi3;
        this.unghi4 = unghi4;
    }
 
    public int perimetru() {
        int result;
        result = latura1 + latura2 + latura3 + latura4;
        return result;
    }
}

class Paralelogram extends Patrulater {
    public Paralelogram() {
        this(1, 1, 1);
    }

    public Paralelogram(int latura1, int latura2, double unghi1) {
        this.latura1 = latura1;
        this.latura3 = latura1;
        this.latura2 = latura2;
        this.latura4 = latura2;
        this.unghi1 = unghi1;
        this.unghi3 = unghi1;
        this.unghi2 = 180 - unghi1;
        this.unghi4 = 180 - unghi1;
    }

	public double Arie() {
		// System.out.println(latura1);
		// System.out.println(this.latura1);
		return this.latura1 * this.latura2 * Math.sin(Math.toRadians(this.unghi1));
	}
}

class Romb extends Paralelogram {
	int diag1, diag2;

	public Romb() {
		this(1, 1);
	}

	public Romb(int diag1, int diag2) {
		this.diag1 = diag1;
		this.diag2 = diag2;
	}

	public double Arie() {
		System.out.println(this.latura1);
		System.out.println(this.unghi2);
		return ((double)(this.diag1 * this.diag2) / 2);
	}
}

class Dreptunghi extends Paralelogram {
	public Dreptunghi() {
		this(2, 2);
		this.unghi1 = 90;
		this.unghi2 = 90;
		this.unghi3 = 90;
		this.unghi4 = 90;
	}

	public Dreptunghi(int latura1, int latura2) {
		this.latura1 = latura1;
		this.latura3 = latura1;
		this.latura2 = latura2;
		this.latura4 = latura2;
	}

	public double Arie() {
		System.out.println(this.latura1);
		System.out.println(this.unghi1);
		return this.latura1 * this.latura2;
	}
}

class Patrat extends Dreptunghi {
	public Patrat() {
		this(4);
		// this.unghi1 = 90;
		// this.unghi2 = 90;
		// this.unghi3 = 90;
		// this.unghi4 = 90;
	}

	public Patrat(int latura1) {
		this.latura1 = latura1;
		this.latura3 = latura1;
		this.latura2 = latura1;
		this.latura4 = latura1;
	}

	public double Arie() {
		System.out.println(this.latura1);
		System.out.println(this.unghi1);
		return this.latura1 * this.latura2;
	}
}

public class Problema1 {
	public static void main(String args[]) {
		Paralelogram p = new Paralelogram();
		System.out.println(p.Arie());

		Romb r = new Romb();
		System.out.println(r.Arie());

		Dreptunghi d = new Dreptunghi();
		System.out.println(d.Arie());

		System.out.println();		
		Patrat patrat = new Patrat();
		System.out.println(patrat.Arie());		
	}
}	