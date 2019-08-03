package br.com.personal.governmentspending.governamentalEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/governamental")
public class GovernamentalEntityResource{

    @Autowired
    private GovernamentalClient client;

    @GetMapping
    public List<GovernamentalEntityDTO> get(@RequestParam("page") String page) {
        final var listAll = new ArrayList<GovernamentalEntityDTO>();
        for (int i = 1; i < 10; i++) {
            listAll.addAll(client.get(String.valueOf(i)));
        }
        return listAll;
    }
}
