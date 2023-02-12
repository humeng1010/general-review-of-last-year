package d2_thread_safe;

/**
 * 取钱的线程类
 */
public class DrawThread extends Thread{
    private Account account;
    public DrawThread(Account account,String name){
        super(name);
        this.account = account;
    }
    @Override
    public void run() {
        //取钱
        account.drawMoney(100000);

    }
}