public class Main {
//    public static Book bookArr[] = new Book[10];



    public static void main(String[] args) {
        Libraly libraly =new Libraly(10);
        libraly.write();
        System.out.println();
        libraly.print();
        System.out.println();
        libraly.addBook("Гарри потный - боевик ", 30312, 2023);
        System.out.println();
        libraly.print();
        libraly.printBook("Гарри потный - боевик ");
        //Libraly.addBook("Гарри потный - боевик ", 30312, 2023);
        libraly.setYearOfBook("Гарри потный - боевик ",1) ;
        libraly.print();


    }
}
