package per.zs.studyGecco.productDetail;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;

@PipelineName("productDetailPipeline")
public class ProductDetailPipeline implements Pipeline<ProductDetail> {

	@Override
	public void process(ProductDetail productDetail) {
		List<String> details = productDetail.getProductDetail();
		for(String detail:details) {
			System.out.println(detail);
			try {
				OutputStream out = new FileOutputStream("G:/work/WormStudy-gecco/京东商品-手机详细信息.txt",true);
				try {
					out.write((detail+"\t\n").getBytes());
				} catch (IOException e) {
					e.printStackTrace();
				}
				out.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
