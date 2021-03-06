package com.website.batch.mapper;

import com.website.batch.entity.NetEaseSongListRel;
import com.website.batch.entity.NetEaseSongListRelExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface NetEaseSongListRelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_LIST_REL
     *
     * @mbg.generated
     */
    long countByExample(NetEaseSongListRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_LIST_REL
     *
     * @mbg.generated
     */
    int deleteByExample(NetEaseSongListRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_LIST_REL
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_LIST_REL
     *
     * @mbg.generated
     */
    int insert(NetEaseSongListRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_LIST_REL
     *
     * @mbg.generated
     */
    int insertSelective(NetEaseSongListRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_LIST_REL
     *
     * @mbg.generated
     */
    NetEaseSongListRel selectOneByExample(NetEaseSongListRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_LIST_REL
     *
     * @mbg.generated
     */
    NetEaseSongListRel selectOneByExampleSelective(@Param("example") NetEaseSongListRelExample example, @Param("selective") NetEaseSongListRel.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_LIST_REL
     *
     * @mbg.generated
     */
    List<NetEaseSongListRel> selectByExampleSelective(@Param("example") NetEaseSongListRelExample example, @Param("selective") NetEaseSongListRel.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_LIST_REL
     *
     * @mbg.generated
     */
    List<NetEaseSongListRel> selectByExample(NetEaseSongListRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_LIST_REL
     *
     * @mbg.generated
     */
    NetEaseSongListRel selectByPrimaryKeySelective(@Param("id") String id, @Param("selective") NetEaseSongListRel.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_LIST_REL
     *
     * @mbg.generated
     */
    NetEaseSongListRel selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_LIST_REL
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") NetEaseSongListRel record, @Param("example") NetEaseSongListRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_LIST_REL
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") NetEaseSongListRel record, @Param("example") NetEaseSongListRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_LIST_REL
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(NetEaseSongListRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SONG_LIST_REL
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(NetEaseSongListRel record);
}