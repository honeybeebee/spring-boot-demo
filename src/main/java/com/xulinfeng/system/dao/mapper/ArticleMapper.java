package com.xulinfeng.system.dao.mapper;

import com.xulinfeng.system.dao.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author linfeng
 * @create 2018-05-02 23:23
 */
@Mapper
@Component
public interface ArticleMapper {
    List<Article> queryList();

    int insert(Article article);
}
