package com.eurekaproducer.sys.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author rstyro
 * @since 2019-06-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_coin_info")
public class CoinInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 币种名称
     */
    private String name;

    /**
     * 币种编码，如：BTC
     */
    private String code;

    /**
     * 小数点后位数
     */
    private Integer wei;

    /**
     * 状态(Y：可用，N：不可用)
     */
    private String status;

    /**
     * 是否可提现，0不可用1可以
     */
    private Integer isWithd;

    /**
     * 是否是真的区块链币种
     */
    private String isReallyCoin;

    /**
     * 提币手续费/百分比
     */
    private Integer withdrawCharge;

    /**
     * 提币单笔最小数量 
     */
    private BigDecimal withdrawMin;

    /**
     * 单笔最大数量 
     */
    private BigDecimal withdrawMax;

    /**
     * 当天最大提币数量 
     */
    private BigDecimal withdrawDayMax;

    /**
     * 图标地址
     */
    private String pictureUrl;

    /**
     * 是否有备注地址：1有0没有
     */
    private Integer isRemark;

    /**
     * 站内提币审核界限
     */
    private BigDecimal withdrawIn;

    /**
     * 区块提币审核界限
     */
    private BigDecimal withdrawOut;

    /**
     * 是否已删除(Y/N)
     */
    private String isDeleted;

    /**
     * 创建人
     */
    private Long createBy;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    private Long modifyBy;

    private LocalDateTime modifyTime;


}
