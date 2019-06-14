package per.zs.studyGecco2.videoList;

import com.geccocrawler.gecco.annotation.Attr;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class VideoInfo implements HtmlBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1505714512252810208L;
	
	@Text
	@HtmlField(cssPath = "div.figure_title_score > strong > a")
	private String name;
	
	@Text
	@HtmlField(cssPath = "div.figure_title_score > div > em.score_l")
	private String scoreL;

	@Text
	@HtmlField(cssPath = "div.figure_title_score > div > em.score_s")
	private String scoreS;
	
	@Text
	@HtmlField(cssPath = "a > div > span")
	private String captionScore;
	
	@Attr("data-float")
	@HtmlField(cssPath = ".figure")
	private String tencentId;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScoreL() {
		return scoreL;
	}

	public void setScoreL(String scoreL) {
		this.scoreL = scoreL;
	}

	public String getScoreS() {
		return scoreS;
	}

	public void setScoreS(String scoreS) {
		this.scoreS = scoreS;
	}

	public String getCaptionScore() {
		return captionScore;
	}

	public void setCaptionScore(String captionScore) {
		this.captionScore = captionScore;
	}

	public String getTencentId() {
		return tencentId;
	}

	public void setTencentId(String tencentId) {
		this.tencentId = tencentId;
	}
}
