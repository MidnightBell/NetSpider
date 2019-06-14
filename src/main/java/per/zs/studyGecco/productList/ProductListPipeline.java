package per.zs.studyGecco.productList;


import org.apache.commons.lang3.StringUtils;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.scheduler.SchedulerContext;

@PipelineName("productListPipeline")
public class ProductListPipeline implements Pipeline<ProductList> {

	@Override
	public void process(ProductList productList) {
		HttpRequest currRequest = productList.getRequest();
        //下一页继续抓取
        int currPage = productList.getCurrPage();
        int nextPage = currPage + 1;
        int totalPage = productList.getTotalPage();
//        List<ProductBrief> list = productList.getDetails();
//        for(int i = 0;i<list.size();i++) {
//        	String code = productList.getDetails().get(i).getCode();
//        	String detailUrl = "https://item.jd.com/"+code+".html";
//        	SchedulerContext.into(currRequest.subRequest(detailUrl));
//        }
//        	try {
//				OutputStream out = new FileOutputStream("G:/WormStudy-gecco/京东商品-手机.txt",true);
//				try {
//					String ss = list.get(i).toString();
//					out.write(("\n"+list.get(i).getTitle()+"\t\n").getBytes());
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//				out.close();
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//        }
        if(nextPage <= totalPage) {
            String nextUrl = "";
            String currUrl = currRequest.getUrl();
            if(currUrl.indexOf("page=") != -1) {
                nextUrl = StringUtils.replaceOnce(currUrl, "page=" + currPage, "page=" + nextPage);
            } else {
                nextUrl = currUrl + "&" + "page=" + nextPage;
            }
            SchedulerContext.into(currRequest.subRequest(nextUrl));
        }
	}

}
