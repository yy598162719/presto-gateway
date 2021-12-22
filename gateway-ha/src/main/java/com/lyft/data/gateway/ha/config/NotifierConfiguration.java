package com.lyft.data.gateway.ha.config;

import java.util.List;
import lombok.Data;

@Data
public class NotifierConfiguration {
  private boolean startTlsEnabled;
  private boolean smtpAuthEnabled=true;
  private String smtpHost = "smtp.qq.com";
  private int smtpPort = 465;
  private String smtpUser;
  private String smtpPassword="eoufcmeagrohbcij";
  private String sender;
  private List<String> recipients;
}
