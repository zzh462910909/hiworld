package cn.zzh.day01_springboot.dao;

import cn.zzh.day01_springboot.domain.Account;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("accountDao")
public interface AccountDao extends BaseMapper<Account> {
    @Select("select * from account")
    List<Account> findAll();
}
