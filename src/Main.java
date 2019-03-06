public class Main {
    public static void main(String[] args){
        Book book1 = new Book("Korluk", "Jose Saramago", "Isık Erguden", 2, 2017, "Kirmizi Kedi", 1999, "Novel",  331, "1998 Nobel Prize", 28, "Turkce"  );
        Book book2 = new Book("Girl on a Motorcycle", "John Escott", "non", 1, 2008, "Oxford University Press", 2000, "Story", 40, "no", 27, "English"   );
        Book book3 = new Book("Su", "Buket Uzuner");
        Book book4 = new Book();

        book1.showInfos();
        System.out.println();
        book2.showInfos();
        System.out.println();
        book3.showInfos();
        System.out.println();
        book4.showInfos();



    }
}
