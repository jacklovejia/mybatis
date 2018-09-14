package com.jack.mapper;

import com.jack.entity.SysRolePerm;
import com.jack.entity.SysRolePermExample;
import com.jack.entity.SysRolePermKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRolePermMapper {
    int countByExample(SysRolePermExample example);

    int deleteByExample(SysRolePermExample example);

    int deleteByPrimaryKey(SysRolePermKey key);

    int insert(SysRolePerm record);

    int insertSelective(SysRolePerm record);

    List<SysRolePerm> selectByExample(SysRolePermExample example);

    SysRolePerm selectByPrimaryKey(SysRolePermKey key);

    int updateByExampleSelective(@Param("record") SysRolePerm record, @Param("example") SysRolePermExample example);

    int updateByExample(@Param("record") SysRolePerm record, @Param("example") SysRolePermExample example);

    int updateByPrimaryKeySelective(SysRolePerm record);

    int updateByPrimaryKey(SysRolePerm record);
}