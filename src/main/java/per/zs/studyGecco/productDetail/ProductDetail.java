package per.zs.studyGecco.productDetail;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl="https://item.jd.com/{code}.html", pipelines={"productDetailPipeline"})
public class ProductDetail implements HtmlBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3490026124766782504L;

	@Text
	@HtmlField(cssPath = "#detail > div.tab-con > div:nth-child(1) > div.p-parameter > ul.parameter2.p-parameter-list > li")
	private List<String> productDetail;

	public List<String> getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(List<String> productDetail) {
		this.productDetail = productDetail;
	}
	
}
