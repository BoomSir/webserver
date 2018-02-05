package server1;

import javax.jws.WebService;

@WebService
public interface WeatherInterface {
	//根据城市名来查询该城市的天气
	public String queryWeather(String cityName);
}
