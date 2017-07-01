package main;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by mohamed on 01/07/17.
 */
@FeignClient("sentence-part2")
public interface Part2ServiceCaller {

    @RequestMapping(value = "sentence/part2",method = RequestMethod.GET)
    String getPart2();

}
