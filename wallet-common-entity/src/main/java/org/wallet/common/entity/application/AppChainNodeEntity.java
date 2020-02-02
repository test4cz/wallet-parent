package org.wallet.common.entity.application;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.LastModifiedDate;
import org.wallet.common.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 主链
 * 
 * @author zengfucheng
 */
@Getter
@Setter
@Entity
@Table(name = "app_chain_node", uniqueConstraints = @UniqueConstraint(name = "uk_app_chain_node", columnNames = {"chainId", "name"}))
public class AppChainNodeEntity extends BaseEntity {
	/**
	 * 主链ID
	 */
	@NotNull
	@Column(columnDefinition = "bigint(19) not null comment '主链ID'")
	private Long chainId;
	/**
	 * 名称
	 */
	@NotBlank
    @Column(columnDefinition = "varchar(20) not null comment '名称'")
	private String name;
    /**
     * 节点域
     */
	@NotBlank
    @Column(columnDefinition = "varchar(100) not null comment '节点域'")
    private String host;
	/**
	 * 是否默认
	 */
	@Column(columnDefinition = "tinyint(1) not null default 0 comment '是否默认'")
	private Boolean def;
	/**
	 * 排序
	 */
    @Column(columnDefinition = "int(4) not null default 0 comment '排序'")
	private Integer sort;
	/**
	 * 是否可用
	 */
    @Column(columnDefinition = "tinyint(1) not null default 1 comment '是否可用'")
	private Boolean enable;
	/**
	 * 更新者
	 */
    @Column(columnDefinition = "bigint(19) not null comment '更新者'")
	private Long updater;
	/**
	 * 更新时间
	 */
	@LastModifiedDate
    @Column(columnDefinition = "datetime not null default current_timestamp comment '更新时间'")
	private Date updateDate;

}