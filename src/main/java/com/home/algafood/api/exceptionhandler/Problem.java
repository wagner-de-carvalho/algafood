package com.home.algafood.api.exceptionhandler;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(Include.NON_NULL)
@Getter
@Builder
public class Problem {
	private Integer status;
	private String type;
	private String title;
	private String detail;
	private String userMessage;
	private LocalDateTime timestamp;
	private List<Object> objects;

	@Getter
	@Setter
	@Builder
	public static class Object {
	
		private String name;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUserMessage() {
			return userMessage;
		}
		public void setUserMessage(String userMessage) {
			this.userMessage = userMessage;
		}
		private String userMessage;

	}

}
