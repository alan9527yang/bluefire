/*    */ import com.alibaba.fastjson.JSONObject;
/*    */ import com.bluefireplatform.service.TrajectoryInfoManangeService;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import org.springframework.context.ApplicationContext;
/*    */ import org.springframework.context.support.ClassPathXmlApplicationContext;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Test
/*    */ {
/*    */   public static void main(String[] args)
/*    */     throws Exception
/*    */   {
/* 19 */     Map map = new HashMap();
/*    */     
/* 21 */     map.put("trajectory_id", Integer.valueOf(2));
/*    */     
/* 23 */     JSONObject queryString = new JSONObject(map);
/* 24 */     ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
/* 25 */     TrajectoryInfoManangeService service = (TrajectoryInfoManangeService)context.getBean("trajectoryInfoManangeServiceImpl");
/*    */   }
/*    */ }


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\Test.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */