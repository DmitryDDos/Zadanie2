public class House {
    private int floors;

    public House(int floors) {
        this.floors = floors;
    }

    public String getDescription() {
        String floorWord;
        if (floors % 10 == 1) {
            floorWord = "этажом";
        } else {
            floorWord = "этажами";
        }
        return "Дом с " + floors + " " + floorWord;
    }
}
