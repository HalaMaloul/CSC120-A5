/**
 This class is used for the train Data

 */
import java.util.ArrayList;

public class Train {

    private final Engine engine;
    private ArrayList<Car> cars;
   
     
/**
  This constructer accepts data for the fueltype and the  fule capacity and the passengers capacity and it will initialize the `Engine` and `Car`s and store them
 @param fuelType-
 @param FuelCapacity- Double value for  fuel Capacity
 */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, fuelCapacity);
        for (int i = 0; i < nCars; i++) {
            this.cars.add(new Car(passengerCapacity));
        }
    }
/** This method will return the engine
 * 
 * @return engine
 */
    public Engine getEngine(){
        return this.engine;
    }
    /** This method will  return the `i`th car
 * @return ith car
 */
    public Car getCar(int i){
        return this.cars.get(i-1) ;
       }

  /** This method will  return the maximum total capacity across all `Car`s
   *@return all capacity-int value for capacity of all cars
 */
    public int getMaxCapacityTrain(){
        int allcapacity = 0;
        for (int i = 0; i < cars.size(); i++) {
           int carcapacity= this.getCar(i).getMaxCapacity();
            allcapacity+=carcapacity;

          }
          return allcapacity;  //returns the capacity of all cars
          
    
   
}
  /** This method will  return the number of remaining open seats across all `Car`s
   *@return allSeatsRemaining-int value for all seats remaining across al cars
 */

    public int seatsRemaining(){
        int allSeatsRemaining= 0;
        for (int x = 0; x < cars.size(); x++) {
           int carSaetsRemaining= this.getCar(x).seatsRemaining();
            allSeatsRemaining+=carSaetsRemaining;

          }
          return allSeatsRemaining; //returns all seats remaining
    }

   /** This method prints out a list  of all `Passenger`s onboard
 
 */
    public void printManifest(){
        if( cars.size()==0){ //
            System.out.println("No  passengers on the train");
      
          }
          else{
              for (Car everycar: cars){
               everycar.printManifest();
              }
          }
    }
    



    public static void main(String args[]){

        // Train myTrain= new Train();
    //    myTrain.printManifest();
        
    }

        








    }



