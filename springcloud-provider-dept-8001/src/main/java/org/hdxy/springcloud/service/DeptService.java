package org.hdxy.springcloud.service;

import org.hdxy.springcloud.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;
public interface DeptService {
    boolean addDept(Dept dept);

    Dept queryById(Long id);

    List<Dept> queryAll();
}
