package per.zs.studyGecco2.videoDetail;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

import per.zs.studyGecco2.videoDetail.VideoDetailModel;;

@Gecco(matchUrl="https://v.qq.com/detail/j/{tencentId}.html",pipelines="videoDetailPipeline")
public class VideoDetail implements HtmlBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 966898898480979515L;

	@HtmlField(cssPath = "body > div:nth-child(3) > div.site_container.container_detail_top > div > div > div")
	private VideoDetailModel videoDetail;

	public VideoDetailModel getVideoDetail() {
		return videoDetail;
	}

	public void setVideoDetail(VideoDetailModel videoDetail) {
		this.videoDetail = videoDetail;
	}
	
}
