package com.aravinda.springdemo.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Service
public class ExecutionTimerInterceptor implements HandlerInterceptor {

	private static Logger LOGGER = LoggerFactory.getLogger(ExecutionTimerInterceptor.class);
	
	long PRE_HANDLE_TIME = 0;
	long POST_HANDLE_TIME = 0;
	long AFTER_COMPLETION_TIME = 0;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		PRE_HANDLE_TIME = System.currentTimeMillis();
		LOGGER.info("PRE_HANDLE_TIME :: " + PRE_HANDLE_TIME);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		POST_HANDLE_TIME = System.currentTimeMillis();
		LOGGER.info("POST_HANDLE_TIME :: " + POST_HANDLE_TIME);

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		AFTER_COMPLETION_TIME = System.currentTimeMillis();
		LOGGER.info("AFTER_COMPLETION_TIME :: " + AFTER_COMPLETION_TIME);
		long handlerExecutionTime = POST_HANDLE_TIME - PRE_HANDLE_TIME;
		long totalExecutionTime = AFTER_COMPLETION_TIME - PRE_HANDLE_TIME;
		LOGGER.info("HANDLER_EXECUTION_TIME :: " + handlerExecutionTime);
		LOGGER.info("TOTAL_EXECUTION_TIME :: " + totalExecutionTime);

	}

}
