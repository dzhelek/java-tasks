package lab8;

import java.util.ArrayList;
import java.util.List;

public class Building {
    static class Apartment {
        int number, floor;

        Apartment(int number, int floor) {
            this.number = number;
            this.floor = floor;
        }
    }

    List<Apartment> apartments = new ArrayList<>();

    void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    void getApartmentInfo(int number) {
        for (Apartment apartment : apartments) {
            if (apartment.number == number) {
                System.out.println(apartment.floor);
                break;
            }
        }
    }
    public static void main(String[] args) {
        var building = new Building();
        building.addApartment(new Building.Apartment(101, 3));
        building.getApartmentInfo(101);
    }
}
