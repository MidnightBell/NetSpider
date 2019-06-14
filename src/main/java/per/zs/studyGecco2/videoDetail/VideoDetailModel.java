package per.zs.studyGecco2.videoDetail;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

@Document(collection = VideoDetailModel.collectionName)
public class VideoDetailModel implements HtmlBean{
	public static final String collectionName = "tencent_video_data";
	/**
	 * 
	 */
	private static final long serialVersionUID = 4282804466926993988L;

	@Id
	private String id;
	
	@Text
	@HtmlField(cssPath = "div.video_title_collect.cf > h1 > a")
	private String name;
	
	@Text
	@HtmlField(cssPath = "div.video_title_collect.cf > h1 > span.title_en")
	private String enName;
	
	@Text
	@HtmlField(cssPath = "div.video_title_collect.cf > h1 > span.type")
	private String model;
	
//	@Text
//	@HtmlField(cssPath = "div:nth-child(3) > div:nth-child(1) > span.type_txt")
//	private String alias;
//	
//	@Text
//	@HtmlField(cssPath = "div:nth-child(3) > div:nth-child(2) > span.type_txt")
//	private String area;
//	
//	@Text
//	@HtmlField(cssPath = "div:nth-child(3) > div:nth-child(3) > span.type_txt")
//	private String language;
	
	@Text
	@HtmlField(cssPath = "div.video_tag.cf > div > a")
	private List<String> tags;
	
	@Text
	@HtmlField(cssPath = "div.video_score > a > span.score")
	private String dScore;
	
	@HtmlField(cssPath = "div.video_type > div.type_item")
	private List<Item> item;
	
	@Text
	@HtmlField(cssPath = "div.video_actor._actor_txt_lineHight > div > div.item > span.name")
	private List<String> actorList;
	
	@Text
	@HtmlField(cssPath = "div.video_desc > span.desc_txt > span")
	private String summary;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnName() {
		return enName;
	}

	public void setEnName(String enName) {
		this.enName = enName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

//	public String getAlias() {
//		return alias;
//	}
//
//	public void setAlias(String alias) {
//		this.alias = alias;
//	}
//
//	public String getArea() {
//		return area;
//	}
//
//	public void setArea(String area) {
//		this.area = area;
//	}
//
//	public String getLanguage() {
//		return language;
//	}
//
//	public void setLanguage(String language) {
//		this.language = language;
//	}

	public List<String> getTags() {
		return tags;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String getdScore() {
		return dScore;
	}

	public void setdScore(String dScore) {
		this.dScore = dScore;
	}

//	public String getIssue() {
//		return issue;
//	}
//
//	public void setIssue(String issue) {
//		this.issue = issue;
//	}

	public List<String> getActorList() {
		return actorList;
	}

	public void setActorList(List<String> actorList) {
		this.actorList = actorList;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Override
	public String toString() {
		return "VideoDetailModel [name=" + name + ", enName=" + enName + ", model=" + model + ", tags=" + tags
				+ ", dScore=" + dScore + ", item=" + item + ", actorList=" + actorList + ", summary=" + summary + "]";
	}

}
