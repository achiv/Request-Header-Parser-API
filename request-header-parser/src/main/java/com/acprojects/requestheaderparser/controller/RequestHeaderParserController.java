package com.acprojects.requestheaderparser.controller;

import javax.servlet.http.HttpServletRequest;

import com.acprojects.requestheaderparser.model.RequestHeaderParser;
import com.acprojects.requestheaderparser.service.RequestHeaderParserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestHeaderParserController {
    
    @Autowired
    private RequestHeaderParserService requestHeaderParserService;

    private final Logger LOGGER = LoggerFactory.getLogger(RequestHeaderParserController.class);

    @GetMapping("/api/whoami")
    public RequestHeaderParser getHeaders(HttpServletRequest request){
        LOGGER.info("Inside getHeaders() function");
        return requestHeaderParserService.getHeaderData(request);
    }

}
