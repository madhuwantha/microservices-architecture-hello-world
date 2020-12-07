package com.equtiem.user.service.impl;

import com.equtiem.user.VO.Department;
import com.equtiem.user.VO.ResponseTemplateVO;
import com.equtiem.user.entity.User;
import com.equtiem.user.repository.UserRepository;
import com.equtiem.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public ResponseTemplateVO getUser(long userId) {

        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findById(userId).get();
        vo.setUser(user);

        Department department = restTemplate
                .getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(), Department.class);

        vo.setDepartment(department);
        return null;
    }
}
