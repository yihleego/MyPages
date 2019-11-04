package io.leego.mypages.dialect;

import io.leego.mypages.util.PaginationParam;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;

import java.util.Map;

/**
 * @author Yihleego
 */
public class InformixDialect extends AbstractDialect {

    @Override
    public String getPaginationSql(String sql, int offset, int rows) {
        return "SELECT  SKIP ?  FIRST ?  * FROM ( " + sql + " ) _TT ";
    }

    @Override
    public Object[] getPaginationParam(MappedStatement ms, Map<Object, Object> paramMap, BoundSql boundSql, CacheKey pageKey, PaginationParam paginationParam) {
        return new Object[]{paginationParam.getOffset(), paginationParam.getRows()};
    }

}
