package com.feign.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "agenda",url="http://localhost:3000/contato")
public interface ConsumindoApi {

    @RequestMapping(method= RequestMethod.GET, value = "/")
    Contato retornaContato();
}
