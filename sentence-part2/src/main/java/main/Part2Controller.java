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
public class Part2Controller {

    @Value("${part2}")
    private String part2;

    @RequestMapping(value = "/part2",method = RequestMethod.GET)
    public String getPart2(){
        return part2;
    }
}
