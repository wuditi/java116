package com.wn.day42.controller;

import com.wn.day42.entity.Dweller;
import com.wn.day42.service.DwellerService;
import com.wn.day42.service.HouseService;
import com.wn.day42.utils.PageResult;
import com.wn.day42.utils.ResultObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Dweller")
@CrossOrigin
public class DwellerController {
    @Autowired
    private DwellerService dwellerService;

    @RequestMapping("/findAll")
    public ResultObj findAll() {

        List<Dweller> lists = dwellerService.list();

        return ResultObj.Ok(lists);
    }

    @GetMapping("selectHouseAll")
    public ResultObj selectHouseAll(Integer pageNum, Integer pageSize, Dweller dw) {

        PageResult<Dweller> dweller = dwellerService.selectAll(pageNum, pageSize, dw);

        return ResultObj.Ok(dweller);
    }

    @PostMapping("/addDweller")
    public ResultObj addDweller(@RequestBody Dweller dweller) {

        dweller.setIsdelete(0);
        dwellerService.saveOrUpdate(dweller);


        return ResultObj.Ok();
    }

    @DeleteMapping("/removeDweller/{id}")
    public ResultObj removeDweller(@PathVariable Integer id) {

        dwellerService.removeById(id);
        return ResultObj.Ok();
    }

    @DeleteMapping("/batchedDelete/{ids}")
    public ResultObj batchedDelete(@PathVariable List ids) {

        dwellerService.removeByIds(ids);
        return ResultObj.Ok();

    }
}
