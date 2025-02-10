public enum TipoColori {
    RESET("\033[0m"),
    GREEN_BOLD("\033[1;32m"),
    YELLOW_BOLD("\033[1;33m"),
    RED_BOLD_BRIGHT("\033[1;91m"),
    PURPLE_BOLD("\033[1;35m");

    private final String colore;
    TipoColori(String colore) {
        this.colore = colore;
    }

    @Override
    public String toString() {
        return colore;
    }

    public String colorize(String message) {
        return this.colore + message + RESET;
    }
}