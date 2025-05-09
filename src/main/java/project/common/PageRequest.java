package project.common;

import lombok.Data;
import project.constant.CommonConstant;
import project.constant.CommonConstant;
/**
 * @author 我要大声哈哈哈哈(user1919191)
 * @Profieession https://github.com/user1919191
 */

/**
 * 分页请求
 */

@Data
public class PageRequest {

    /**
     * 当前页数
     */
    private int page = 1;

    /**
     * 页面大小
     */
    private int size = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 默认排序
     */
    private String sortOrder = CommonConstant.Sort_Order_ASC;
}
