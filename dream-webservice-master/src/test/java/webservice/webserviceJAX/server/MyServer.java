package webservice.webserviceJAX.server;

import javax.xml.ws.Endpoint;

/**
 * Created by DuLida on 2016/11/14.
 * 1.创建接口
 * 2.创建实现累
 * 3.开启服务
 */
public class MyServer {
    public static void main(String args[]) {
        String address = "http://localhost:8888/ms";
        Endpoint.publish(address, new MyWebserviceImpl());
    }
}
