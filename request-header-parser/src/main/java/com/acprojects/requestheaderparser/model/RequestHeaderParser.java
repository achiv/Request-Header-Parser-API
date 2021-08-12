package com.acprojects.requestheaderparser.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestHeaderParser {

    private String ipaddress;
    private String language;
    private String software;
    
}
