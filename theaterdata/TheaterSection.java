package theaterdata;

public class TheaterSection implements Comparable<TheaterSection>{

    private int rowNumber;
    private int sectionNumber;
    private int seats;
    private int availableSeats;

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public int getCapacity() {
        return seats;
    }

    public void setCapacity(int capacity) {
        this.seats = capacity;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    
    @Override
    public int compareTo(TheaterSection o) {
        
        int result = 0;
        
        if((this.availableSeats - o.availableSeats) == 0){
            
            if((this.rowNumber - o.rowNumber) == 0){
                
                result = this.sectionNumber - o.sectionNumber;
                
            }else{
                
                result = this.rowNumber - o.rowNumber;
                
            }
            
        }else{
            
            result = this.availableSeats - o.availableSeats;
            
        }
        
        return result;
        
    }

    @Override
    public String toString() {

        return "Row #: " + rowNumber + " " + "Section #: " + sectionNumber + " Capacity: " + seats + " availableSeats: " + availableSeats;

    }

}
