package cn.zzh.day01_springboot.controller;

import cn.zzh.day01_springboot.domain.Account;
import cn.zzh.day01_springboot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountContraoller {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<Account> accounts = accountService.findAll();
        ModelAndView mv=new ModelAndView();
        mv.addObject("accounts",accounts);
        mv.setViewName("list");
        return mv;
    }
public
}
