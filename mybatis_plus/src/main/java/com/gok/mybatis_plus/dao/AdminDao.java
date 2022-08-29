package com.gok.mybatis_plus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gok.mybatis_plus.domain.Admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminDao extends BaseMapper<Admin> {

    @Insert("insert into admin(admin_name,admin_passowrd) values(#{adminName},#{adminPassword}) ")
    int insert(Admin admin);

}

