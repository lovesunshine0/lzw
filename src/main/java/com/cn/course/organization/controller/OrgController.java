package com.cn.course.organization.controller;

import com.cn.course.organization.Organization;
import com.cn.course.organization.service.OrgService;
import org.mockito.internal.matchers.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("organization")
public class OrgController {
    @Autowired
    OrgService service;

    @RequestMapping(value = "save",method = RequestMethod.GET)
    public int save(@RequestParam("organization") Organization organization) {
        return service.save(organization);
    }


    @RequestMapping(value = "updatebyid",method = RequestMethod.GET)
    public int update(@RequestParam("organization")Organization organization) {
        return service.update(organization);
    }

    @RequestMapping(value = "findall",method = RequestMethod.GET)
    public List<Organization> findOrg() {
        return service.findOrg();
    }
}
