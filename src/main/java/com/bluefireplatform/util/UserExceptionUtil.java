/*     */ package com.bluefireplatform.util;
/*     */ 
/*     */ import com.bluefireplatform.model.UserException;
/*     */ import java.io.EOFException;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.sql.SQLException;
/*     */ import java.text.ParseException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class UserExceptionUtil
/*     */ {
/*     */   public static UserException transformException(Exception e)
/*     */   {
/*  17 */     if ((e instanceof NullPointerException))
/*     */     {
/*  19 */       return new UserException(Integer.valueOf(2001), "NullPointerException 空指针引用异常");
/*     */     }
/*     */     
/*  22 */     if ((e instanceof ClassCastException))
/*     */     {
/*  24 */       return new UserException(Integer.valueOf(2002), "ClassCastException 类型强制转换异常");
/*     */     }
/*     */     
/*  27 */     if ((e instanceof IllegalArgumentException))
/*     */     {
/*  29 */       return new UserException(Integer.valueOf(2003), "IllegalArgumentException 传递非法参数异常");
/*     */     }
/*     */     
/*  32 */     if ((e instanceof ArithmeticException))
/*     */     {
/*  34 */       return new UserException(Integer.valueOf(2004), "ArithmeticException 算术运算异常");
/*     */     }
/*     */     
/*  37 */     if ((e instanceof IndexOutOfBoundsException))
/*     */     {
/*  39 */       return new UserException(Integer.valueOf(2005), "IndexOutOfBoundsException 下标越界异常");
/*     */     }
/*     */     
/*  42 */     if ((e instanceof ArrayIndexOutOfBoundsException))
/*     */     {
/*  44 */       return new UserException(Integer.valueOf(2006), "ArrayIndexOutOfBoundsException 数组下标越界异常");
/*     */     }
/*     */     
/*  47 */     if ((e instanceof SecurityException))
/*     */     {
/*  49 */       return new UserException(Integer.valueOf(2007), " SecurityException 数组下标越界异常");
/*     */     }
/*     */     
/*  52 */     if ((e instanceof EOFException))
/*     */     {
/*  54 */       return new UserException(Integer.valueOf(2008), "EOFException 文件已结束异常");
/*     */     }
/*     */     
/*  57 */     if ((e instanceof FileNotFoundException))
/*     */     {
/*  59 */       return new UserException(Integer.valueOf(2009), "FileNotFoundException 文件未找到异常");
/*     */     }
/*     */     
/*  62 */     if ((e instanceof NumberFormatException))
/*     */     {
/*  64 */       return new UserException(Integer.valueOf(2010), "NumberFormatException 字符串转换为数字异常");
/*     */     }
/*     */     
/*  67 */     if ((e instanceof SQLException))
/*     */     {
/*  69 */       return new UserException(Integer.valueOf(3001), "SQLException 操作数据库异常");
/*     */     }
/*     */     
/*  72 */     if ((e instanceof IOException))
/*     */     {
/*  74 */       return new UserException(Integer.valueOf(3002), "IOException 输入输出异常");
/*     */     }
/*     */     
/*  77 */     if ((e instanceof ParseException))
/*     */     {
/*  79 */       return new UserException(Integer.valueOf(3003), "ParseException 解析时间异常");
/*     */     }
/*     */     
/*  82 */     if ((e instanceof ArithmeticException))
/*     */     {
/*  84 */       return new UserException(Integer.valueOf(3004), "ArithmeticException 算术条件异常");
/*     */     }
/*     */     
/*  87 */     if ((e instanceof ArrayIndexOutOfBoundsException))
/*     */     {
/*  89 */       return new UserException(Integer.valueOf(3005), "ArrayIndexOutOfBoundsException 数组索引越界异常");
/*     */     }
/*     */     
/*  92 */     if ((e instanceof ArrayStoreException))
/*     */     {
/*  94 */       return new UserException(Integer.valueOf(3006), "ArrayStoreException 数组存储异常");
/*     */     }
/*     */     
/*  97 */     if ((e instanceof ClassCastException))
/*     */     {
/*  99 */       return new UserException(Integer.valueOf(3007), "ClassCastException 类造型异常");
/*     */     }
/*     */     
/* 102 */     if ((e instanceof CloneNotSupportedException))
/*     */     {
/* 104 */       return new UserException(Integer.valueOf(3008), "CloneNotSupportedException 不支持克隆异常");
/*     */     }
/*     */     
/* 107 */     if ((e instanceof EnumConstantNotPresentException))
/*     */     {
/* 109 */       return new UserException(Integer.valueOf(3009), "EnumConstantNotPresentException 枚举常量不存在异常");
/*     */     }
/*     */     
/* 112 */     if ((e instanceof IllegalAccessException))
/*     */     {
/* 114 */       return new UserException(Integer.valueOf(3010), "IllegalAccessException 违法的访问异常");
/*     */     }
/*     */     
/* 117 */     if ((e instanceof IllegalMonitorStateException))
/*     */     {
/* 119 */       return new UserException(Integer.valueOf(3011), "IllegalMonitorStateException 违法的访问异常");
/*     */     }
/*     */     
/* 122 */     if ((e instanceof IllegalStateException))
/*     */     {
/* 124 */       return new UserException(Integer.valueOf(3012), "IllegalStateException 违法的状态异常");
/*     */     }
/*     */     
/* 127 */     if ((e instanceof IllegalThreadStateException))
/*     */     {
/* 129 */       return new UserException(Integer.valueOf(3013), "IllegalThreadStateException 违法的线程状态异常");
/*     */     }
/*     */     
/* 132 */     if ((e instanceof IndexOutOfBoundsException))
/*     */     {
/* 134 */       return new UserException(Integer.valueOf(3014), "IIndexOutOfBoundsException 索引越界异常");
/*     */     }
/*     */     
/* 137 */     if ((e instanceof InstantiationException))
/*     */     {
/* 139 */       return new UserException(Integer.valueOf(3015), "InstantiationException 实例化异常");
/*     */     }
/*     */     
/* 142 */     if ((e instanceof InterruptedException))
/*     */     {
/* 144 */       return new UserException(Integer.valueOf(3016), "InterruptedException 线程被中止异常");
/*     */     }
/*     */     
/* 147 */     if ((e instanceof NegativeArraySizeException))
/*     */     {
/* 149 */       return new UserException(Integer.valueOf(3017), "NegativeArraySizeException 数组大小为负值异常");
/*     */     }
/*     */     
/* 152 */     if ((e instanceof NoSuchFieldException))
/*     */     {
/* 154 */       return new UserException(Integer.valueOf(3018), "NoSuchFieldException 属性不存在异常");
/*     */     }
/*     */     
/* 157 */     if ((e instanceof NoSuchMethodException))
/*     */     {
/* 159 */       return new UserException(Integer.valueOf(3019), "NoSuchMethodException 方法不存在异常");
/*     */     }
/*     */     
/* 162 */     if ((e instanceof NumberFormatException))
/*     */     {
/* 164 */       return new UserException(Integer.valueOf(3020), "NumberFormatException 数字格式异常");
/*     */     }
/*     */     
/* 167 */     if ((e instanceof StringIndexOutOfBoundsException))
/*     */     {
/* 169 */       return new UserException(Integer.valueOf(3021), "StringIndexOutOfBoundsException 字符串索引越界异常");
/*     */     }
/*     */     
/* 172 */     if ((e instanceof TypeNotPresentException))
/*     */     {
/* 174 */       return new UserException(Integer.valueOf(3022), "TypeNotPresentException 类型不存在异常");
/*     */     }
/*     */     
/* 177 */     if ((e instanceof UnsupportedOperationException))
/*     */     {
/* 179 */       return new UserException(Integer.valueOf(3023), "UnsupportedOperationException 不支持的方法异常");
/*     */     }
/*     */     
/* 182 */     if ((e instanceof UserException))
/*     */     {
/* 184 */       return new UserException(((UserException)e).getCode(), e.getMessage());
/*     */     }
/*     */     
/* 187 */     return new UserException(Integer.valueOf(5000), e.getClass().getName());
/*     */   }
/*     */ }


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatfor\\util\UserExceptionUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */