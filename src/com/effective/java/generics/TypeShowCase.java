package com.effective.java.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kadercelik
 */
class Vehicle{}
class Car extends Vehicle{}
class SportCar extends Car{}
class FamilyCar extends Car{}

public class TypeShowCase {



  List<? extends Vehicle> vehicles;
  List<? super Car> cars;
  {
    vehicles = new ArrayList<Car>();
    vehicles = new ArrayList<SportCar>();
    vehicles = new ArrayList<FamilyCar>();
    //
    cars = new ArrayList<Vehicle>();
    //cars = new ArrayList<SportCar>();
  }
  public void someMethod(List<? extends Car> carList){
    Car car = carList.get(0); //yes
    //carList.add(new Car()); //no
  }

  public void otherMethod(List<? super Car> carList){
    //Car car = carList.get(0); //no
   // carList.add(new Vehicle()); //no
    carList.add(new Car());

  }

}
