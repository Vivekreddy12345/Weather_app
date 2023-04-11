package weather;

public class WeatherAPI {
    private String apiKey;

    public WeatherData getWeather1(double latitude, double longitude) {
        // Make API request using apiKey, latitude, and longitude
        // Parse API response into a WeatherData object
        WeatherData weatherData = new WeatherData();
        weatherData.setTemperature(270);
        weatherData.setHumidity(50.0);
        weatherData.setPressure(1112.0);
        return weatherData;
    }

	public WeatherData getWeather(double latitude, double longitude) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	
}

