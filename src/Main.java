public class Main {
    public static void main(String[] args) {
        System.out.println("Progetto ristorante Java-30 Develhope");

        SecondiPiatti secondiPiatti1 = new SecondiPiatti("Arrosto di pollo alla Birra", "Pollo marinato con birra bavarese servita con insalata", 17.99);
        SecondiPiatti secondiPiatti2 = new SecondiPiatti("Misto sulla Griglia", "Bracciola di maiale, salciccia e 3 arrosticini", 13.99);
        SecondiPiatti secondiPiatti3 = new SecondiPiatti("Orata", "cotta in padella e patate al forno", 17.99);
        SecondiPiatti secondiPiatti4 = new SecondiPiatti("Bistecca Vegana", "Servita su una base di hommous", 25.01);

        PrimiPiatti primo1 = new PrimiPiatti("Mezzani di Gragnano con sugo alla Genovese", "pasta con ragù di cipolle alla Napoletana", 8.50);
        PrimiPiatti primo2 = new PrimiPiatti("Manfredi con Ragù e ricotta", "ragù alla napoletana con ricotta di Bufala)", 9.50);
        PrimiPiatti primo3 = new PrimiPiatti("Pasta e Patate con Provola", "pasta mista con patate, pancetta e provola", 7.50);
        PrimiPiatti primo4 = new PrimiPiatti("Vermicellone alle Vongole locali", "Vermicellone gragnano con Vongole veraci", 14.50);

        System.out.println(" ");
        System.out.println("PRIMI:");

        primo1.stampaPrimi();
        primo2.stampaPrimi();
        primo3.stampaPrimi();
        primo4.stampaPrimi();

        System.out.println(" ");

        secondiPiatti1.stampaInfo();
        secondiPiatti2.stampaInfo();
        secondiPiatti3.stampaInfo();
        secondiPiatti4.stampaInfo();
    }
}

