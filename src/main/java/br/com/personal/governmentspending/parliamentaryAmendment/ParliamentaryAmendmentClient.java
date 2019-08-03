package br.com.personal.governmentspending.parliamentaryAmendment;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "parliamentary", url = "${feign.url.parliamentary}")
public interface ParliamentaryAmendmentClient {

    @RequestMapping(method = RequestMethod.GET)
    List<ParliamentaryAmendmentDTO> get(@RequestParam("pagina") String pagina);

}
