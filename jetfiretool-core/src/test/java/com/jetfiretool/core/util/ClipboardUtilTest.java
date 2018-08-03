package com.jetfiretool.core.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * 剪贴板工具类单元测试
 * @author Jetfire
 *
 */
public class ClipboardUtilTest {
	
	@Test
	public void setAndGetStrTest() {
		ClipboardUtil.setStr("test");
		
		String test = ClipboardUtil.getStr();
		Assert.assertEquals("test", test);
	}
}
