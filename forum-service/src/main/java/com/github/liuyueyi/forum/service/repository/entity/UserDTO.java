package com.github.liuyueyi.forum.service.repository.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户登录表
 *
 * @author louzai
 * @date 2022-07-18
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("user")
public class UserDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    /**
     * 第三方用户ID
     */
    private String thirdAccountId;

    /**
     * 登录方式: 0-微信登录，1-账号密码登录
     */
    private Integer loginType;

    private Integer deleted;
}
