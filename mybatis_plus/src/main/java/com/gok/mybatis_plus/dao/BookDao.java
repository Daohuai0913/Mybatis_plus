package com.gok.mybatis_plus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gok.mybatis_plus.domain.Book;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface BookDao extends BaseMapper<Book> {

}

