package com.example.manage.domain;

public class Category {

    private Integer id;

    private String name;

    // 父目录id
    private Integer parentId;

    // 是否是第一层目录
    private Boolean whetherParent;

    // 当前目录序号
    private Integer sort;

    // 是否有子目录
    private Boolean leaf;

    public Boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Boolean getWhetherParent() {
        return whetherParent;
    }

    public void setWhetherParent(Boolean whetherParent) {
        this.whetherParent = whetherParent;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", whetherParent=" + whetherParent +
                ", sort=" + sort +
                ", leaf=" + leaf +
                '}';
    }
}
