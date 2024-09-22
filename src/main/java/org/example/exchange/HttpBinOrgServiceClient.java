package org.example.exchange;

import org.example.model.HttpBinGetResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "HttpBinOrgServiceClient", url = "http://httpbin.org")
public interface HttpBinOrgServiceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/get")
    HttpBinGetResponse get();

    @RequestMapping(method = RequestMethod.GET, value = "/get")
    String getString();
}
