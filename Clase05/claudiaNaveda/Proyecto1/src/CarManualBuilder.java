import Componentes.*;


public class CarManualBuilder implements Builder{

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {

        this.type = type;

    }

    @Override
    public void setSeats(int seats) {

        this.seats = seats;

    }

    @Override
    public void setEngine(Engine engine) {

        this.engine = engine;
    }


    public void setTransmission(Transmission transmission) {

        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {

        this.tripComputer = tripComputer;
    }


    public void setGPSNavigator(GPSNavigator gpsNavigator) {

        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
