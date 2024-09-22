package org.example.exchange;

import org.example.model.HttpBinGetResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootTest
@EnableFeignClients(basePackages = "org.example.exchange")
class HttpBinOrgServiceClientTest {
    @Autowired
    HttpBinOrgServiceClient client;

    @Test
    public void getHttpBin() {
        String httpBinGetResponse = client.getString();
        System.out.println(httpBinGetResponse);
//        assert httpBinGetResponse != null;
    }
}
