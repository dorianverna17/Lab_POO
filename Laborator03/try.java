class Carte {
    String nume, autor;
    int nr_pagini;
 
    public Carte(String nume, String autor, int nr_pagini) {
        this.nume = nume;
        this.autor = autor;
        this.nr_pagini = nr_pagini;
    }
 
    public Carte() {
        this("Enigma Otiliei", "George Calinescu", 423);
    }
 
    public String toString() {
        return this.autor + ", " + this.nume + " - " + this.nr_pagini;
    }
 
    public static void main(String args[]) {
        Carte carte;
        carte = new Carte("Poezii", "Mihai Eminescu", 256);
        Carte da;
        da = new Carte();
        System.out.println(carte.toString());
        System.out.println(da.toString());
    }
}