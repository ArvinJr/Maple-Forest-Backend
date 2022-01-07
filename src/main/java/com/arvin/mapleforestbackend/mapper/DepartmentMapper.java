package com.arvin.mapleforestbackend.mapper;

import com.arvin.mapleforestbackend.POJO.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 部门信息表
 *
 * @author arvin
 */
@Repository
public interface DepartmentMapper {
    int deleteByPrimaryKey(Long departmentId);

    int insert(Department record);

    Department selectByPrimaryKey(Long departmentId);

    List<Department> selectAll();

    int updateByPrimaryKey(Department record);
}