package com.wangshixiu;

import java.util.List;

/**
 * @Author 王世秀
 * @Date 2022/7/2
 */

public class DatabaseSearch implements Search{
    @Override
    public List<String> searchDoc(String keyword) {
        System.out.println("数据搜索 "+keyword);
        return null;
    }
}
