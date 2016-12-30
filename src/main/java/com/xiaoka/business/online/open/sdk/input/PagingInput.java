package com.xiaoka.business.online.open.sdk.input;

import com.sun.istack.internal.NotNull;

/**
 * @author taotao@xiaokakeji.com
 * @date 2016/12/29.
 * @copy xiaokakeji
 * @description:
 */
public class PagingInput {

	/**
	 * 分页索引，从1开始递增，直到等于pageLength为止
	 */
	@NotNull
	private Integer pageIndex;
	/**
	 * 每页记录数，仅限测试环境测试使用，正式环境服务端统一设置
	 */
	private Integer pageSize;

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}
