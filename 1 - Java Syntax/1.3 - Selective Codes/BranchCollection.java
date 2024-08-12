public class BranchCollection {
    public String user;
    BranchCollection(String user) {
        this.user = user;
    }
    public double payCheck(double cost, int units) {
        if (units >= 10) {
            return (cost * units) * 0.75;
        } else {
            return cost * units;
        }
    }
    public String vivaldi(int n) {
        String seasonName = switch(n) {
            case 1 -> "Winter";
            case 2 -> "Spring";
            case 3 -> "Summer";
            case 4 -> "Autumn";
            default -> "???";
        };
        return seasonName;
    }
}
