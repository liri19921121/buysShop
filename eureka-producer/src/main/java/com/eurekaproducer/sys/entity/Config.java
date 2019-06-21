package com.eurekaproducer.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统配置项
 * </p>
 *
 * @author rstyro
 * @since 2019-06-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_config")
@ApiModel(value="Config对象", description="系统配置项")
public class Config implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "配置类型")
    private String configType;

    @ApiModelProperty(value = "配置项名称")
    private String configName;

    @ApiModelProperty(value = "配置项值")
    private String configValue;

    @ApiModelProperty(value = "配置项描述")
    private String configDesc;

    @ApiModelProperty(value = "是否删除")
    private String isDeleted;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    private Long createBy;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime modifyTime;

    private Long modifyBy;


}
