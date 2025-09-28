package com.wn.day41.controller;

import com.wn.day41.entity.Dept;
import com.wn.day41.util.ResultObj;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dept")
@CrossOrigin
public class DeptController {
    @RequestMapping("/get")
    public ResultObj getAll(Dept dept) {
        return ResultObj.Ok(dept);
    }

    @GetMapping("/getById/{id}")
    public ResultObj getById(@PathVariable Integer id) {

        return ResultObj.Ok(id);

    }

    @PostMapping("/updateById")
    public ResultObj updateById(@RequestBody Dept dept) {

        return ResultObj.Ok(dept);

    }

    @DeleteMapping("/delete")
    public ResultObj delete(Dept dept) {

        return ResultObj.Ok(dept);

    }

    @PostMapping("/updateAll")
    public ResultObj updateAll(Dept dept) {

        return ResultObj.Ok(dept);

    }

}
