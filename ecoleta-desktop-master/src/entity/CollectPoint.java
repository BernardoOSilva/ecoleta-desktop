package entity;

import java.util.UUID;

public class CollectPoint {

    private UUID id;
    private final String name;
    private final String email;
    private final String city;
    private final String typeOfWaste;
    private final Double latitude;
    private final Double longitude;

    public CollectPoint(String name, String email, String city, String typeOfWaste, Double latitude, Double longitude) {

        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.city = city;
        this.typeOfWaste = typeOfWaste;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getTypeOfWaste() {
        return typeOfWaste;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitute() {
        return longitude;
    }
}
