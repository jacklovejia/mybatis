package com.jack.mapper;

import com.jack.entity.CmsJobControl;
import com.jack.entity.CmsJobControlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsJobControlMapper {
    int countByExample(CmsJobControlExample example);

    int deleteByExample(CmsJobControlExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsJobControl record);

    int insertSelective(CmsJobControl record);

    List<CmsJobControl> selectByExample(CmsJobControlExample example);

    CmsJobControl selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsJobControl record, @Param("example") CmsJobControlExample example);

    int updateByExample(@Param("record") CmsJobControl record, @Param("example") CmsJobControlExample example);

    int updateByPrimaryKeySelective(CmsJobControl record);

    int updateByPrimaryKey(CmsJobControl record);
}