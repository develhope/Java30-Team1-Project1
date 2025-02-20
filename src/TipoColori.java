public enum TipoColori {
    RESET("\033[0m"),
    GREEN("\033[1;32m"),
    YELLOW("\033[1;33m"),
    RED("\033[1;91m"),
    PURPLE("\033[1;35m"),
    BLUE("\033[1;34m");

    private final String colore;
    TipoColori(String colore) {
        this.colore = colore;
    }

    public String getColore() {
        return colore;
    }

    /**
     * questo metodo implementa una stile di testo e la colorazione
     * @param message prende il testo
     * @return e lo ritorna formattato
     */
    public String colorize(String message) {
        return this.colore + message + RESET.colore;
    }
}