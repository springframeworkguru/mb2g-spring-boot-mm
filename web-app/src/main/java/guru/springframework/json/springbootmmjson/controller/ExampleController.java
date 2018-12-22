package guru.springframework.json.springbootmmjson.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import guru.springframework.json.model.ShippingAddress;

/**
 * Created by jt on 2018-12-22.
 */
@RestController
public class ExampleController {

    @RequestMapping("/")
    public ShippingAddress getShippingAddress() {

        return new ShippingAddress();
    }
}
