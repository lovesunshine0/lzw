package com.cn.course.serialnum.service;

import com.cn.course.serialnum.Serialnum;
import com.cn.course.serialnum.SerialnumExample;
import com.cn.course.serialnum.dao.SerialnumMapper;
import com.cn.course.util.TimeUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SerialNumService {

    public static final String userKey = "userinfo";
    public static final String studentKey = "student";
    public static final String teacherKey = "teacher";


    @Resource
    SerialnumMapper serialnumMapper;

    public int getNextNum(String str) {
        SerialnumExample serialnumExample = new SerialnumExample();
        serialnumExample.createCriteria().andTypeEqualTo(str);
        List<Serialnum> list = serialnumMapper.selectByExample(serialnumExample);
        int rtn = 0;
        if (list == null || list.isEmpty()) {
            Serialnum serialnum = new Serialnum();
            serialnum.setNum(1);
            serialnum.setType(str);
            serialnum.setTimestamp(TimeUtil.currentTimeStr());
            serialnumMapper.insert(serialnum);
            rtn = 1;
        } else {
            Serialnum serialnum = list.get(0);
            rtn = serialnum.getNum();
            serialnum.setNum(rtn + 1);
            serialnum.setTimestamp(TimeUtil.currentTimeStr());
            serialnumExample.createCriteria().andTimestampEqualTo(serialnum.getTimestamp());
            int a =serialnumMapper.updateByExample(serialnum, serialnumExample);
            if(a==0){
                rtn = getNextNum(str);
            }else if(a>1){
                throw new RuntimeException("生成系统 "+str +" 编码异常,请联系管理员！！");

            }
        }
        return rtn;
    }

    public String getNextCode(String str) {
        int c = getNextNum(str);
        return String.format("%06d", c);
    }

    public static void main(String[] args){
        System.out.println(String.format("%06d", 123456789));
    }
}
