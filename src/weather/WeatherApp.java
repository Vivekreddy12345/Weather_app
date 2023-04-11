package weather;

public class WeatherApp {
    private Location location;
    private WeatherData weatherData;

    public void updateWeather() {
        // Get the weather data from the WeatherAPI using the current location
        WeatherAPI weatherAPI = new WeatherAPI();
        weatherData = weatherAPI.getWeather(location.getLatitude(), location.getLongitude());
    }

    public static void main(String[] args) {
        WeatherApp weatherApp = new WeatherApp();
        weatherApp.location = new Location();
        weatherApp.location.setLatitude(37.7749);
        weatherApp.location.setLatitude(-122.4194);
        weatherApp.updateWeather();

        UserInterface userInterface = new UserInterface();
        userInterface.displayData(weatherApp.weatherData);
    }
}
