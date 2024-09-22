package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashMap;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HttpBinGetResponse {
    private String origin;
    private String url;
    private HashMap<String, String> headers;
    private HashMap<String, String> args;
}
