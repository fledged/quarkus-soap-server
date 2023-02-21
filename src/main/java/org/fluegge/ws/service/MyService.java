package org.fluegge.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface MyService {

    @WebMethod
    String date();

    @WebMethod
    int add(int a, int b);
}