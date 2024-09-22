package org.example.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.exchange.HttpBinOrgServiceClient;
import org.example.model.HttpBinGetResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductControllerImpl implements IProductController {
    private final HttpBinOrgServiceClient client;

    @Override
    @GetMapping("/get")
    public String get() {
        HttpBinGetResponse string = client.get();
        return string.toString();
    }

    @Override
    @GetMapping("/getProduct")
    public String getProduct() {
        String string = client.getString();
        return string;
    }
}
