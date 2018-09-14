package com.jack.mapper;

import com.jack.entity.CmsApi;
import com.jack.entity.CmsApiExample;
import com.jack.entity.CmsApiWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsApiMapper {
    int countByExample(CmsApiExample example);

    int deleteByExample(CmsApiExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsApiWithBLOBs record);

    int insertSelective(CmsApiWithBLOBs record);

    List<CmsApiWithBLOBs> selectByExampleWithBLOBs(CmsApiExample example);

    List<CmsApi> selectByExample(CmsApiExample example);

    CmsApiWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsApiWithBLOBs record, @Param("example") CmsApiExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsApiWithBLOBs record, @Param("example") CmsApiExample example);

    int updateByExample(@Param("record") CmsApi record, @Param("example") CmsApiExample example);

    int updateByPrimaryKeySelective(CmsApiWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CmsApiWithBLOBs record);

    int updateByPrimaryKey(CmsApi record);
}