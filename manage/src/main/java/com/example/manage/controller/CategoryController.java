package com.example.manage.controller;


import com.example.manage.domain.Category;
import com.example.manage.service.CategoryService;
import com.example.manage.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "goods_manage")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /*
    *  根据pid获取分类列表
    * */
    @GetMapping("category")
    ResultVo<?> category(@RequestParam(value = "pid", defaultValue = "0") Integer pid) {
        List<Category> list = categoryService.getCategoryByPid(pid);
        System.out.println(list);
        if (CollectionUtils.isEmpty(list)) {
            return ResultVo.info(null, 1001, "数据为空");
        } else {
            return ResultVo.success(list);
        }
    }
}
