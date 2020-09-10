package ru.x5.Structural.Facade;

public class WeddingPlanner {
  private Hall hall;
  private Restaurant restaurant;
  private Photographer photographer;

  public WeddingPlanner() {
    this.hall = new Hall();
    this.restaurant = new Restaurant();
    this.photographer = new Photographer();
  }

  public void organize() {
    hall.book();
    restaurant.orderFood();
    photographer.book();
  }
}
