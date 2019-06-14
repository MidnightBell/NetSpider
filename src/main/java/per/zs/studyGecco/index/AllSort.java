package per.zs.studyGecco.index;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;
/**
* @ClassName: AllSort 
 * @Description: TODO
 * @author: zs
 * @date: 2019年6月14日 下午5:29:15
 */
@Gecco(matchUrl="https://www.jd.com/allSort.aspx", pipelines={"consolePipeline", "allSortPipeline"})
public class AllSort implements HtmlBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2586670982962788668L;

	@Request
    private HttpRequest request;
 
    //手机
    @HtmlField(cssPath="body > div:nth-child(5) > div.main-classify > div.list > div.category-items.clearfix > div:nth-child(1) > div:nth-child(2) > div.mc > div.items > dl")
    private List<Category> mobile;
 
    //家用电器
    @HtmlField(cssPath="body > div:nth-child(5) > div.main-classify > div.list > div.category-items.clearfix > div:nth-child(1) > div:nth-child(3) > div.mc > div.items > dl")
    private List<Category> domestic;
 
    public List<Category> getMobile() {
        return mobile;
    }
 
    public void setMobile(List<Category> mobile) {
        this.mobile = mobile;
    }
 
    public List<Category> getDomestic() {
        return domestic;
    }
 
    public void setDomestic(List<Category> domestic) {
        this.domestic = domestic;
    }
 
    public HttpRequest getRequest() {
        return request;
    }
 
    public void setRequest(HttpRequest request) {
        this.request = request;
    }
}
