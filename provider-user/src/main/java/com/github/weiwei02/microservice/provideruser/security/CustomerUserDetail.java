package com.github.weiwei02.microservice.provideruser.security;

import com.github.weiwei02.microservice.provideruser.model.User;
import com.github.weiwei02.microservice.provideruser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author Wang Weiwei <email>weiwei02@vip.qq.com / weiwei.wang@100credit.com</email>
 * @version 1.0
 * @sine 2017/9/13
 */
@Service
public class CustomerUserDetail implements UserDetailsService {
    @Autowired
    UserService userService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User myuser = userService.selectByName(username);
        org.springframework.security.core.userdetails.User user = new  org.springframework.security.core.userdetails.User();
        return userService.selectByName(username);
    }
}
