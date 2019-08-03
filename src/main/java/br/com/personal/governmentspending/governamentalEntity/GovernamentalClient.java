package br.com.personal.governmentspending.governamentalEntity;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "governamental", url = "${feign.url.governamental}")
public interface GovernamentalClient {

    @RequestMapping(method = RequestMethod.GET)
    List<GovernamentalEntityDTO> get(@RequestParam("pagina") String pagina);

}
