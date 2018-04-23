package com.cn.course.bill.service;

import com.cn.course.bill.Bill;
import com.cn.course.bill.BillExample;
import com.cn.course.bill.dao.BillMapper;
import com.cn.course.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Project_name: lzw
 * Company: gejigang
 * Author: gejigang
 * Date: Created 下午2:47 2018/4/23.
 * Description:
 * Modified By:
 */
@Service
public class BillService {

    @Autowired
    BillMapper billMapper;

    public int saveBill(Bill bill, Integer userid) {
        bill.setCreatetime(new Date());
        bill.setTimestamp(TimeUtil.currentTimeStr());
        bill.setIsvalid(0);
        bill.setUserid(userid);
        return billMapper.insertSelective(bill);
    }

    public int updateBill(Bill bill, Integer userid) {
        BillExample billExample = new BillExample();
        BillExample.Criteria c = billExample.createCriteria();
        c.andIdEqualTo(bill.getId());
        c.andTimestampEqualTo(bill.getTimestamp());
        c.andIsvalidEqualTo(0);
        bill.setTimestamp(TimeUtil.currentTimeStr());
        bill.setUpdatetime(new Date());
        bill.setUserid(userid);
        return billMapper.updateByExampleSelective(bill, billExample);
    }


    public Bill findBill(Integer id) {
        return billMapper.selectByPrimaryKey(id);
    }

    public List<Bill> findBillByUser(Integer userid) {
        BillExample billExample = new BillExample();
        BillExample.Criteria c = billExample.createCriteria();
        c.andUseridEqualTo(userid);
        c.andIsvalidEqualTo(0);
        return billMapper.selectByExample(billExample);
    }

    public List<Bill> findBillByCourse(Integer courseid) {
        BillExample billExample = new BillExample();
        BillExample.Criteria c = billExample.createCriteria();
        c.andCourseidEqualTo(courseid);
        c.andIsvalidEqualTo(0);
        return billMapper.selectByExample(billExample);
    }

    /**
     * @param id
     * @param userid
     */
    public void delBill(Integer id, Integer userid) {
        Bill bill = this.findBill(id);
        bill.setIsvalid(1);
        bill.setTimestamp(TimeUtil.currentTimeStr());
        bill.setUpdatetime(new Date());
        bill.setUserid(userid);

        BillExample billExample = new BillExample();
        BillExample.Criteria c = billExample.createCriteria();
        c.andIdEqualTo(bill.getId());
        c.andTimestampEqualTo(bill.getTimestamp());
        c.andIsvalidEqualTo(0);
        billMapper.updateByExampleSelective(bill, billExample);
    }

}
