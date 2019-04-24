/*     */ package com.bluefireplatform.service.impl;
/*     */ 
/*     */ import com.alibaba.fastjson.JSONObject;
/*     */ import com.bluefireplatform.aop.UserLog;
/*     */ import com.bluefireplatform.component.ReturnHelper;
/*     */ import com.bluefireplatform.entity.Account;
/*     */ import com.bluefireplatform.entity.AccountExample;
/*     */ import com.bluefireplatform.entity.AccountExample.Criteria;
/*     */ import com.bluefireplatform.mapper.AccountMapper;
/*     */ import com.bluefireplatform.model.UserException;
/*     */ import com.bluefireplatform.service.AccountService;
/*     */ import com.github.pagehelper.Page;
/*     */ import com.github.pagehelper.PageHelper;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.stereotype.Service;
/*     */ import org.springframework.transaction.annotation.Propagation;
/*     */ import org.springframework.transaction.annotation.Transactional;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Service
/*     */ @Transactional(rollbackFor={Exception.class}, propagation=Propagation.REQUIRED)
/*     */ public class AccountServiceImpl
/*     */   implements AccountService
/*     */ {
/*     */   @Autowired
/*     */   private ReturnHelper returnHelper;
/*     */   @Autowired
/*     */   private AccountMapper accountMapper;
/*     */   
/*     */   @UserLog
/*     */   @Transactional(readOnly=true)
/*     */   public Object login(JSONObject queryString)
/*     */   {
/*  41 */     String username = queryString.getString("username");
/*  42 */     String password = queryString.getString("password");
/*  43 */     AccountExample accountExample = new AccountExample();
/*  44 */     accountExample.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
/*  45 */     List<Account> queryList = this.accountMapper.selectByExample(accountExample);
/*  46 */     if (queryList.size() == 0) {
/*  47 */       throw new UserException(Integer.valueOf(4001), "账户名或密码错误");
/*     */     }
/*  49 */     Map map = new HashMap();
/*  50 */     map.put("admin", queryList.get(0));
/*  51 */     return this.returnHelper.returnNau(map, 1000, "服务器正常");
/*     */   }
/*     */   
/*     */ 
/*     */   @UserLog
/*     */   public Object register(JSONObject queryString)
/*     */   {
/*  58 */     String username = queryString.getString("username");
/*  59 */     String password = queryString.getString("password");
/*  60 */     AccountExample accountExample = new AccountExample();
/*  61 */     accountExample.createCriteria().andUsernameEqualTo(username);
/*  62 */     List<Account> queryList = this.accountMapper.selectByExample(accountExample);
/*  63 */     if (queryList.size() != 0) {
/*  64 */       throw new UserException(Integer.valueOf(4002), "用户名已存在");
/*     */     }
/*  66 */     Account account = new Account();
/*  67 */     account.setUsername(username);
/*  68 */     account.setPassword(password);
/*  69 */     this.accountMapper.insertSelective(account);
/*  70 */     return this.returnHelper.returnNau(null, 1000, "服务器正常");
/*     */   }
/*     */   
/*     */   public Object addAccount(JSONObject queryString)
/*     */   {
/*  75 */     String username = queryString.getString("username");
/*  76 */     String password = queryString.getString("password");
/*  77 */     AccountExample accountExample = new AccountExample();
/*  78 */     accountExample.createCriteria().andUsernameEqualTo(username);
/*  79 */     List<Account> queryList = this.accountMapper.selectByExample(accountExample);
/*  80 */     if (queryList.size() != 0) {
/*  81 */       throw new UserException(Integer.valueOf(4002), "用户名已存在");
/*     */     }
/*  83 */     Account account = new Account();
/*  84 */     account.setUsername(username);
/*  85 */     account.setPassword(password);
/*  86 */     this.accountMapper.insertSelective(account);
/*  87 */     return this.returnHelper.returnNau(null, 1000, "服务器正常");
/*     */   }
/*     */   
/*     */   public Object deleteAccount(JSONObject queryString)
/*     */   {
/*  92 */     String username = queryString.getString("username");
/*  93 */     AccountExample accountExample = new AccountExample();
/*  94 */     accountExample.createCriteria().andUsernameEqualTo(username);
/*  95 */     this.accountMapper.deleteByExample(accountExample);
/*  96 */     return this.returnHelper.returnNau(null, 1000, "服务器正常");
/*     */   }
/*     */   
/*     */   public Object updateAccount(JSONObject queryString)
/*     */   {
/* 101 */     String username = queryString.getString("username");
/* 102 */     String password = queryString.getString("password");
/* 103 */     Account account = new Account();
/* 104 */     account.setPassword(password);
/* 105 */     AccountExample accountExample = new AccountExample();
/* 106 */     accountExample.createCriteria().andUsernameEqualTo(username);
/* 107 */     this.accountMapper.updateByExampleSelective(account, accountExample);
/* 108 */     return this.returnHelper.returnNau(null, 1000, "服务器正常");
/*     */   }
/*     */   
/*     */   public Object queryAccount(JSONObject queryString)
/*     */   {
/* 113 */     Integer pageNum = queryString.getInteger("pageNum");
/* 114 */     Integer pageSize = queryString.getInteger("pageSize");
/* 115 */     Page<?> page = PageHelper.startPage(pageNum.intValue(), pageSize.intValue());
/* 116 */     AccountExample accountExample = new AccountExample();
/* 117 */     accountExample.createCriteria().andUsernameNotEqualTo("admin");
/* 118 */     List<Account> list = this.accountMapper.selectByExample(accountExample);
/* 119 */     Map map = new HashMap();
/* 120 */     map.put("list", list);
/* 121 */     map.put("pageNum", Integer.valueOf(page.getPageNum()));
/* 122 */     map.put("allPages", Integer.valueOf(page.getPages()));
/* 123 */     map.put("allCount", Long.valueOf(page.getTotal()));
/* 124 */     return this.returnHelper.returnNau(map, 1000, "服务器正常");
/*     */   }
/*     */ }


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatform\service\impl\AccountServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */