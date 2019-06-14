package per.zs.studyGecco2.videoList;

import java.util.List;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.scheduler.SchedulerContext;

@PipelineName("videoListPipeline")
public class VideoListPipeline implements Pipeline<VideoList> {

	@Override
	public void process(VideoList videoList) {
		List<VideoInfo> infoList = videoList.getVideoInfo();
		HttpRequest currentRequest = videoList.getRequest();
		for(VideoInfo info:infoList) {
			String tencentId = info.getTencentId();
			String detailUrl = "https://v.qq.com/detail/j/"+tencentId+".html";
			SchedulerContext.into(currentRequest.subRequest(detailUrl));
		}
		
		int currentPage = videoList.getCurrentPage();
		int nextPage = currentPage + 1;
		if(nextPage <= 5) {
			int offset = (nextPage-1)*30;
			String nextUrl = "https://v.qq.com/x/list/movie?sort=21&offset="+offset;
			SchedulerContext.into(currentRequest.subRequest(nextUrl));
		}
	}

}
