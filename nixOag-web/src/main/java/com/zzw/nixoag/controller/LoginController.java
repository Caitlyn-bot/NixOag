package com.zzw.nixoag.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wf.captcha.SpecCaptcha;
import com.wf.captcha.utils.CaptchaUtil;
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
@Slf4j
public class LoginController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/userLogin")
    public Result login(@RequestBody NixUser user) {
        return new Result(true, "Login Success!", user);
    }

    /**
     * 生成验证码
     * @param request
     * @param response
     */
    @GetMapping("/generator")
    public void generatorCode(HttpServletRequest request, HttpServletResponse response) {
        try {
            SpecCaptcha specCaptcha = new SpecCaptcha(100, 50);
            String captcha = specCaptcha.text();
            stringRedisTemplate.opsForValue().set("verifyCode", captcha);
            CaptchaUtil.out(specCaptcha, request, response);
        }
        catch (IOException e) {
            log.error(e.getMessage());
        }
    }

    /**
     * 校验验证码正确性
     * @param verifyCode
     * @param request
     * @return
     */
    @GetMapping("/verify")
    public Boolean verify(String verifyCode, HttpServletRequest request) {
        String captcha = stringRedisTemplate.opsForValue().get("verifyCode");
        return verifyCode.equalsIgnoreCase(captcha);
    }
}
