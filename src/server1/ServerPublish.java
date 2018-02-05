package server1;

import javax.xml.ws.Endpoint;

/*
 * 发布服务
 */
public class ServerPublish {
	/*
	 * Endpoint发布服务
	 */
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:8088/weather", new WeatherInterfaceImpl());
		System.out.println("服务发布成功");
	}
}
