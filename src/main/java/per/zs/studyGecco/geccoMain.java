package per.zs.studyGecco;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.request.HttpGetRequest;

/**
* @ClassName: geccoMain 
 * @Description: 启动类
 * @author: zs
 * @date: 2019年6月17日 上午8:54:05
 */
public class geccoMain {
	public static void main(String[] args) {
		String url = "https://www.jd.com/allSort.aspx"; // 想要爬取的网站的首页地址
		HttpGetRequest start = new HttpGetRequest(url); // 获取网站请求
		start.setCharset("UTF-8");
		GeccoEngine.create() // 创建搜索引擎
				.classpath("per.zs.studyGecco") // 要搜索的包名，会自动搜索该包下，含@Gecco注解的文件。
				.start(start).thread(5)// 开启多少个线程抓取
				.interval(2000) // 隔多长时间抓取1次
				.run();
	}
}
