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
@TableName("sys_coin_price")
public class CoinPrice implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 币种
     */
    private String coin;

    /**
     * 币价价格
     */
    private BigDecimal price;

    /**
     * 兑换类型(如：USDT)
     */
    private String exchangeType;

    /**
     * 1个usdt兑cny汇率
     */
    private BigDecimal usdtRate;

    /**
     * 价值rmb
     */
    private BigDecimal cnyPrice;

    /**
     * 人民币兑1美元汇率
     */
    private BigDecimal usdRate;

    /**
     * 价值美元
     */
    private BigDecimal usdPrice;

    private String priceDate;

    /**
     * 状态0不可用1可用
     */
    private Integer status;

    /**
     * 是否已删除（是 Y  否 N）
     */
    private String isDeleted;

    /**
     * 创建人
     */
    private Long createBy;

    /**
     * 插入时间
     */
    private LocalDateTime createTime;

    /**
     * 更新人
     */
    private Long modifyBy;

    /**
     * 更新时间
     */
    private LocalDateTime modifyTime;


}
