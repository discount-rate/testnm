package com.smart.tx.mapper;

import com.smart.tx.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * 返回的值  一般entity
 * 传入的参数   entity对象
 */
public interface UserMapper {
    int insert(@Param("user") User user);
    User selectById(@Param("uid") int uid);
    int update(@Param("user") User user);

}
