package com.cn.course.organization.service;

import com.cn.course.organization.Organization;
import com.cn.course.organization.OrganizationExample;
import com.cn.course.organization.dao.OrganizationMapper;
import com.cn.course.util.TimeUtil;
import org.mockito.internal.matchers.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrgService {
    @Resource
    OrganizationMapper mapper;
    public int save(Organization organization){
        organization.setTimestamp(TimeUtil.currentTimeStr());
        organization.setIsvalid(0);
        return mapper.insertSelective(organization);
    }
    public int update(Organization organization){
        return mapper.updateByPrimaryKey(organization);
    }
    public List<Organization> findOrg(){
        return mapper.selectByExample(null);
    }
    public List<Organization> findOrgByids(List<Integer> orgids){
        OrganizationExample example=new OrganizationExample();
        OrganizationExample.Criteria criteria=example.createCriteria();
        criteria.andIdIn(orgids);
        return mapper.selectByExample(example);
    }

}
