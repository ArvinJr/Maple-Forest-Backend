package com.arvin.mapleforestbackend.mapper;

import com.arvin.mapleforestbackend.POJO.UserDepartment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户与部门的关联表
 *
 * @author arvin
 */
@Repository
public interface UserDepartmentMapper {
    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("deparmentId") Long deparmentId);

    int insert(UserDepartment record);

    List<UserDepartment> selectAll();
}