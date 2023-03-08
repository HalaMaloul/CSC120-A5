/**
 This class is used for the Passenger Data

 */

public class Passenger {
    
    private String name;
/**
  This constructer accepts data for the name of the passenger
   
 @param name-string value for the student name
 */
    public Passenger(String name) {
        this.name = name;
    }
    /** This method will return the name of the passenger
 * 
 * @return name-string value for the passenger name 
 */
    public String getname(){
        return name;
    
    }
    /** This method will call `c.addPassenger(this)` to board a given `Car` 
     *  and it will `catch` the `RuntimeException` 
     * that will be thrown by `c.addPassenger(...)` in the event that the car is full.)
    */
    public void boardCar(Car c){
       
        try {
            while (true) {
                c.addPassenger(this);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); //the car is full
        }
    }
     /** This method will  call `c.removePassenger(this)` to get off a given `Car`
      abd it will `catch` the `RuntimeException` that 
      will be thrown by `c.removePassenger(...)` in the event that the `Passenger` wasn't actually onboard.)
    */
    public void getOffCar(Car c){
       
        try {
            while (true) {
                c.removePassenger(this);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); //the car is full
        }
    }

   

}
