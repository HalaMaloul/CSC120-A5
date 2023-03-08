
import java.util.ArrayList;
/**
 This class is used for the Car Data

 */
public class Car {
    private ArrayList<Passenger>passengersOnboard;
    private int maxCapacity;
    
/**
  This constructer accepts data for the car max  capacity and initializes an appropriately-sized array list
 @param maxCapacity-int value for the initial max capacity

 */
Car(int maxCapacity){
    this.maxCapacity=maxCapacity;

    this.passengersOnboard=new ArrayList<Passenger>();
}
/** This method will return the max capacity of the car
 * 
 * @return max Capacity-int value for the max capacity of the car
 */
public int getmaxCapacity(){
    return maxCapacity;
   
}
/** This method will return the seats remaining in the car
 * 
 * @return seatsRemaining-int value for the number of seats remainin gin the car
 */
public int seatsRemaining(){
  return maxCapacity-passengersOnboard.size();
   }

/** This method will return an array list of the passengers on board
 * 
 * @return passrngersonboard-array list of all passengers on board 
 */
public ArrayList getpassengeronboard(){
    return passengersOnboard;

}
/** This method  will add a passenger to the car  provided that there are seats remaining 
 *  (otherwise it will throw a `RuntimeException` saying no seats remaining )
 
 @throws run time exception 
 @param p-passenger
 */
public void addPassenger(Passenger p){
    //check if there are remaining seats
    if (this.passengersOnboard.contains(p)) { // Already on the train
        throw new RuntimeException(p.getname() + " is already on the train " );
    }
    if (this.seatsRemaining()<=0){
        throw new RuntimeException( "no seats remaining " );}
       
    this.passengersOnboard.add(p);
    System.out.println(p.getname() + " was successfully added  ");

}


/** This method  will remove a passenger from the car  provided that the passenger is already on the car
 *  (otherwise it will throw a `RuntimeException` saying the passenger is not on the train )
 
 @throws run time exception 
 @param p-passenger
 */
public void removePassenger(Passenger p){
    if (!this.passengersOnboard.contains(p)) { // Not on the train
        throw new RuntimeException(p.getname() + " is not on the train ");
    }

    this.passengersOnboard.remove(p);
    System.out.println(p.getname()+ " was successfully removed " );
       
}
/** This method prints out a list of all `Passenger`s aboard the car (or "This car is EMPTY." if there is no one on board) 
 
 */
public void printManifest(){
    if( passengersOnboard.size()==0){ //
      System.out.println("This car is EMPTY");

    }
    else{
        for (Passenger everyone: passengersOnboard){
            System.out.println(everyone.getname());

        }
    }
}

public static void main(String[] args) {
    Car myCar=new Car(20);
    Passenger me=new Passenger("hala");
    myCar.addPassenger(me);
    
    // myCar.removePassenger(me);
    myCar.printManifest();
    
}

}