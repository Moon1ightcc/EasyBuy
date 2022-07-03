package com.easybuy.service.impl;

import com.easybuy.dao.TUsersMapper;
import com.easybuy.entity.TUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TuserServiceImpl{
    @Autowired
     private TUsersMapper usersDao;

    @Transactional(readOnly = true)
    public TUsers doLogin(String usern, String passwd) {
        return  usersDao.login(usern,passwd);
    }

    @Transactional
    public void registerUser(TUsers users) {
        usersDao.insert_user(users);
    }
}
