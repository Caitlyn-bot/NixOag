package com.zzw.nixOag.bean.common;

import java.io.Serializable;
import lombok.Data;

/**
 * <Description> <br>
 *
 * @author zhang.zhiwei<br>
 * @version 1.0<br>
 * @CreateDate 2023/1/21 <br>
 * @see com.zzw.nixOag.bean.common <br>
 */
@Data
public class Result implements Serializable {
    /**
     * 执行结果，true为执行成功 false为执行失败
     */
    private boolean flag;

    /**
     * 返回结果信息，主要用于页面提示信息
     */
    private String message;

    /**
     * 返回数据
     */
    private Object data;

    public Result(boolean flag, String message) {
        super();
        this.flag = flag;
        this.message = message;
    }

    public Result(boolean flag, String message, Object data) {
        this.flag = flag;
        this.message = message;
        this.data = data;
    }
}
