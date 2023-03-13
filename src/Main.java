public class Main {
    public static void main(String[] args) {
        Author ilyaIlf = new Author("Илья","Ильф");
        Author williamGolding = new Author("Уильям","Голдинг");
        Book twelveChairs = new Book("12 стульев", ilyaIlf, 1928);
        Book lordOfTheFlies = new Book("Повелитель мух", williamGolding, 1954);
        lordOfTheFlies.setPublishingYear(1963);
    }
}