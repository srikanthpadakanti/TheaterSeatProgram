package theaterdata;

import java.util.List;
public class TheaterLayout {

    private int totalSeats;
    private int usableSeats;
    private List<TheaterSection> sections;

    public int getTotalCapacity() {
        return totalSeats;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalSeats = totalCapacity;
    }

    public int getAvailableSeats() {
        return usableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.usableSeats = availableSeats;
    }

    public List<TheaterSection> getSections() {
        return sections;
    }

    public void setSections(List<TheaterSection> sections) {
        this.sections = sections;
    }
    
}
