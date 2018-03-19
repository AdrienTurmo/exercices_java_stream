class Chat extends Animal {
    private Couleur couleur;

    Chat(Couleur couleur) {
        super(4);
        this.couleur = couleur;
    }

    public Couleur getCouleur() {
        return couleur;
    }
}
