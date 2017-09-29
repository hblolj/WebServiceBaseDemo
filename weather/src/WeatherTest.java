import client.ArrayOfString;
import client.WeatherWS;
import client.WeatherWSSoap;

public class WeatherTest {
    public static void main(String[] args) {
        WeatherWS weatherWS = new WeatherWS();
        WeatherWSSoap soap = weatherWS.getWeatherWSSoap();
        ArrayOfString s = soap.getWeather("宁波", null);
        s.getString().stream().forEach(System.out::println);
    }
}
