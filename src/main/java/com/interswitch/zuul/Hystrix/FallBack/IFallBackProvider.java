package com.interswitch.zuul.Hystrix.FallBack;

import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;

public interface IFallBackProvider {

    public String getRoute();

    public ClientHttpResponse fallbackResponse(String route, final Throwable cause);

}
