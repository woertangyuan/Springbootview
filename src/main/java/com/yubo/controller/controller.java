package com.yubo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yubo.mapper.UsersMapper;
import com.yubo.pojo.Users;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class controller {
    @Autowired
    private UsersMapper usersMapper;

    public UsersMapper getUsersMapper() {
        return usersMapper;
    }

    public void setUsersMapper(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @RequestMapping("index")
    public String index(HttpServletRequest request,@RequestParam(defaultValue = "1") int pagenum){
        PageHelper.startPage(pagenum,3);
        Users users = new Users();
        List<Users>list = usersMapper.getuck(users);
        PageInfo<Users>pageInfo = new PageInfo<Users>(list);
        request.setAttribute("pageinfo",pageInfo);
        return "index";
    }

}
