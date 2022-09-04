package com.lagou.edu.controller;

import com.lagou.edu.pojo.Account;
import com.lagou.edu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    /**
     * Spring容器和SpringMVC容器是有层次的（父子容器）
     * 在 Web 应用中，要让 spring 启动，需要配置监听器 ContextLoaderListener、上下文加载路径 contextConfigLocation
     * Spring容器管理 service对象 + dao对象
     * SpringMVC容器管理 controller对象， 可以引用到Spring容器中的对象
     * 对于 controller 的扫描，必须配置在 springmvc.xml 中。通过 web.xml 中的 DispatcherServlet 去初始化。
     */

    @Autowired
    private AccountService accountService;

    // http://localhost:8080/account/queryAll
    @RequestMapping("/queryAll")
    @ResponseBody
    public List<Account>  queryAll() throws Exception {
        return accountService.queryAccountList();
    }

}
