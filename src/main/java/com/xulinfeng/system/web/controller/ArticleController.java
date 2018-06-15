package com.xulinfeng.system.web.controller;

import com.xulinfeng.system.dao.entity.Article;
import com.xulinfeng.system.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author linfeng
 * @create 2018-05-02 23:44
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/queryList")
    public List<Article> queryList(){
        return articleService.queryList();
    }

    @RequestMapping(value = "/save")
    public Article save(Article article) {
        articleService.insert(article);
        return article;
    }
}
