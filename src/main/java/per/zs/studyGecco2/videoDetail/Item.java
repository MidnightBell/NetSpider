package per.zs.studyGecco2.videoDetail;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class Item implements HtmlBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2133839864112727621L;
	
	@Text
	@HtmlField(cssPath = "span.type_tit")
	private String tit;
	
	@Text
	@HtmlField(cssPath = "span.type_txt")
	private String text;

	public String getTit() {
		return tit;
	}

	public void setTit(String tit) {
		this.tit = tit;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Item [tit=" + tit + ", text=" + text + "]";
	}
	
}
