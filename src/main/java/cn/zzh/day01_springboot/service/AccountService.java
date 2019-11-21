package cn.zzh.day01_springboot.service;

import cn.zzh.day01_springboot.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;
public interface AccountService {
    List<Account> findAll();
    void save(Account account);
}
