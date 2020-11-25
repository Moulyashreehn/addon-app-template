package com.riversand.examples.helloworld.util;

/**
 * Config class read the values from Environment variables
 */
public class Config {

    public static final String RDP_URL = System.getenv("manage.rdpengg14.riversand-dataplatform.com");
    public static final String RDP_PORT = System.getenv("8085");
    public static final String REQUEST_FILE_NAME = System.getenv("request.json");
    public static final String TENANT = System.getenv("autoappdev");
    public static final String REQUEST_FILE_PATH = System.getenv("source/java/");
    public static final String SOURCE_CONFIG_PATH = System.getenv("batch/job_defs/helloworld/resource_files/");
    public static final String POD_ID = System.getenv("rdpengg14");
    public static final String TASK_ID = System.getenv("123");
    public static final String RDP_COMPLETE_URL = "http://" + RDP_URL + ":" + RDP_PORT + "/";
}
