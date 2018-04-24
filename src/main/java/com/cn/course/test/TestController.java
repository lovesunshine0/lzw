package com.cn.course.test;

import org.springframework.web.bind.annotation.*;

/**
 * Project_name: lzw
 * Company: gejigang
 * Author: gejigang
 * Date: Created 下午2:13 2018/4/24.
 * Description:
 * Modified By:
 */
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
    public String helloworld3(@RequestParam("para") String abc) {
        return "helloworld3:" + abc;
    }
}
