/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theaterseat;

import java.util.List;
import java.util.Scanner;
import theaterdata.TheaterLayout;
import theaterdata.TheaterRequest;
import theatersearch.TheaterSeatingSearch;
/**
 *
 * @author Administrator
 */
public class TheaterSeat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String line;
        StringBuilder layout = new StringBuilder();
        StringBuilder ticketRequests = new StringBuilder();
        boolean isLayoutFinished = false;
        
        System.out.println("Please enter TheaterLayout and TicketRequests and then enter 'end'.\n");
        
        Scanner input = new Scanner(System.in);

        while((line = input.nextLine()) != null && !line.equals("end")){
            
            if(line.length() == 0){
                
                isLayoutFinished = true;
                continue;
                
            }
            
            if(!isLayoutFinished){
                
                layout.append(line + System.lineSeparator());
                
            }else{
                
                ticketRequests.append(line + System.lineSeparator());
                
            }
            
        }
        
        input.close();
        
        TheaterSeatingSearch service = new TheaterSeatingSearch();
        
        try{
        
            TheaterLayout theaterLayout = service.getTheaterLayout(layout.toString());
            
            List<TheaterRequest> requests = service.getTicketRequests(ticketRequests.toString());
            
            service.processTicketRequests(theaterLayout, requests);
            
        }catch(NumberFormatException nfe){
            
            System.out.println(nfe.getMessage());
            
        }catch(Exception e){
            
            e.printStackTrace();
            
        }

        
        
    }
    
}
