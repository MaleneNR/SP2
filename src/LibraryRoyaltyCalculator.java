public class LibraryRoyaltyCalculator {
    public static void main(String[] args){
    Author author01 = new Author("Thomas Korsgaard");


    Title firstBook = new AudioBook("Hvis der skulle komme et menneske forbi", "SKØN", 1,404);
    Title secondBook = new PrintedBook("En dag vil vi grine af det", "SKØN", 3, 312);
    Title thirdBook = new PrintedBook("Man skulle nok have været der", "SKØN", 2, 263);

    Title childrensBook = new PrintedBook("Tyggegummidamen - og andre historier", "BI", 4, 108);

    author01.addTitle(firstBook); author01.addTitle(secondBook); author01.addTitle(thirdBook); author01.addTitle(childrensBook);


    Author author02 = new Author("Hans Christian Andersen");

    Title samledeEventyrOgHistorier = new PrintedBook("Samlede eventyr og historier", "SKØN", 1, 1032);
    author02.addTitle(samledeEventyrOgHistorier);

//        System.out.println(secondBook.calculateRoyalty());
//        System.out.println(samledeEventyrOgHistorier.calculateRoyalty());

//        System.out.println(firstBook.calculateRoyalty());
//        System.out.println(secondBook.calculateRoyalty());
//        System.out.println(thirdBook.calculateRoyalty());
//        System.out.println(childrensBook.calculateRoyalty());

        System.out.println(author01);
        System.out.println(author02);

    }
}
