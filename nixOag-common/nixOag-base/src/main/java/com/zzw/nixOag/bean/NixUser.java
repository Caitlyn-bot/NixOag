package com.zzw.nixOag.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zzw.nixOag.bean.common.BaseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <Description> <br>
 *
 * @author zhang.zhiwei<br>
 * @version 1.0<br>
 * @CreateDate 2023/1/21 <br>
 * @see com.zzw.nixOag.bean <br>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "用户")
@TableName("NIX_USER")
public class NixUser extends BaseEntity {

    @TableId(type = IdType.AUTO)
    @TableField("USER_ID")
    private Long userId;

    @TableField("USERNAME")
    private String userName;

    @TableField("PASSWORD")
    private String password;

    @TableField("USER_STATUS")
    private String userState;

    @ApiModelProperty(value = "头像地址")
    @TableField("HEAD_URL")
    private String headUrl;
}
