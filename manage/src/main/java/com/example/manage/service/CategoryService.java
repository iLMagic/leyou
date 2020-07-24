package com.example.manage.service;

import com.example.manage.domain.Category;
import com.example.manage.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryService {

    @Resource
    private CategoryMapper categoryMapper;


    public List<Category> getCategoryByPid(Integer pid) {
        List<Category> categorys = categoryMapper.getCategoryByPid(pid);
        categorys.forEach(category -> {
            final Integer id = category.getId();
            Boolean hasSub = categoryMapper.hasExistSubCategoryByPid(id);
            category.setLeaf(!hasSub);
//            System.out.println(hasSub);
        });
        return  categorys;
    }

}
