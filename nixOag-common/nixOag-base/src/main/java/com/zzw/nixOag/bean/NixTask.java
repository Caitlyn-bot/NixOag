package com.zzw.nixOag.bean;

import io.swagger.annotations.ApiModel;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * <Description> <br>
 *
 * @author zhang.zhiwei<br>
 * @version 1.0<br>
 * @CreateDate 2022/10/19 <br>
 * @see com.zzw.nixOag.bean <br>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "任务")
@TableName("NIX_TASK")
public class NixTask {

    @TableId(type = IdType.AUTO)
    @TableField("TASK_ID")
    private Long taskId;

    /**
     * 任务类型
     */
    @TableField("TASK_TYPE")
    private String taskType;

    /**
     * 任务等级
     */
    @TableField("TASK_LEVEL")
    private Long taskLevel;

    /**
     * 任务奖励
     */
    @TableField("TABLE_REWARD")
    private String taskReward;

    /**
     * 任务状态
     */
    @TableField("TASK_STATUS")
    private String taskStatus;

    /**
     * 任务创建者Id
     */
    @TableField("TASK_CREATE_USER_ID")
    private Long taskCreateUserId;

    /**
     * 创建日期
     */
    @TableField("TASK_CREATED_DATE")
    private Date taskCreatedDate;

    /**
     * 完成日期
     */
    @TableField("TASK_FINISHED_DATE")
    private Date taskFinishedDate;

    /**
     * 任务内容
     */
    @TableField("TASK_CONTENT")
    private String taskContent;


}
