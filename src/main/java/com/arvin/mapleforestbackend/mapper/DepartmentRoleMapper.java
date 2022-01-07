package com.arvin.mapleforestbackend.mapper;

import com.arvin.mapleforestbackend.POJO.DepartmentRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 部门与角色的关联表
 *
 * @author arvin
 */
@Repository
public interface DepartmentRoleMapper {
    int deleteByPrimaryKey(@Param("departmentId") Long departmentId, @Param("roleId") Long roleId);

    int insert(DepartmentRole record);

    List<DepartmentRole> selectAll();
}