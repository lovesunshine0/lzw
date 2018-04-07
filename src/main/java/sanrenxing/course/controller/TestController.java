package sanrenxing.course.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "test")
public class TestController {

    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String helloworld() {
        return "helloworlddsd";
    }

    @RequestMapping(value = "/helloworld2/{abc}", method = RequestMethod.GET)
    public String helloworld2(@PathVariable String abc) {
        return "helloworld2:" + abc;
    }

    @RequestMapping(value = "/helloworld3", method = RequestMethod.GET)
    public String helloworld3(@RequestParam String abc) {
        return "helloworld3:" + abc;
    }
}
