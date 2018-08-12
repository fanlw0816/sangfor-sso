package com.sangfor.base.core.token.manager;

import com.sangfor.base.common.utils.SpringContextUtil;
import com.sangfor.base.config.shiro.MyRealm;
import com.sangfor.base.entity.User;
import org.apache.shiro.SecurityUtils;

public class TokenManager {

    //用户登录管理
   // public static final MyRealm realm = SpringContextUtil.getBean("myRealm",MyRealm.class);
    //用户session管理
    //public static final ShiroSessionRepository ShiroSessionRepository = SpringContextUtil.getBean("customSessionManager",CustomSessionManager.class);
    /**
     * 获取当前登录的用户User对象
     * @return
     */
    public static User getToken(){
        User token = (User) SecurityUtils.getSubject().getPrincipal();
        return token ;
    }
}
