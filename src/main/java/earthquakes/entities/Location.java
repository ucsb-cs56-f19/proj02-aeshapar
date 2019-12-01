package earthquakes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String placeId;
    private String name;
    private double latitude;
    private double longitude;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPlaceId() { return placeId; }
    public void setPlaceId(String p) { this.placeId = p; }
   
    public String getName() { return name; }
    public void setName(String n) { name = n; }

    public double getLatitude(){ return latitude; }
    public void setLatitude(double l) { latitude = l; }

    public double getLongitude(){ return longitude; }
    public void setLongitude(double lon) { longitude = lon; }

}
