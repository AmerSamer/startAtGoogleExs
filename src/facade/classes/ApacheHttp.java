package facade.classes;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApacheHttp {
    public String getRequest() {
        try (final CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet("https://reqres.in/api/users?page=2");
            try (final CloseableHttpResponse response = httpclient.execute(request)) {
                final HttpEntity entity = response.getEntity();
                return EntityUtils.toString(entity);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String postRequest() {
        Map<String, String> object = new HashMap<>();
        object.put("email", "eve.holt@reqres.in");
        object.put("password", "cityslicka");

        try (final CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpPost request = new HttpPost("https://reqres.in/api/login");
            List<NameValuePair> params = new ArrayList<>();
            if (object != null) {
                for (Map.Entry entry : object.entrySet()) {
                    params.add(new BasicNameValuePair(entry.getKey().toString(), entry.getValue().toString()));
                }
            }
            request.setEntity(new UrlEncodedFormEntity(params));
            HttpResponse response = httpclient.execute(request);
            final HttpEntity entity = response.getEntity();
            return EntityUtils.toString(entity);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (ClientProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String putRequest() {
        Map<String, String> object = new HashMap<>();
        object.put("name", "morpheus");
        object.put("job", "zion resident");

        try (final CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpPut request = new HttpPut("https://reqres.in/api/users/2");
            List<NameValuePair> params = new ArrayList<>();
            if (object != null) {
                for (Map.Entry entry : object.entrySet()) {
                    params.add(new BasicNameValuePair(entry.getKey().toString(), entry.getValue().toString()));
                }
            }
            request.setEntity(new UrlEncodedFormEntity(params));
            HttpResponse response = httpclient.execute(request);
            final HttpEntity entity = response.getEntity();
            return EntityUtils.toString(entity);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String patchRequest() {
        Map<String, String> object = new HashMap<>();
        object.put("name", "morpheus");
        object.put("job", "zion resident");

        try (final CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpPatch request = new HttpPatch("https://reqres.in/api/users/2");
            List<NameValuePair> params = new ArrayList<>();
            if (object != null) {
                for (Map.Entry entry : object.entrySet()) {
                    params.add(new BasicNameValuePair(entry.getKey().toString(), entry.getValue().toString()));
                }
            }
            request.setEntity(new UrlEncodedFormEntity(params));
            HttpResponse response = httpclient.execute(request);
            final HttpEntity entity = response.getEntity();
            return EntityUtils.toString(entity);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}