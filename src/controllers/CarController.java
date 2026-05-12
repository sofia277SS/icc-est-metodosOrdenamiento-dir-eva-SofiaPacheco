package controllers;

import models.Car;

public class CarController {

  public void sortByName(Car[] cars) {
    for (int i = 0; i < cars.length - 1; i++) {
      Car aux = cars[i];
      int j = i - 1;
      while (j >= 0 && cars[j].getName().compareToIgnoreCase(aux.getName()) > 0) {
        cars[j + 1] = cars[j];
        j--;
      }
      cars[j + 1] = aux;
    }

  }

}
