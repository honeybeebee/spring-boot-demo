package com.xulinfeng.system.service;

import com.xulinfeng.system.dao.entity.Article;
import com.xulinfeng.system.dao.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author linfeng
 * @create 2018-05-02 23:33
 */
@Service
public class ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    public List<Article> queryList(){
        return articleMapper.queryList();
    }


    public int insert(Article article) {
        return articleMapper.insert(article);
    }

}
