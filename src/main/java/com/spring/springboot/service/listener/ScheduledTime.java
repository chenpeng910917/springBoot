package com.spring.springboot.service.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTime {
	private static final Logger Logger = LoggerFactory.getLogger(ScheduledTime.class);
	
	/*@Scheduled(fixedRate=1000*5)//每5秒启动一次
	public void scheduled(){
		Logger.info("定时任务开启");
		System.out.println("定时任务开启");
	}*/
	
	/*@Scheduled(cron = "0/5 * * * * *")//每5秒启动一次
    public void scheduled(){
		Logger.info("=====>>>>>使用cron  {}",System.currentTimeMillis());
    }*/
	
	@Scheduled(cron = "0 56 17 ? * *")//每天17点56触发
    public void scheduled(){
		Logger.info("=====>>>>>使用cron  {}",System.currentTimeMillis());
    }
	/*CRON表达式    含义 
	"0 0 12 * * ?"    每天中午十二点触发 
	"0 15 10 ? * *"    每天早上10：15触发 
	"0 15 10 * * ?"    每天早上10：15触发 
	"0 15 10 * * ? *"    每天早上10：15触发 
	"0 15 10 * * ? 2005"    2005年的每天早上10：15触发 
	"0 * 14 * * ?"    每天从下午2点开始到2点59分每分钟一次触发 
	"0 0/5 14 * * ?"    每天从下午2点开始到2：55分结束每5分钟一次触发 
	"0 0/5 14,18 * * ?"    每天的下午2点至2：55和6点至6点55分两个时间段内每5分钟一次触发 
	"0 0-5 14 * * ?"    每天14:00至14:05每分钟一次触发 
	"0 10,44 14 ? 3 WED"    三月的每周三的14：10和14：44触发 
	"0 15 10 ? * MON-FRI"    每个周一、周二、周三、周四、周五的10：15触发 */

}
