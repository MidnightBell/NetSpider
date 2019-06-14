package per.zs.studyGecco.index;

import java.util.List;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.scheduler.SchedulerContext;
import com.geccocrawler.gecco.spider.HrefBean;
/**
* @ClassName: AllSortPipeline 
 * @Description: TODO
 * @author: zs
 * @date: 2019年6月14日 下午5:29:27
 */
@PipelineName("allSortPipeline")
public class AllSortPipeline implements Pipeline<AllSort> {

	@Override
	public void process(AllSort allSort) {
		List<Category> categorys = allSort.getMobile();
        for(Category category : categorys) {
            List<HrefBean> hrefs = category.getCategorys();
            for(HrefBean href : hrefs) {
                String url = "https:"+href.getUrl()+"&page=1";//+"&delivery=1&page=1&JL=4_10_0&go=0";
                HttpRequest currRequest = allSort.getRequest();
                //将待抓取的链接放入队列中等待进一步抓取。
                SchedulerContext.into(currRequest.subRequest(url));
            }
        }
	}

}
