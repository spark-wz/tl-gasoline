package com.unicorn.tlgasoline.scheduled;

import com.unicorn.tlgasoline.service.OilJlService;
import com.unicorn.tlgasoline.service.ShuiluSfyService;
import com.unicorn.tlgasoline.service.TieluSfyService;
import com.unicorn.tlgasoline.service.WatchingService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Mr.MiaoTai
 * @version 1.0
 * @date 2019/11/8 15:43
 */
@EnableScheduling
@Component
@Log
public class SyncScheduledTask {

	@Autowired
	private OilJlService oilJlService;

	@Autowired
	private WatchingService watchingService;

	@Autowired
	private ShuiluSfyService shuiluSfyService;

	@Autowired
	private TieluSfyService tieluSfyService;

	/**
	 *五分钟执行一次数据上报
	 */
	//@Scheduled(cron="0/30 * * * * ?")
	@Scheduled(cron="0 0/5 * * * ?")
	public void SyncScheduledTaskByHistory() {
		oilJlService.syncOilJl();
		shuiluSfyService.syncShuiluSfyList();
		tieluSfyService.syncTieluSfyList();
	}

	/**
	 *10秒执行一次数据上报
	 */
	@Scheduled(cron="0/10 * * * * ?")
	public void SyncScheduledTaskByNow() {
		watchingService.syncWatchingList();
	}
}
