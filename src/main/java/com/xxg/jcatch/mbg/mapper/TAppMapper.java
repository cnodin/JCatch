package com.xxg.jcatch.mbg.mapper;

import com.xxg.jcatch.mbg.bean.TApp;
import com.xxg.jcatch.mbg.bean.TAppExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAppMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_app
     *
     * @mbg.generated
     */
    long countByExample(TAppExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_app
     *
     * @mbg.generated
     */
    int deleteByExample(TAppExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_app
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_app
     *
     * @mbg.generated
     */
    int insert(TApp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_app
     *
     * @mbg.generated
     */
    int insertSelective(TApp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_app
     *
     * @mbg.generated
     */
    List<TApp> selectByExample(TAppExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_app
     *
     * @mbg.generated
     */
    TApp selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_app
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TApp record, @Param("example") TAppExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_app
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TApp record, @Param("example") TAppExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_app
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TApp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_app
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TApp record);
}