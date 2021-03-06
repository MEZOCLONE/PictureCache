package com.levelup.picturecache;

/**
 * interface to run some code on the UI thread
 */
public interface UIHandler {
	/**
	 * run the code in the UI thread
	 * @param runnable
	 */
	void runOnUiThread(Runnable runnable);
	/**
	 * indicates if we are running on the UI thread
	 * @return
	 */
	boolean isUIThread();
}
