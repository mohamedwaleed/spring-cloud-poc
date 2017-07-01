package main;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mohamed on 01/07/17.
 */
@RestController
@RequestMapping("/sentence")
public class SentenceController {

    @Autowired
    private Part1ServiceCaller part1ServiceCaller;

    @Autowired
    private Part2ServiceCaller part2ServiceCaller;

    @RequestMapping(method = RequestMethod.GET)
    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "30000")})
    public String getSentence() {
        String part1 = part1ServiceCaller.getPart1();
        String part2 = part2ServiceCaller.getPart2();
        return part1 + " " + part2;
    }
}
