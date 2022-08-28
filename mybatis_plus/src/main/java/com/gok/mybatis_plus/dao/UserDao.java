package com.gok.mybatis_plus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gok.mybatis_plus.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author huai
 * @date 2022/8/22
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}


