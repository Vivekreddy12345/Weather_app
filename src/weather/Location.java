package weather;

public class Location {
    private double latitude;
    private double longitude;
    private static String city;
    private String country;

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

	public static String getCity() {
		return city;
	}

	public void setCity(String city) {
		Location.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setLatitude(double d) {
		// TODO Auto-generated method stub
		
	}
}
