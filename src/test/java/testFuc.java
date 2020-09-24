import org.apache.commons.codec.digest.DigestUtils;

public class testFuc {
    public static void main(String[] args){
            String appkey = "appkey12345";
            String seckey = "seckey24689";
            String timeSpan = String.valueOf(System.currentTimeMillis() / 1000);
            System.out.println(timeSpan);
            String[] authentHeaders = new String[] { DigestUtils.md5Hex(appkey.concat(timeSpan).concat(seckey)).toUpperCase(), timeSpan };
             System.out.println(appkey.concat(timeSpan).concat(seckey));
    }
}
