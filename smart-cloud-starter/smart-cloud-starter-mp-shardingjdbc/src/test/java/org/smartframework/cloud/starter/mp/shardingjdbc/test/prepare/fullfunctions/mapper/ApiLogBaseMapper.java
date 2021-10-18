package org.smartframework.cloud.starter.mp.shardingjdbc.test.prepare.fullfunctions.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.smartframework.cloud.starter.mp.shardingjdbc.test.prepare.fullfunctions.entity.ApiLogEntity;
import org.smartframework.cloud.starter.mybatis.plus.common.mapper.SmartMapper;

/**
 * api日志信息base mapper
 *
 * @author liyulin
 * @date 2021-03-23
 */
@Mapper
public interface ApiLogBaseMapper extends SmartMapper<ApiLogEntity> {

}