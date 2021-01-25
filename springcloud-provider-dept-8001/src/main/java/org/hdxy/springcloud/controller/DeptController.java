package org.hdxy.springcloud.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.hdxy.springcloud.pojo.Dept;
import org.hdxy.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    @PostMapping("/dept/add")
    public boolean addDept(@RequestBody Dept dept) {
        System.out.println(dept);
       return deptService.addDept(dept);
    }
    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable Long id) {
        return deptService.queryById(id);
    }
    @GetMapping("/dept/list")
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }

}
