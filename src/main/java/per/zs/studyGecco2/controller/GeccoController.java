package per.zs.studyGecco2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.request.HttpGetRequest;

import per.zs.studyGecco2.utils.MongoUtil;

@RestController
public class GeccoController {
	@Autowired
	MongoTemplate mongoTemplate;
	
	@GetMapping("start")
	public void start() {
		MongoUtil.setMongoTemplate(mongoTemplate);
		String url = "https://v.qq.com/x/list/movie?sort=21&offset=0"; // 想要爬取的网站的首页地址
		HttpGetRequest start = new HttpGetRequest(url); // 获取网站请求
		start.setCharset("UTF-8");
		GeccoEngine.create() // 创建搜索引擎
				.classpath("per.zs.studyGecco2") // 要搜索的包名，会自动搜索该包下，含@Gecco注解的文件。
				.start(start).thread(5)// 开启多少个线程抓取
				.interval(2000) // 隔多长时间抓取1次
				.run();
	}
}
