package per.zs.studyGecco.productList;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl="https://list.jd.com/list.html?cat={cat}&page={page}", pipelines={"productListPipeline"})
public class ProductList implements HtmlBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4344269469600300231L;

	@Request
    private HttpRequest request;
 
    /**
     * 抓取列表项的详细内容，包括titile，价格，详情页地址等
     */
    @HtmlField(cssPath="#plist .gl-item")
    private List<ProductBrief> details;
    /**
     * 获得商品列表的当前页
     */
    @Text
    @HtmlField(cssPath="#J_topPage > span > b")
    private int currPage;
    /**
     * 获得商品列表的总页数
     */
    @Text
    @HtmlField(cssPath="#J_topPage > span > i")
    private int totalPage;
 
    public List<ProductBrief> getDetails() {
        return details;
    }
 
    public void setDetails(List<ProductBrief> details) {
        this.details = details;
    }
 
    public int getCurrPage() {
        return currPage;
    }
 
    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }
 
    public int getTotalPage() {
        return totalPage;
    }
 
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
 
    public HttpRequest getRequest() {
        return request;
    }
 
    public void setRequest(HttpRequest request) {
        this.request = request;
    }
}
