package com.yuyuka.trading.center.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class HealthCheckController {
	@GetMapping("/healthcheck")
	public String healthCheck() {
		return "ok";
	}
}
