package com.jetfiretool.http.test;

import java.io.File;
import java.util.HashMap;

import com.jetfiretool.http.HttpResponse;
import com.jetfiretool.http.HttpUtil;
import org.junit.Ignore;
import org.junit.Test;

import com.jetfiretool.core.io.FileUtil;
import com.jetfiretool.http.HttpRequest;

/**
 * 文件上传单元测试
 * @author Jetfire
 *
 */
public class UploadTest {
	
	/**
	 * 多文件上传测试
	 */
	@Test
	@Ignore
	public void uploadTest() {
		File file = FileUtil.file("e:\\face.jpg");
		File file2 = FileUtil.file("e:\\face2.jpg");

		// 方法一：自定义构建表单
		HttpRequest request = HttpRequest//
				.post("http://localhost:8090/file/upload")//
				.form("file", file2, file)//
				.form("fileType", "图片");
		HttpResponse response = request.execute();
		System.out.println(response.body());
	}

	@Test
	@Ignore
	public void uploadTest2() {
		File file = FileUtil.file("D:\\face.jpg");

		// 方法二：使用统一的表单，Http模块会自动识别参数类型，并完成上传
		HashMap<String, Object> paramMap = new HashMap<>();
		paramMap.put("city", "北京");
		paramMap.put("file", file);
		String result = HttpUtil.post("http://wthrcdn.etouch.cn/weather_mini", paramMap);
		System.out.println(result);
	}
}