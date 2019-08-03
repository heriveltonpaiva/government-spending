package br.com.personal.governmentspending.parliamentaryAmendment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/parliamentary")
public class ParliamentaryAmendmentResource {

    @Autowired
    private ParliamentaryAmendmentClient client;

    @GetMapping
    public List<ParliamentaryAmendmentDTO> get(@RequestParam("page") String page) {
        return client.get(page);
    }
}
