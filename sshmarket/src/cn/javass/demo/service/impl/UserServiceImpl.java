package cn.javass.demo.service.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cn.javass.common.dao.IBaseDao;
import cn.javass.common.pagination.Page;
import cn.javass.common.pagination.PageUtil;
import cn.javass.common.service.impl.BaseService;
import cn.javass.demo.dao.UserDao;
import cn.javass.demo.model.UserModel;
import cn.javass.demo.model.UserQueryModel;
import cn.javass.demo.service.UserService;



@Service("UserService")
public class UserServiceImpl extends BaseService<UserModel, Integer> implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    
    private static volatile int number = 0;

    private UserDao userDao;

    @Autowired
    @Qualifier("UserDao")
    @Override
    public void setBaseDao(IBaseDao<UserModel, Integer> userDao) {
        this.baseDao = userDao;
        this.userDao = (UserDao) userDao;
        logger.info("userDao**********" +number + "="+userDao.getClass().getSimpleName());
        System.err.println("userDao**********" +number + "="+userDao.getClass().getSimpleName());
        
    }
    


    @Override
    public Page<UserModel> query(int pn, int pageSize, UserQueryModel command) {
        return PageUtil.getPage(userDao.countQuery(command) ,pn, userDao.query(pn, pageSize, command), pageSize);
    }

   
}