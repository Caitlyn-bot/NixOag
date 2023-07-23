package com.zzw.nixOag.dao;

import org.springframework.stereotype.Repository;

import com.zzw.nixOag.bean.NixTask;

/**
 * <Description> <br>
 *
 * @author zhang.zhiwei<br>
 * @version 1.0<br>
 * @CreateDate 2022/11/2 <br>
 * @see com.zzw.nixOag.dao <br>
 */
@Repository
public interface NixTaskDAO {
    /**
     * 添加task
     * @param task
     */
    void addTask(NixTask task);
}
