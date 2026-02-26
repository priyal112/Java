package Final_keyword;

public final class Car extends Vehicle{      // final in class
    
   // private final int speedLimit = 200; // final in variable

    @Override
    public void accelerate (){

    }    

    @Override
    public void decelerate(){
        
    }

    public final void airBags(){              // final in method
        System.out.println("4 Air bags");
    }
}
