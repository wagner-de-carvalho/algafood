package com.home.algafood.api.exceptionhandler;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Problem {
	private Integer status;
	private String type;
	private String title;
	private String detail;
}
