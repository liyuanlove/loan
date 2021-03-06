package com.qtt.jinrong.task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author yanxin
 */
public class TaskManager {

    private ExecutorService executors = Executors.newFixedThreadPool(1);

    private final String TAG = "TaskManager";

    private final String[] taskClassNames = {"UploadCallRecordTask"};

    public TaskManager() {

    }

    /**
     * 开启所有的任务
     */
    public void init() {
        //使用反射 就不能混淆包下的类 不然混淆类名被改 找不到类名
        /*for (String name:taskClassNames) {
            try {
                String className = TaskManager.class.getPackage().getName()+"."+name;
                Class<AppTask> mClass = (Class<AppTask>)Class.forName(className);
                AppTask appTask = mClass.newInstance();
                appTask.start();
            }catch (Exception e) {
                LogUtil.d(TAG,"开启任务 "+name+" Exception:"+e.getMessage());
            }
        }*/
        executors.submit(new Runnable() {
            @Override
            public void run() {
                AppTask task = new CleanTask();
                task.start();
            }
        });
    }

}
