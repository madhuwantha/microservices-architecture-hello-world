package com.equtiem.user.service;

import com.equtiem.user.VO.ResponseTemplateVO;
import com.equtiem.user.entity.User;

public interface UserService
{
    User saveUser(User user);
    ResponseTemplateVO getUser(long userId);
}
