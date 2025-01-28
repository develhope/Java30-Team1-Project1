public class Main {
    public static void main(String [] args){
        Antipasti crostini = new Antipasti("Crostini", "Con pâté di fegato e salsa BBQ", 1.80, "Carne");
        Antipasti involtini = new Antipasti("Involtini", "Bresaola, rucola e scaglie di parmigiano", 2.10, "Carne");
        Antipasti fonduta = new Antipasti("Sformato", "Carne con fonduta", 3.00, "Carne");
        Antipasti salumi = new Antipasti("Salumi", "Misti con formaggi stagionati", 2.50, "Carne");
        Antipasti carpaccio = new Antipasti("Carpaccio", "Manzo con rucola e limone", 5.30, "Carne");

        PrimiPiatti primo1 = new PrimiPiatti("Mezzani di Gragnano con sugo alla Genovese", "pasta con ragù di cipolle alla Napoletana", 8.50, "cottura al dente");
        PrimiPiatti primo2 = new PrimiPiatti("Manfredi con Ragù e ricotta", "ragù alla napoletana con ricotta di Bufala)", 9.50, "cottura al dente");
        PrimiPiatti primo3 = new PrimiPiatti("Pasta e Patate con Provola", "pasta mista con patate, pancetta e provola", 7.50, "cottura al dente");
        PrimiPiatti primo4 = new PrimiPiatti("Vermicellone alle Vongole locali", "Vermicellone gragnano con Vongole veraci", 14.50, "cottura al dente");

        SecondiPiatti secondiPiatti1 = new SecondiPiatti("Arrosto di pollo alla Birra", "Pollo marinato con birra bavarese servita con insalata", 17.99);
        SecondiPiatti secondiPiatti2 = new SecondiPiatti("Misto sulla Griglia", "Bracciola di maiale, salciccia e 3 arrosticini", 13.99);
        SecondiPiatti secondiPiatti3 = new SecondiPiatti("Orata", "cotta in padella e patate al forno", 17.99);
        SecondiPiatti secondiPiatti4 = new SecondiPiatti("Bistecca Vegana", "Servita su una base di hommous", 25.01);

        System.out.println("Benvenuti al ristorante \"Gatto Scemo\"\n");
        System.out.println("Antipasti:\n");

        crostini.stampaInfo();
        involtini.stampaInfo();
        fonduta.stampaInfo();
        salumi.stampaInfo();
        carpaccio.stampaInfo();

        System.out.println("\nPrimi Piatti:\n");

        primo1.stampaInfo();
        primo2.stampaInfo();
        primo3.stampaInfo();
        primo4.stampaInfo();

        System.out.println("\nSecondo Piatti:\n");

        secondiPiatti1.stampaInfo();
        secondiPiatti2.stampaInfo();
        secondiPiatti3.stampaInfo();
        secondiPiatti4.stampaInfo();
    }
}

