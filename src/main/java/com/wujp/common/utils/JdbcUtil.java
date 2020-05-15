package com.wujp.common.utils;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

/**
 * jdbc工具类
 */
public class JdbcUtil {

    private static JdbcTemplate jdbcTemplate=SpringContextHolder.getBean("jdbcTemplate");

    public static List<Map<String,Object>>  queryList(String sql,Object... param){
        return jdbcTemplate.queryForList(sql,param);
    }

    public static Map<String,Object> queryOne(String sql,Object... param){
        return jdbcTemplate.queryForMap(sql,param);
    }

    public static void update(String sql,Object... param){
        jdbcTemplate.update(sql,param);
    }

    public static void bactchUpdate(String sql){
        jdbcTemplate.batchUpdate(sql);
    }


}
