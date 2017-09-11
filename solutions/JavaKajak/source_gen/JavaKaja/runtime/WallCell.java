package JavaKaja.runtime;

/*Generated by MPS */

import java.awt.Color;

public class WallCell extends Cell {
  private static final Color WALLCOLOUR = Color.LIGHT_GRAY;

  public WallCell() {
    super(Direction.noDirection);
    this.vehicle = null;
  }

  @Override
  public void setVehicle(Vehicle vehicle) {
    throw new RuntimeException("Vehicles cannot drive in wall");
  }

  @Override
  public boolean isDrivable(Direction direction) {
    return false;
  }

  @Override
  public void addDirection(Direction direction) {
    throw new RuntimeException("Cannot build road onto a wall");
  }

  @Override
  public void tickVehicle() {
    throw new RuntimeException("No vehicles to update");
  }

  @Override
  public Color getColor() {
    return WALLCOLOUR;
  }
}
