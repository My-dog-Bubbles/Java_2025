/*
Name: Angel Carmichael
Class: Period 2
Created: 10/27/25
Last Modified: 10/28/2025
Purpose:   Flight and Itinerary. The Flight class stores the information about a flight 
    with the following members. The Itinerary class stores the information about itinerary 
    with the following member.
*/
import java.time.Duration;
import java.util.*;

public class Inheritance {

    public static void main(String[] args) {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("US230",
                new GregorianCalendar(2014, 4, 5, 5, 5, 0),
                new GregorianCalendar(2014, 4, 5, 6, 15, 0)));
        flights.add(new Flight("US235",
                new GregorianCalendar(2014, 4, 5, 6, 55, 0),
                new GregorianCalendar(2014, 4, 5, 7, 45, 0)));
        flights.add(new Flight("US237",
                new GregorianCalendar(2014, 4, 5, 9, 35, 0),
                new GregorianCalendar(2014, 4, 5, 12, 55, 0)));
        
        Itinerary itinerary = new Itinerary(flights);
        System.out.println(itinerary.getTotalTravelTime());
        System.out.println(itinerary.getTotalFlightTime());
    }
}

class Flight {

    String flightNo;
    GregorianCalendar departuretime;
    GregorianCalendar arrivaltime;

    Flight() {
    }

    public Flight(String flight, GregorianCalendar departure, GregorianCalendar arrival) {
        flightNo = flight;
        departuretime = departure;
        arrivaltime = arrival;
    }

    void setArrival(GregorianCalendar arrival){
        arrivaltime = arrival;
    }

    void setDeparture(GregorianCalendar departure){
        departuretime = departure;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public GregorianCalendar getDeparture() {
        return departuretime;
    }

    public GregorianCalendar getArrival() {
        return arrivaltime;
    }

    // finds the arrival ime in milliecond and then the same for departure the convertst them into minutes
    public int getFlightTime(GregorianCalendar arrival, GregorianCalendar departure){
        long arrivaLInMillis = arrival.getTimeInMillis();
        long departureInMillis = departure.getTimeInMillis();

        long DurationInMillis = arrivaLInMillis-departureInMillis;
        int DurationInMins = (int)(DurationInMillis/(1000*60));

        return DurationInMins;

    }
}

class Itinerary extends Flight{
    List<Flight> flights;

    Itinerary() {}

    public Itinerary(List<Flight> flights) {
        this.flights = flights;
    }

    /*  */
    public int getTotalFlightTime(){
        int totalTime = 0;
        for(int i=0;i<this.length;i++){
            totalTime += getFlightTime(this[i].getArrival(), this[i].getDeparture());
        }
        return totalTime;
    }

    public int getTotalTravelTime(){
        int inbetween = 0;

        for(int i=0;i<this.length-1;i++){
            inbetween += getFlightTime(this[i].getDeparture(), this[i+1].getArrival());
        }

        int totalTravel = this.getTotalFlightTime() + inbetween;
    }
}
