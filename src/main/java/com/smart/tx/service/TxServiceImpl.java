package com.smart.tx.service;

import com.smart.tx.entity.User;

import com.smart.tx.mapper.UserMapper;
import com.smart.tx.service.TxService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 *
 */
@Service
public class TxServiceImpl implements TxService {
    @Resource
    UserMapper userMapper;

    //  100百万条
    @Override
    @Transactional
    public String helloTx(User user) {
        int insert = userMapper.insert(user);
        user.setPassword("123445");
        userMapper.update(user);
        return "";
    }

    @Override
    public String helloTx1() {
        return null;
    }
}
