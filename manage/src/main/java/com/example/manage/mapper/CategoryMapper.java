package com.example.manage.mapper;

import com.example.manage.domain.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CategoryMapper {


//    @Select("select * from tb_category;")
//    List<Category> getAllCategory();

//    @Select("select * from tb_category where parent_id = #{pid};")
    List<Category> getCategoryByPid(Integer pid);

    Boolean hasExistSubCategoryByPid(Integer pid);
}
