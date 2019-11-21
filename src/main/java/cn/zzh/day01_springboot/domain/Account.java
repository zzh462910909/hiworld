package cn.zzh.day01_springboot.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

@Data
@TableName(value="account")
public class Account {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String name;
    private Double money;
}
