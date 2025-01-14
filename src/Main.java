public class Main {
    public static void main(String[] args) {
        System.out.println("Progetto ristorante Java-30 Develhope");
        SecondiPiatti secondiPiatti1 = new SecondiPiatti("Arrosto di pollo alla Birra", "Pollo marinato con birra bavarese servita con insalata", 17.99);
        SecondiPiatti secondiPiatti2 = new SecondiPiatti("Misto sulla Griglia", "Bracciola di maiale, salciccia e 3 arrosticini", 13.99);
        SecondiPiatti secondiPiatti3 = new SecondiPiatti("Orata", "cotta in padella e patate al forno", 17.99);
        SecondiPiatti secondiPiatti4 = new SecondiPiatti("Bistecca Vegana", "Servita su una base di hommous", 25.01);
        secondiPiatti1.stampaInfo();
        secondiPiatti2.stampaInfo();
        secondiPiatti3.stampaInfo();
        secondiPiatti4.stampaInfo();
    }
}

