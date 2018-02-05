package server1;

import javax.jws.WebService;

@WebService
public class WeatherInterfaceImpl implements WeatherInterface {

	@Override
	public String queryWeather(String cityName) {
		if(cityName.equals("北京")) {
			return "雾霾";
		}else {
			return "晴朗";
		}
	}
}
