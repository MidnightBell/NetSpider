package per.zs.studyGecco2.utils;

import org.springframework.data.mongodb.core.MongoTemplate;

public class MongoUtil {
	
	static MongoTemplate mongoTemplate;

	public static MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}

	public static void setMongoTemplate(MongoTemplate mongoTemplate) {
		MongoUtil.mongoTemplate = mongoTemplate;
	}
	
}
