package org.fluegge.ws.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class MyServiceImpl implements MyService {

    @WebMethod
    public String date() {
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.of("Europe/Berlin"));
        return DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(zonedDateTime);
    };

    @WebMethod
    public int add(int a, int b) {
        return a + b;
    }
}