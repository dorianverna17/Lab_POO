class SuperClasa {
    public int super_a;
    private int super_b;
    protected int super_c;
}
 
class SubClasa extends SuperClasa {
    public void metoda(SuperClasa x) {
        super_a = 1; //Corect
      //  super_b = 2; //Eroare la compilare
        super_c = 3; //Corect
 
        x.super_a = 1; //Corect
     //   x.super_b = 2; //Eroare la compilare
        x.super_c = 3; //Corect (clase in acelasi pachet)
    }
}
 
class Client {
    public void metoda() {
        SuperClasa sp = new SuperClasa();
        SubClasa sb = new SubClasa();
        sp.super_a = 1; //Corect
       // sp.super_b = 2; //Eroare la compilare
        sp.super_c = 3; //Corect (clase in acelasi pachet)
 
        sb.super_a = 1; //Corect
      //  sb.super_b = 2; //Eroare la compilare
        sb.super_c = 3; //Corect (clase in acelasi pachet)
    }
}