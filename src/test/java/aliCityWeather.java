import com.aliyun.api.gateway.demo.util.HttpUtils;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

public class aliCityWeather {
    public static void main(String[] args) {
        String host = "https://iweather.market.alicloudapi.com";
        String path = "/address";
        String method = "GET";
        String appcode = "0a419fea4f0b4a5c887de2753f249b1d";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("area", "西湖");
        querys.put("city", "杭州");
        querys.put("needday", "1");
        querys.put("prov", "浙江");

        try {
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            System.out.println(response.toString());
            //获取response的body
            System.out.println(EntityUtils.toString(response.getEntity()));



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
