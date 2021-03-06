package com.website.batch.mapper;

import com.website.batch.entity.NetEaseSongDetail;
import com.website.batch.entity.NetEaseSongDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface NetEaseSongDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_DETAIL
     *
     * @mbg.generated
     */
    long countByExample(NetEaseSongDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_DETAIL
     *
     * @mbg.generated
     */
    int deleteByExample(NetEaseSongDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_DETAIL
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_DETAIL
     *
     * @mbg.generated
     */
    int insert(NetEaseSongDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_DETAIL
     *
     * @mbg.generated
     */
    int insertSelective(NetEaseSongDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_DETAIL
     *
     * @mbg.generated
     */
    NetEaseSongDetail selectOneByExample(NetEaseSongDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_DETAIL
     *
     * @mbg.generated
     */
    NetEaseSongDetail selectOneByExampleSelective(@Param("example") NetEaseSongDetailExample example, @Param("selective") NetEaseSongDetail.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_DETAIL
     *
     * @mbg.generated
     */
    List<NetEaseSongDetail> selectByExampleSelective(@Param("example") NetEaseSongDetailExample example, @Param("selective") NetEaseSongDetail.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_DETAIL
     *
     * @mbg.generated
     */
    List<NetEaseSongDetail> selectByExample(NetEaseSongDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_DETAIL
     *
     * @mbg.generated
     */
    NetEaseSongDetail selectByPrimaryKeySelective(@Param("id") String id, @Param("selective") NetEaseSongDetail.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_DETAIL
     *
     * @mbg.generated
     */
    NetEaseSongDetail selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_DETAIL
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") NetEaseSongDetail record, @Param("example") NetEaseSongDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_DETAIL
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") NetEaseSongDetail record, @Param("example") NetEaseSongDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_DETAIL
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(NetEaseSongDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_DETAIL
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(NetEaseSongDetail record);
}