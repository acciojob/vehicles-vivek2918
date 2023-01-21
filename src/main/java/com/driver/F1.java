package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name,4,4,6,isManual,"type",4);
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        newSpeed = rate + getCurrentSpeed();
        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            stop();
            setCurrentGear(1);
        }
        else if(newSpeed >= 1 && newSpeed < 51){
            setCurrentGear(1);
            setCurrentSpeed(newSpeed);

        }
        else if(newSpeed >= 51 && newSpeed < 101){
            setCurrentGear(2);
            setCurrentSpeed(newSpeed);

        }
        else if(newSpeed >= 101 && newSpeed < 151){
            setCurrentGear(3);
            setCurrentSpeed(newSpeed);
        }
        else if(newSpeed >= 151 && newSpeed < 201){
            setCurrentGear(4);
            setCurrentSpeed(newSpeed);
        }
        else if(newSpeed >= 201 && newSpeed <= 250){
            setCurrentGear(5);
            setCurrentSpeed(newSpeed);
        }
        else if(newSpeed > 250){
            setCurrentGear(6);
            setCurrentSpeed(newSpeed);
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
