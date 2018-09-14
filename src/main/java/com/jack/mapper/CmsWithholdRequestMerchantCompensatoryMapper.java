package com.jack.mapper;

import com.jack.entity.CmsWithholdRequestMerchantCompensatory;
import com.jack.entity.CmsWithholdRequestMerchantCompensatoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsWithholdRequestMerchantCompensatoryMapper {
    int countByExample(CmsWithholdRequestMerchantCompensatoryExample example);

    int deleteByExample(CmsWithholdRequestMerchantCompensatoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsWithholdRequestMerchantCompensatory record);

    int insertSelective(CmsWithholdRequestMerchantCompensatory record);

    List<CmsWithholdRequestMerchantCompensatory> selectByExample(CmsWithholdRequestMerchantCompensatoryExample example);

    CmsWithholdRequestMerchantCompensatory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsWithholdRequestMerchantCompensatory record, @Param("example") CmsWithholdRequestMerchantCompensatoryExample example);

    int updateByExample(@Param("record") CmsWithholdRequestMerchantCompensatory record, @Param("example") CmsWithholdRequestMerchantCompensatoryExample example);

    int updateByPrimaryKeySelective(CmsWithholdRequestMerchantCompensatory record);

    int updateByPrimaryKey(CmsWithholdRequestMerchantCompensatory record);
}