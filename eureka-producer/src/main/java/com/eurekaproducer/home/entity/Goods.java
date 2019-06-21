package com.eurekaproducer.home.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 商品信息
 * </p>
 *
 * @author rstyro
 * @since 2019-02-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("shop_goods")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 店铺ID
     */
    private Long shopId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品编号
     */
    private String goodsNum;

    /**
     * 销量
     */
    private Integer salesNum;

    /**
     * 标签
     */
    private String target;

    /**
     * 价格
     */
    private BigDecimal price;

    public BigDecimal getPrice() {

        return price.setScale(4,BigDecimal.ROUND_DOWN);
    }

    /**
     * 规格
     */
    private Long spec;

    /**
     * 分类
     */
    private Long goodsClassify;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 商品版本
     */
    private Integer goodsVersion;

    /**
     * 是否最高商品版本,1是0不是
     */
    private Integer goodsVersionNow;

    /**
     * 是否热卖
     */
    private Integer hot;

    /**
     * 热卖排序号
     */
    private Integer sortNum;

    /**
     * 上架状态(0 下架 , 1 上架)
     */
    private Integer shelfState;

    /**
     * 审核状态(0 未审核 , 1 审核通过 , 2 审核不通过)
     */
    private Integer auditState;

    /**
     * 商品详情
     */
    private String goodsDetail;

    /**
     * 展示图片
     */
    private String showPhoto;

    /**
     * 详细图片
     */
    private String topPhoto;

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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 更新人
     */
    private Long modifyBy;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime modifyTime;

    /**
     * 版本
     */
    @Version
    private Integer version;

    /**
     * 默认显示代币币种
     */
    private String defShowCoin;

    private Integer hide;

    private BigDecimal goodRate;

    /**
     * 销售量
     */
    @TableField(exist = false)
    private Integer amount;
}
