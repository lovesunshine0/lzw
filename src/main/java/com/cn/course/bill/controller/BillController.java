package com.cn.course.bill.controller;

import com.cn.course.bill.Bill;
import com.cn.course.bill.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Project_name: lzw
 * Company: gejigang
 * Author: gejigang
 * Date: Created 下午2:47 2018/4/23.
 * Description:
 * Modified By:
 */
@RestController
@RequestMapping(value = "/bill")
public class BillController {
    @Autowired
    BillService billService;

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public int saveBill(@RequestParam(value = "bill") Bill bill, @RequestAttribute(value = "userid") Integer userid) {
        return billService.saveBill(bill, userid);
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public int updateBill(@RequestParam(value = "bill") Bill bill, @RequestAttribute(value = "userid") Integer userid) {
        return billService.updateBill(bill, userid);
    }

    @RequestMapping(value = "/findBillbyUser")
    public List<Bill> findBill(@RequestAttribute(value = "userid") Integer userid) {
        return billService.findBillByUser(userid);
    }

    @RequestMapping(value = "/findBillbyCourse")
    public List<Bill> findBillByCourse(@RequestParam(value = "course") Integer course) {
        return billService.findBillByUser(course);
    }

    @RequestMapping(value = "/findBillbyId")
    public Bill findBillById(@RequestParam(value = "id") Integer id) {
        return billService.findBill(id);
    }

    @RequestMapping(value = "/delBillbyId")
    public void delBillById(@RequestParam(value = "id") Integer id, @RequestAttribute(value = "userid") Integer userid) {
        billService.delBill(id, userid);
    }

}
