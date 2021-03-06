package com.manster.seckill.dao;

import com.manster.seckill.entity.ItemDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Mon May 24 11:07:00 GMT+08:00 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Mon May 24 11:07:00 GMT+08:00 2021
     */
    int insert(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Mon May 24 11:07:00 GMT+08:00 2021
     */
    int insertSelective(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Mon May 24 11:07:00 GMT+08:00 2021
     */
    ItemDO selectByPrimaryKey(Integer id);

    //查询全部item
    List<ItemDO> listItem();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Mon May 24 11:07:00 GMT+08:00 2021
     */
    int updateByPrimaryKeySelective(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Mon May 24 11:07:00 GMT+08:00 2021
     */
    int updateByPrimaryKey(ItemDO record);

    int increaseSales(@Param("id")Integer id, @Param("amount")Integer amount);
}