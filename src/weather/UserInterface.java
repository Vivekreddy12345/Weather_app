package weather;

public class UserInterface {
    private WeatherData displayData;

    public void displayData(WeatherData weatherData) {
        // Display the weather data to the user
        System.out.println("Temperature: " + displayData.getTemperature());
        System.out.println("Humidity: " + displayData.getHumidity());
        System.out.println("Pressure: " + displayData.getPressure());
    }
    public void search(Location city) {
    	System.out.println("Temperature in "+Location.getCity() +"is "+displayData.getTemperature());
    }
}
