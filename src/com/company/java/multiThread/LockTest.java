package com.company.java.multiThread;

import java.util.concurrent.locks.ReentrantLock;

/**锁测试
 * Created by kriswong on 2019/4/29.
 */
public class LockTest {
        private static ReentrantLock lock = new ReentrantLock();

        public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {
                Thread thread = new Thread() {
                    public void run() {
                        lock.lock();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } finally {
                            lock.unlock();
                        }

                    }
                };
                thread.start();
            }
        }


}
