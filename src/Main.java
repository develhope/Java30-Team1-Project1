public class Main {
    public static void main(String [] args){
        //TODO creare gli oggetti del menu. per ogni oggetto stampare l'informazione
        Antipasti crostini = new Antipasti("Crostini con pâté di fegato", 1.80);
        Antipasti involtini = new Antipasti("Involtini di bresaola con rucola e scaglie di parmigiano", 2.10);
        Antipasti fonduta = new Antipasti("Sformato di carne con fonduta", 3.00);
        Antipasti salumi = new Antipasti("Salumi misti con formaggi stagionati", 2.50);
        Antipasti carpaccio = new Antipasti("Carpaccio di manzo con rucola e limone", 5.30);

        SecondiPiatti secondiPiatti1 = new SecondiPiatti("Arrosto di pollo alla Birra", "Pollo marinato con birra bavarese servita con insalata", 17.99);
        SecondiPiatti secondiPiatti2 = new SecondiPiatti("Misto sulla Griglia", "Bracciola di maiale, salciccia e 3 arrosticini", 13.99);
        SecondiPiatti secondiPiatti3 = new SecondiPiatti("Orata", "cotta in padella e patate al forno", 17.99);
        SecondiPiatti secondiPiatti4 = new SecondiPiatti("Bistecca Vegana", "Servita su una base di hommous", 25.01);

        PrimiPiatti primo1 = new PrimiPiatti("Mezzani di Gragnano con sugo alla Genovese", "pasta con ragù di cipolle alla Napoletana", 8.50);
        PrimiPiatti primo2 = new PrimiPiatti("Manfredi con Ragù e ricotta", "ragù alla napoletana con ricotta di Bufala)", 9.50);
        PrimiPiatti primo3 = new PrimiPiatti("Pasta e Patate con Provola", "pasta mista con patate, pancetta e provola", 7.50);
        PrimiPiatti primo4 = new PrimiPiatti("Vermicellone alle Vongole locali", "Vermicellone gragnano con Vongole veraci", 14.50);

        System.out.println("Benvenuti al ristorante \"Gatto Scemo\"");
        System.out.println("Antipasti:");

        crostini.stampaInfo();
        involtini.stampaInfo();
        fonduta.stampaInfo();
        salumi.stampaInfo();
        carpaccio.stampaInfo();

        System.out.println("Primi Piatti:");

        primo1.stampaPrimi();
        primo2.stampaPrimi();
        primo3.stampaPrimi();
        primo4.stampaPrimi();

        System.out.println("Secondo Piatti:");

        secondiPiatti1.stampaInfo();
        secondiPiatti2.stampaInfo();
        secondiPiatti3.stampaInfo();
        secondiPiatti4.stampaInfo();
    }
}

