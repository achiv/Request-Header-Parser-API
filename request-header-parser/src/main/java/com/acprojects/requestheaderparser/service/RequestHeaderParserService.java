package com.acprojects.requestheaderparser.service;

import javax.servlet.http.HttpServletRequest;

import com.acprojects.requestheaderparser.model.RequestHeaderParser;

public interface RequestHeaderParserService {

    RequestHeaderParser getHeaderData(HttpServletRequest request);
    
}
