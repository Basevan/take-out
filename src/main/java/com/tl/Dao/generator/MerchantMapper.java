package com.tl.dao.generator;

import com.tl.model.Merchant;
import com.tl.model.MerchantCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerchantMapper {
    long countByExample(MerchantCriteria example);

    int deleteByExample(MerchantCriteria example);

    int deleteByPrimaryKey(Integer merchantId);

    int insert(Merchant record);

    int insertSelective(Merchant record);

    List<Merchant> selectByExample(MerchantCriteria example);

    Merchant selectByPrimaryKey(Integer merchantId);

    int updateByExampleSelective(@Param("record") Merchant record, @Param("example") MerchantCriteria example);

    int updateByExample(@Param("record") Merchant record, @Param("example") MerchantCriteria example);

    int updateByPrimaryKeySelective(Merchant record);

    int updateByPrimaryKey(Merchant record);
}