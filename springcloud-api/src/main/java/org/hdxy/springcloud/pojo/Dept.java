package org.hdxy.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 实体类
 */
@Data @NoArgsConstructor @Accessors(chain = true) //链式
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    //查看数据来源那个数据库
    private String dbSource;

    public Dept(String dname) {
        this.dname = dname;
    }
}
