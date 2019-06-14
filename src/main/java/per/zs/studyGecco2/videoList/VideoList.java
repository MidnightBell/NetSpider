package per.zs.studyGecco2.videoList;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl="https://v.qq.com/x/list/movie?sort=21&offset={offset}",pipelines="videoListPipeline")
public class VideoList implements HtmlBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 527082099910548620L;

	@Request
	private HttpRequest request;
	
	@HtmlField(cssPath = "body > div.site_container.container_main > div > div > div.mod_figures_wrapper > div.mod_bd > div > ul > li")
	private List<VideoInfo> videoInfo;

	@Text
	@HtmlField(cssPath = "body > div.site_container.container_main > div > div > div.mod_figures_wrapper > div.mod_hd > div > div > span:nth-child(2) > em")
	private int currentPage;
	
	@Text
	@HtmlField(cssPath = "body > div.site_container.container_main > div > div > div.mod_figures_wrapper > div.mod_hd > div > div > span:nth-child(2)")
	private String totalPage;

	public List<VideoInfo> getVideoInfo() {
		return videoInfo;
	}
	
	public void setVideoInfo(List<VideoInfo> videoInfo) {
		this.videoInfo = videoInfo;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public String getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(String totalPage) {
		this.totalPage = totalPage;
	}

	public HttpRequest getRequest() {
		return request;
	}

	public void setRequest(HttpRequest request) {
		this.request = request;
	}
	
	
}
