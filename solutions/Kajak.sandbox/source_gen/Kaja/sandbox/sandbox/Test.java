package Kaja.sandbox.sandbox;

/*Generated by MPS */

import JavaKaja.runtime.KajaFrame;
import JavaKaja.runtime.Direction;
import JavaKaja.runtime.Vehicle;
import JavaKaja.runtime.Position;
import java.util.List;
import JavaKaja.runtime.Colour;
import java.util.ArrayList;
import java.util.Arrays;
import JavaKaja.runtime.TrafficLightCell;
import JavaKaja.runtime.Orientation;

public class Test extends KajaFrame {
  public Test() {
  }
  protected void perform() {
    buildRoads_from_library_TestRoad_routine();
    // check if starting position is allowed. 
    // check if destination position is allowed. 
    // if so, then create vehicle and add vehicle to cell at starting position 
    if (isAllowedRow(10) && isAllowedCol(1) && isAllowedRow(4) && isAllowedCol(12)) {
      // check if vehicle is drivable here 
      if (world[10][1].isDrivable(Direction.east)) {
        // create a new vehicle 
        Vehicle vehicle = new Vehicle(new Position(10, 1), new Position(4, 12), Direction.east, Direction.south, Direction.east);

        addVehicle(10, 1, vehicle);
        // place vehcile in this starting position 

      }
    }
    // check if starting position is allowed. 
    // check if destination position is allowed. 
    // if so, then create vehicle and add vehicle to cell at starting position 
    if (isAllowedRow(1) && isAllowedCol(11) && isAllowedRow(20) && isAllowedCol(11)) {
      // check if vehicle is drivable here 
      if (world[1][11].isDrivable(Direction.south)) {
        // create a new vehicle 
        Vehicle vehicle = new Vehicle(new Position(1, 11), new Position(20, 11), Direction.south, Direction.south);

        addVehicle(1, 11, vehicle);
        // place vehcile in this starting position 

      }
    }
    // check if starting position is allowed. 
    // check if destination position is allowed. 
    // if so, then create vehicle and add vehicle to cell at starting position 
    if (isAllowedRow(10) && isAllowedCol(9)) {
      // create new traffic light object 
      // create list of colours 
      List<Colour> colours = new ArrayList<Colour>(Arrays.asList(Colour.GREEN, Colour.YELLOW, Colour.RED));
      TrafficLightCell trafficLight = new TrafficLightCell(5, colours, Direction.east, Direction.south, Direction.north);
      addTrafficLight(10, 9, trafficLight);
    }
    // check if starting position is allowed. 
    // check if destination position is allowed. 
    // if so, then create vehicle and add vehicle to cell at starting position 
    if (isAllowedRow(9) && isAllowedCol(11)) {
      // create new traffic light object 
      // create list of colours 
      List<Colour> colours = new ArrayList<Colour>(Arrays.asList(Colour.RED, Colour.GREEN, Colour.YELLOW));
      TrafficLightCell trafficLight = new TrafficLightCell(5, colours, Direction.south, Direction.east, Direction.west);
      addTrafficLight(9, 11, trafficLight);
    }
    int steps = 0;
    while (steps < 30) {
      tick();
      steps++;
    }
    trace("Completed Simulation");
    stop();
  }
  public void buildRoads_from_library_TestRoad_routine() {
    if (isAllowedRow(10) && isAllowedCol(1)) {

      if (Orientation.horizontal == Orientation.vertical) {
        // first check if it is possible to create a road vertically 
        if (isAllowedRow(32) && isAllowedCol(1)) {
          // addRoad(row, column, direction) iterating over the columns 
          for (int i = 0; i < 22; i++) {
            addRoad(10 + i, 1, Direction.east);
          }
        } else {
          reportError("Length exceeds the environment bounds. Vertical");
        }
      } else {
        // first check if it is possible to create a road horizontally 
        if (isAllowedRow(10) && isAllowedCol(23)) {
          // addRoad(row, coloum, direction) iterating over the rows 
          for (int i = 0; i < 22; i++) {
            addRoad(10, 1 + i, Direction.east);
          }
        } else {
          reportError("Length exceeds the environment bounds. Horizontal");
        }
      }
      minipause();
    } else {
      reportError("Attempted to build road outside of the environment!");
    }
    if (isAllowedRow(11) && isAllowedCol(1)) {

      if (Orientation.horizontal == Orientation.vertical) {
        // first check if it is possible to create a road vertically 
        if (isAllowedRow(33) && isAllowedCol(1)) {
          // addRoad(row, column, direction) iterating over the columns 
          for (int i = 0; i < 22; i++) {
            addRoad(11 + i, 1, Direction.west);
          }
        } else {
          reportError("Length exceeds the environment bounds. Vertical");
        }
      } else {
        // first check if it is possible to create a road horizontally 
        if (isAllowedRow(11) && isAllowedCol(23)) {
          // addRoad(row, coloum, direction) iterating over the rows 
          for (int i = 0; i < 22; i++) {
            addRoad(11, 1 + i, Direction.west);
          }
        } else {
          reportError("Length exceeds the environment bounds. Horizontal");
        }
      }
      minipause();
    } else {
      reportError("Attempted to build road outside of the environment!");
    }
    if (isAllowedRow(1) && isAllowedCol(10)) {

      if (Orientation.vertical == Orientation.vertical) {
        // first check if it is possible to create a road vertically 
        if (isAllowedRow(23) && isAllowedCol(10)) {
          // addRoad(row, column, direction) iterating over the columns 
          for (int i = 0; i < 22; i++) {
            addRoad(1 + i, 10, Direction.north);
          }
        } else {
          reportError("Length exceeds the environment bounds. Vertical");
        }
      } else {
        // first check if it is possible to create a road horizontally 
        if (isAllowedRow(1) && isAllowedCol(32)) {
          // addRoad(row, coloum, direction) iterating over the rows 
          for (int i = 0; i < 22; i++) {
            addRoad(1, 10 + i, Direction.north);
          }
        } else {
          reportError("Length exceeds the environment bounds. Horizontal");
        }
      }
      minipause();
    } else {
      reportError("Attempted to build road outside of the environment!");
    }
    if (isAllowedRow(1) && isAllowedCol(11)) {

      if (Orientation.vertical == Orientation.vertical) {
        // first check if it is possible to create a road vertically 
        if (isAllowedRow(23) && isAllowedCol(11)) {
          // addRoad(row, column, direction) iterating over the columns 
          for (int i = 0; i < 22; i++) {
            addRoad(1 + i, 11, Direction.south);
          }
        } else {
          reportError("Length exceeds the environment bounds. Vertical");
        }
      } else {
        // first check if it is possible to create a road horizontally 
        if (isAllowedRow(1) && isAllowedCol(33)) {
          // addRoad(row, coloum, direction) iterating over the rows 
          for (int i = 0; i < 22; i++) {
            addRoad(1, 11 + i, Direction.south);
          }
        } else {
          reportError("Length exceeds the environment bounds. Horizontal");
        }
      }
      minipause();
    } else {
      reportError("Attempted to build road outside of the environment!");
    }
  }
  public static void main(String[] args) {
    Test script = new Test();
    script.initializeComponents();
    script.run();
  }
}
