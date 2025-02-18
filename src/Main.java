public class Main {
    public static void main(String [] args){
        Ristorante gattoScemo = new Ristorante((TipoColori.PURPLE.colorize("Gatto Scemo")), "Gino Santonicola");
        Menu menu = new Menu(TipoEnum.CARNE, "Menù Carnivoro", "Piatti adatti a clienti Carnivori");
        //antipasti
        menu.addPiatto(new Antipasti("Crostini", "Con pâté di fegato e salsa BBQ", 1.80, TipoEnum.CARNE));
        menu.addPiatto(new Antipasti("Involtini", "Bresaola, rucola e scaglie di parmigiano", 2.10, TipoEnum.CARNE));
        menu.addPiatto(new Antipasti("Sformato", "Carne con fonduta", 3.00, TipoEnum.CARNE));
        menu.addPiatto(new Antipasti("Salumi", "Misti con formaggi stagionati", 2.50, TipoEnum.CARNE));
        menu.addPiatto(new Antipasti("Carpaccio", "Manzo con rucola e limone", 5.30, TipoEnum.CARNE));
        //primi piatti
        menu.addPiatto(new PrimiPiatti("Mezzani di Gragnano con sugo alla Genovese", "pasta con ragù di cipolle alla Napoletana", 8.50, TipoEnum.CARNE));
        menu.addPiatto(new PrimiPiatti("Manfredi con Ragù e ricotta", "ragù alla napoletana con ricotta di Bufala", 9.50, TipoEnum.CARNE));
        menu.addPiatto(new PrimiPiatti("Pasta e Patate con Provola", "pasta mista con patate, pancetta e provola", 7.50, TipoEnum.CARNE));
        menu.addPiatto(new PrimiPiatti("Vermicellone alle Vongole locali", "Vermicellone gragnano con Vongole veraci", 14.50, TipoEnum.PESCE));
        //secondi piatti
        menu.addPiatto(new SecondiPiatti("Arrosto di pollo alla Birra", "Pollo marinato con birra bavarese servita con insalata", 17.99, TipoEnum.CARNE));
        menu.addPiatto(new SecondiPiatti("Misto sulla Griglia", "Braciola di maiale, salciccia e 3 arrosticini", 13.99, TipoEnum.CARNE));
        menu.addPiatto(new SecondiPiatti("Orata", "cotta in padella e patate al forno", 17.99, TipoEnum.PESCE));
        menu.addPiatto(new SecondiPiatti("Bistecca Vegana", "Servita su una base di hommous", 25.01, TipoEnum.VEGETARIANO));

        gattoScemo.addMenu(menu);
        gattoScemo.stampaRistorante();
    }
}

