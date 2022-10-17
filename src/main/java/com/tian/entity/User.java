package com.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author tianwc  公众号：java后端技术全栈、面试专栏
 * @version 1.0.0
 * @description 实体类和数据库表对应
 * @createTime 2022年10月16日 22:49
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Accessors(chain = true)
public class User {
    /**
     * 如果使用了数据库自增，这里必须写上这个注解，否则会抛出异常java.lang.IllegalArgumentException: argument type mismatch
     * 如果此处什么也不写默认就是这样，使用雪花算法策略 生成出来的是String类型，但是我们数据库使用的int类型
     * 所以，会出现参数不匹配异常
     */
    @TableId(type = IdType.AUTO)
    private String id;
    private String name;
    private String pwd;
    private Date birthday;
    private String phone;
}
