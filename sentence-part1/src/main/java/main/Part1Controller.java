package main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mohamed on 01/07/17.
 */
@RestController
@RequestMapping("sentence")
public class Part1Controller {

    @Value("${part1}")
    private String part1;

    @RequestMapping(value = "/part1",method = RequestMethod.GET)
    public String getPart1(){
        return part1;
    }
}
