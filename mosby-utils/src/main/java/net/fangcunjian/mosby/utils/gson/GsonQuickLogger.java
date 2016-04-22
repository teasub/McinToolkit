package net.fangcunjian.mosby.utils.gson;

/**
 * 日志
 * @author mcin
 *
 */
public interface GsonQuickLogger {

	/**
	 * JsonQuick的异常日志
	 * @param json
	 * @param e
	 */
	void e(String json, Exception e);
}
