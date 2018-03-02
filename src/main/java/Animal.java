class Animal {
    private int nombreDePates;

    Animal(int nombreDePates) {
        this.nombreDePates = nombreDePates;
    }

    public int getNombreDePates() {
        return nombreDePates;
    }

    void perdUnePate(){
        this.nombreDePates--;
    }
}
