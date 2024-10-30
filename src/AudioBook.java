public class AudioBook extends Title {
    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints() {
        double points;
        points = calculateLiteraturePoints() * copies;
        return points;
    }

    @Override
    protected double calculateLiteraturePoints() {
        double pointsPerMinute;
        double points;

        switch (getLiteratureType()) {
            case "BI":
                pointsPerMinute = 1.5;
                break;
            case "TE":
                pointsPerMinute = 1.5;
                break;
            case "LYRIK":
                pointsPerMinute = 3;
                break;
            case "SKØN":
                pointsPerMinute = 0.85;
                break;
            case "FAG":
                pointsPerMinute = 0.5;
                break;
            default:
                return -1;


        }

        points = (this.durationInMinutes * 0.5) * pointsPerMinute;
        return points;


    }
}
