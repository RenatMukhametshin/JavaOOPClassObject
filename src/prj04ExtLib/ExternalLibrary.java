package prj04ExtLib;
import com.skillbox.airport.*;

import java.util.*;

public class ExternalLibrary {
    public static void main(String[] args) {
        System.out.println("====Test AirportLibrary====");
        Airport airport = Airport.getInstance();
        List<Aircraft> aircraftList = airport.getAllAircrafts();
        System.out.println("Aircraft list:\n" + aircraftList);
        System.out.println("Aircraft size:\n" + aircraftList.size());
    }
}
