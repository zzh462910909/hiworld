package cn.zzh.day01_springboot.service;

import cn.zzh.day01_springboot.dao.AccountDao;
import cn.zzh.day01_springboot.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        List<Account> accounts = accountDao.findAll();
        return accounts;
    }

    @Override
    public void save(Account account) {
        accountDao.insert(account);
    }
}
