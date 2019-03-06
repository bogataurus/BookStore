public class Book {
    private String name;
    private String author;
    private String translated;
    private int printing;
    private int yearOfThePrinting;
    private String publisher;
    private int firstEdition;
    private String type;
    private int numberOfPages;
    private String award;
    private double price;
    private String language;

    public Book(String name, String author){
        this(name, author," ",0,0,"",0," ",0," ",0," ");
    }


    public Book(){
        this("no information","no information","no information",0,0,"no information",0,"no information",0,"no information",0.0, "no information");
    }
    public Book(String name, String author, String translated, int printing, int yearOfThePrinting, String publisher, int firstEdition, String type, int numberOfPages, String award, double price, String language){
        this.name = name;
        this.author = author;
        this.translated = translated;
        this.printing = printing;
        this.yearOfThePrinting = yearOfThePrinting;
        this.publisher = publisher;
        this.firstEdition = firstEdition;
        this.type = type;
        this.numberOfPages = numberOfPages;
        this.award = award;
        this.price = price;
        this.language= language;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setTranslated(String translated){
        this.translated = translated;
    }
    public String getTranslated(){
        return this.translated;
    }
    public void setPrinting(int printing){
        this.printing = printing;
    }
    public int getPrinting(){
        return this.printing;
    }
    public void setYearOfThePrinting(int yearOfThePrinting){
        this.yearOfThePrinting = yearOfThePrinting;
    }
    public int getYearOfThePrinting(){
        return this.yearOfThePrinting;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public String getPublisher(){
        return this.publisher;
    }
    public void setFirstEdition(int firstEdition){
        this.firstEdition = firstEdition;
    }
    public int getFirstEdition(){
        return this.firstEdition;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
    public int getNumberOfPages(){
        return this.numberOfPages;
    }
    public void setAward(String award){
        this.award = award;
    }
    public String getAward(){
        return this.award;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }
    public void setLanguage(String language){
        this.language = language;
    }
    public String getLanguage(){
        return this.language;
    }
    public void showInfos(){
        System.out.println("Book name: "+this.name);
        System.out.println("Book author: "+this.author);
        System.out.println("Book translated: "+this.translated);
        System.out.println("Book printing: "+this.printing);
        System.out.println("Book year of the printing: "+ this.yearOfThePrinting);
        System.out.println("Book publisher: "+this.publisher);
        System.out.println("Book first edition: "+ this.firstEdition);
        System.out.println("Book type: "+ this.type);
        System.out.println("Book number of pages: "+ this.numberOfPages);
        System.out.println("Book award: "+ this.award);
        System.out.println("Book price: "+ this.price+" ₺");
        System.out.println("Book language: "+ this.language);


    }
}
