package org.ku8eye.mapping;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
import org.ku8eye.domain.Ku8sSrvEndpoint;

public interface Ku8sSrvEndpointMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku8s_srv_endpoint
     *
     * @mbggenerated
     */
    @Delete({
        "delete from ku8s_srv_endpoint",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku8s_srv_endpoint
     *
     * @mbggenerated
     */
    @Insert({
        "insert into ku8s_srv_endpoint (ID, SERVICE_TYPE, ",
        "CLUSTER_ID, HOST_ID, ",
        "SERVICE_URL, SERVICE_STATUS, ",
        "NOTE, LAST_UPDATED)",
        "values (#{id,jdbcType=INTEGER}, #{serviceType,jdbcType=TINYINT}, ",
        "#{clusterId,jdbcType=INTEGER}, #{hostId,jdbcType=INTEGER}, ",
        "#{serviceUrl,jdbcType=VARCHAR}, #{serviceStatus,jdbcType=TINYINT}, ",
        "#{note,jdbcType=VARCHAR}, #{lastUpdated,jdbcType=TIMESTAMP})"
    })
    int insert(Ku8sSrvEndpoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku8s_srv_endpoint
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, SERVICE_TYPE, CLUSTER_ID, HOST_ID, SERVICE_URL, SERVICE_STATUS, NOTE, LAST_UPDATED",
        "from ku8s_srv_endpoint",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="SERVICE_TYPE", property="serviceType", jdbcType=JdbcType.TINYINT),
        @Result(column="CLUSTER_ID", property="clusterId", jdbcType=JdbcType.INTEGER),
        @Result(column="HOST_ID", property="hostId", jdbcType=JdbcType.INTEGER),
        @Result(column="SERVICE_URL", property="serviceUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="SERVICE_STATUS", property="serviceStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP)
    })
    Ku8sSrvEndpoint selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku8s_srv_endpoint
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, SERVICE_TYPE, CLUSTER_ID, HOST_ID, SERVICE_URL, SERVICE_STATUS, NOTE, LAST_UPDATED",
        "from ku8s_srv_endpoint"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="SERVICE_TYPE", property="serviceType", jdbcType=JdbcType.TINYINT),
        @Result(column="CLUSTER_ID", property="clusterId", jdbcType=JdbcType.INTEGER),
        @Result(column="HOST_ID", property="hostId", jdbcType=JdbcType.INTEGER),
        @Result(column="SERVICE_URL", property="serviceUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="SERVICE_STATUS", property="serviceStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Ku8sSrvEndpoint> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku8s_srv_endpoint
     *
     * @mbggenerated
     */
    @Update({
        "update ku8s_srv_endpoint",
        "set SERVICE_TYPE = #{serviceType,jdbcType=TINYINT},",
          "CLUSTER_ID = #{clusterId,jdbcType=INTEGER},",
          "HOST_ID = #{hostId,jdbcType=INTEGER},",
          "SERVICE_URL = #{serviceUrl,jdbcType=VARCHAR},",
          "SERVICE_STATUS = #{serviceStatus,jdbcType=TINYINT},",
          "NOTE = #{note,jdbcType=VARCHAR},",
          "LAST_UPDATED = #{lastUpdated,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Ku8sSrvEndpoint record);
}