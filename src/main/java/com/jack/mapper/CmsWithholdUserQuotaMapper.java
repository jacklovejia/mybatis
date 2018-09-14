package com.jack.mapper;

import com.jack.entity.CmsWithholdUserQuota;
import com.jack.entity.CmsWithholdUserQuotaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsWithholdUserQuotaMapper {
    int countByExample(CmsWithholdUserQuotaExample example);

    int deleteByExample(CmsWithholdUserQuotaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsWithholdUserQuota record);

    int insertSelective(CmsWithholdUserQuota record);

    List<CmsWithholdUserQuota> selectByExample(CmsWithholdUserQuotaExample example);

    CmsWithholdUserQuota selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsWithholdUserQuota record, @Param("example") CmsWithholdUserQuotaExample example);

    int updateByExample(@Param("record") CmsWithholdUserQuota record, @Param("example") CmsWithholdUserQuotaExample example);

    int updateByPrimaryKeySelective(CmsWithholdUserQuota record);

    int updateByPrimaryKey(CmsWithholdUserQuota record);
}