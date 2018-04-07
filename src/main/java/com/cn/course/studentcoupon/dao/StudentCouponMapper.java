package com.cn.course.studentcoupon.dao;

import com.cn.course.studentcoupon.StudentCoupon;
import com.cn.course.studentcoupon.StudentCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentCouponMapper {
    long countByExample(StudentCouponExample example);

    int deleteByExample(StudentCouponExample example);

    int insert(StudentCoupon record);

    int insertSelective(StudentCoupon record);

    List<StudentCoupon> selectByExample(StudentCouponExample example);

    int updateByExampleSelective(@Param("record") StudentCoupon record, @Param("example") StudentCouponExample example);

    int updateByExample(@Param("record") StudentCoupon record, @Param("example") StudentCouponExample example);
}