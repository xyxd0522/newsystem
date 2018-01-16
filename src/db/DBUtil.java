/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import com.news.linglian.entity.Email;
import java.util.List;
import util.ArrayUtil;
import util.ClassUtil;
import util.SqlUtil;

/**
 *
 * @author lol
 */
public class DBUtil {
    
    public static <T> List<T> getObjectLimit(String baseDate, String orderBy, T t, int start, int size) {
        String sql = new SqlUtil()
                .addDataName(baseDate)
                .setStatus(SqlUtil.SQL_SELECT)
                .addBeforeWheres(ClassUtil.getName(t.getClass()))
                .addAfterWheres(ClassUtil.getNameNotNull(t))
                .addLast("order by " + orderBy + " desc limit ?, ?")
                .build();
        Object[] os = new Object[2];
        os[0] = start;
        os[1] = size;
        Object[] objs = ArrayUtil.multArray(ClassUtil.getValueNotNull(t), os);
        return DBMan.getInstance().queryWithoutThrow((Class<T>) t.getClass(), sql, objs);
    }
}
