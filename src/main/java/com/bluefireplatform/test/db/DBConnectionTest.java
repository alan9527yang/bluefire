/*    */ package com.bluefireplatform.test.db;
/*    */ 
/*    */ import com.bluefireplatform.entity.User;
/*    */ import com.bluefireplatform.mapper.UserMapper;
/*    */ import java.io.PrintStream;
/*    */ import org.apache.ibatis.session.SqlSession;
/*    */ import org.apache.ibatis.session.SqlSessionFactory;
/*    */ import org.junit.Before;
/*    */ import org.testng.annotations.Test;
/*    */ import org.springframework.context.ApplicationContext;
/*    */ import org.springframework.context.support.ClassPathXmlApplicationContext;
/*    */ 
/*    */ 
/*    */ public class DBConnectionTest
/*    */ {
/* 16 */   private SqlSession sqlSession = null;
/*    */   private SqlSessionFactory sqlSessionFactory;
/* 18 */   private String resource = "beans.xml";
/*    */   private ApplicationContext context;
/*    */   
/*    */   @Before
/* 22 */   public void setup() { this.context = new ClassPathXmlApplicationContext(this.resource); }
/*    */   
/*    */ 
/*    */ 
/*    */   public SqlSession testConnection()
/*    */   {
/* 28 */     ApplicationContext context = new ClassPathXmlApplicationContext(this.resource);
/* 29 */     this.sqlSessionFactory = ((SqlSessionFactory)context.getBean("sessionFactory"));
/* 30 */     SqlSession sqlSession = this.sqlSessionFactory.openSession();
/* 31 */     return sqlSession;
/*    */   }
/*    */   
/*    */   @Test
/*    */   public void TestSelect2()
/*    */   {
/* 37 */     UserMapper userMapper = (UserMapper)this.context.getBean("userMapper");
/* 38 */     User user1 = new User();
/*    */     
/* 40 */     user1.setUserName("杨一桢");
/* 41 */     user1.setUserAnalysisId(Integer.valueOf(1));
/* 42 */     userMapper.insert(user1);
/* 43 */     System.out.println(user1.getUserName());
/*    */   }
/*    */ }


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatform\test\db\DBConnectionTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */