package per.zs.studyGecco.index;

import java.util.List;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HrefBean;
import com.geccocrawler.gecco.spider.HtmlBean;

public class Category implements HtmlBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6260992805290386455L;

	@Text
    @HtmlField(cssPath="dt a")
    private String parentName;
 
    @HtmlField(cssPath="dd a")
    private List<HrefBean> categorys;
 
    public String getParentName() {
        return parentName;
    }
 
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }
 
    public List<HrefBean> getCategorys() {
        return categorys;
    }
 
    public void setCategorys(List<HrefBean> categorys) {
        this.categorys = categorys;
    }
}
