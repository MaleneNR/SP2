public class PrintedBook extends Title{
    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages){
        super(title, literatureType, copies);
        this.pages = pages;
    }

    @Override
    protected double calculatePoints() {
        double points;
        points = calculateLiteraturePoints()* copies;
        return points;
    }

    @Override
    protected double calculateLiteraturePoints() {
        double pointsPerPage;
        double points;

        switch (getLiteratureType()) {
            case "BI":
                pointsPerPage = 3;
                break;
            case "TE":
                pointsPerPage = 3;
                break;
            case "LYRIK":
                pointsPerPage = 6;
                break;
            case "SKØN":
                pointsPerPage = 1.7;
                break;
            case "FAG":
                pointsPerPage = 1;
                break;
            default:
                return -1;
        }

        points = this.pages * pointsPerPage;
        return points;


    }
}
