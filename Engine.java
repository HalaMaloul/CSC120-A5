/**
 This class is used for the engine Data
 @author Hala Maloul
 */

public class Engine {
    private FuelType f;
    private double currentFuelLevel;
    private  double maxFuelLevel;

  public FuelType getf() {
    return f;
}
/** This accecor will return the current fuel level
 * 
 * @return Double value for current fuel level
 */
public Double getcurrentFuelLevel(){
    return this.currentFuelLevel;}

/** This method will return the max fuel level
 
 * @return Double value for max fuel level
 */
public Double getmaxFuelLevel(){
    return this.maxFuelLevel;}


/**
  This constructer accepts data for the fueltype and the max fule level of an engine and sets the currentFuelLevelto the maxFuelLevel
 @param f -fueltype
 @param maxFuelLevel- Double value for max fuel level
 */
public Engine(FuelType f,Double maxFuelLevel){

    this.f=f;
    this.maxFuelLevel=maxFuelLevel;
    this.currentFuelLevel=maxFuelLevel;

    
}

/** This method will which will decrease the current fuel level and print the remaining fuel level provided the fuel level is above 0
 *  (otherwise it will throw a `RuntimeException` saying The current fuel level is less than 0 )
 
 @throws run time exception 
 */
public void refuel(){
    this.currentFuelLevel=this.maxFuelLevel;


}
/** 
 
 
 */
public void go(){
    if (currentFuelLevel>currentFuelLevel-10){
    currentFuelLevel=currentFuelLevel-10;
    System.out.println("current fuel level ="+currentFuelLevel);}
    
    else{
        throw new RuntimeException("The current fuel level is less than 0 ");
    

    }
}


public static void main(String[] args) {
    Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
    
    

    try {
        while (true) {
            myEngine.go();
        }
    } catch (Exception e) {
        System.err.println(e.getMessage()); // the passenger was not actually on board
    }
    myEngine.refuel();
    // println("current level is"+currentFuelLevel);
}


}