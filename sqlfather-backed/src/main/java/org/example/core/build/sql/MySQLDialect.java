package org.example.core.build.sql;

/**
 * Author: ZhaoXing

 */

/**
 * MYSQL方言
 */
public class MySQLDialect implements SQLDialect {

    /**
     * 封装表名
     *
     * @param tableName
     * @return
     */
    @Override
    public String wrapTableName(String tableName) {
        return String.format("`%s`", tableName);
    }

    /**
     * 解析表名
     *
     * @param tableName
     * @return
     */
    @Override
    public String parseTableName(String tableName) {
        if (tableName.startsWith("`") && tableName.endsWith("`")) {
            return tableName.substring(1, tableName.length() - 1);
        }
        return tableName;
    }

    /**
     * 封装字段名
     * @param fieldName
     * @return
     */
    @Override
    public String wrapFieldName(String fieldName) {
        return String.format("`%s`", fieldName);
    }

    /**
     * 解析字段名
     * @param fieldName
     * @return
     */
    @Override
    public String parseFieldName(String fieldName) {
        if (fieldName.startsWith("`") && fieldName.endsWith("`")) {
            return fieldName.substring(1, fieldName.length() - 1);
        }
        return fieldName;
    }
}
