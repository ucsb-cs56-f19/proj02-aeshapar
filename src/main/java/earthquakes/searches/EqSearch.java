package earthquakes.searches;

public class EqSearch{
	private int distance;
	private int minmag;
	private double lat;
	private double lon;
	private String location; 

	public int getDistance(){
		return distance;
	}
	public int getMinmag(){
		return minmag;
	}
	public double getLat(){
		return lat;
	}
	public double getLon(){
		return lon;
	}
	public String getLocation(){
		return location;
	}

	public void setDistance(int dist){
		distance = dist;
	}
	public void setMinmag(int mag){
		minmag = mag;
	}
	public void setLat(double latitude){
		lat = latitude;
	}
	public void setLon(double longitude){
		lon = longitude;
	}
	public void setLocation(String loc){
		location = loc;
	}
}
