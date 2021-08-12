package com.acprojects.requestheaderparser.service;

import javax.servlet.http.HttpServletRequest;

import com.acprojects.requestheaderparser.model.RequestHeaderParser;

import org.springframework.stereotype.Service;

@Service
public class RequestHeaderParserServiceImpl implements RequestHeaderParserService {


    @Override
    public RequestHeaderParser getHeaderData(HttpServletRequest request) {
        // String ipAddress = request.getLocalAddr();
        String ipAddress = request.getRemoteAddr();
        // String ipAddress = request.getHeader("X-Forwarded-For");
        String lang = request.getHeader("Accept-Language");
        String soft = request.getHeader("User-Agent");

        return new RequestHeaderParser(ipAddress, lang, soft);
    }
    
}
