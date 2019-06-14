package per.zs.studyGecco2.videoDetail;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;

import per.zs.studyGecco2.utils.MongoUtil;

@PipelineName("videoDetailPipeline")
public class VideoDetailPipeline implements Pipeline<VideoDetail> {
	
	MongoTemplate mongoTemplate = MongoUtil.getMongoTemplate();
	
	@Override
	public void process(VideoDetail videoDetail) {
		VideoDetailModel details = videoDetail.getVideoDetail();
		
		List<Item> items = details.getItem();
		for(Item item:items) {
			String tit = item.getTit().replace(":", "").replaceAll("　", "");
			item.setTit(tit);
		}
		List<String> actors = details.getActorList();
		actors.remove("");
		details.setActorList(actors);
		mongoTemplate.save(details);
		System.out.println(details);
	}

}
