public abstract class Title {
    private String title;
    private String literatureType;
    protected int copies;
    protected double rate2024 = 0.067574;

    public Title(String title, String literatureType, int copies){
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    public double calculateRoyalty(){
        double royalty;
        royalty = calculatePoints()*rate2024;
        return royalty;
    }

    public String getLiteratureType() {
        return literatureType;
    }

    protected abstract double calculatePoints();

    protected abstract double calculateLiteraturePoints();



}
