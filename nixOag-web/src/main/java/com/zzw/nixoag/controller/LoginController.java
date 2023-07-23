package com.zzw.nixoag.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zzw.nixOag.bean.NixUser;
import com.zzw.nixOag.bean.common.Result;

/**
 * <Description> <br>
 *
 * @author zhang.zhiwei<br>
 * @version 1.0<br>
 * @CreateDate 2023/1/21 <br>
 * @see com.zzw.nixoag.controller <br>
 */
@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/userLogin")
    public Result login(@RequestBody NixUser user) {
        System.out.println(user.toString());
        return new Result(true, "Login Success!", user);
    }
}
