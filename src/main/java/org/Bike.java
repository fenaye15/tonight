package org;
public class Bike {
    private int size;
    private String name;

    public void ride() {
        System.out.println("riding the " + name + size );
    }


        public static void main (String arg[]){
            /////take a ride
            Bike firstBike = new Bike();
            firstBike.name = "road";
            firstBike.size = 24;
            firstBike.ride();
        }

    }
