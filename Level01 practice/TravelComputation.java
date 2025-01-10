/*Sample Program 2 - Eric Travels from Chennai to Bangalore via Vellore. From Chennai to Vellore distance is 156.6 km and the time taken is 4 Hours and 4 Mins and from Vellore to Bangalore is 211.8 km and will take 4 Hours and 25 Mins. Compute the total distance and total time from Chennai to Bangalore*/

public class TravelComputation{
 public static void main(String args[]){


String name ="Eric";

 String fromCity = "Chennai", viaCity = "Velore", toCity = "Bangalore";

double distanceFromToVia = 156.6;

int timeFromToVia = 4 * 60 + 4;

double distanceViaToFinalCity = 211.8;

 int timeViaToFinalCity = 4 * 60 + 25;

 double totalDistance = distanceFromToVia + distanceViaToFinalCity;

 int totalTime = timeFromToVia + timeViaToFinalCity;

 System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
}

}