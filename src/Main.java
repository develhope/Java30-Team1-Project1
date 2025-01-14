public class Main {
    public static void main(String [] args){
        //TODO creare gli oggetti del menu. per ogni oggetto stampare l'informazione
        Antipasti crostini = new Antipasti("Crostini con pâté di fegato", 1.80);
        Antipasti involtini = new Antipasti("Involtini di bresaola con rucola e scaglie di parmigiano", 2.10);
        Antipasti fonduta = new Antipasti("Sformato di carne con fonduta", 3.00);
        Antipasti salumi = new Antipasti("Salumi misti con formaggi stagionati", 2.50);
        Antipasti carpaccio = new Antipasti("Carpaccio di manzo con rucola e limone", 5.30);

        crostini.stampaInfo();
        involtini.stampaInfo();
        fonduta.stampaInfo();
        salumi.stampaInfo();
        carpaccio.stampaInfo();
    }
}