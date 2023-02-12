package d2_thread_safe;

public class Account {
    private String cardId;
    private double money;

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }
    /**
     * 小明 小红 取钱
     * @param money
     */
    public synchronized void drawMoney(double money) {
        //1、获取是谁来取钱
        String name = Thread.currentThread().getName();
//        synchronized (this){
            //2、判断账户余额
            if (this.money >= money){
                //2、取钱
                System.out.println(name + "取钱成功：" + money);
                //3、更新余额
                this.money -= money;
                System.out.println(name + "取钱后剩余：" + this.money);
            }else {
                //余额不足
                System.out.println(name + "余额不足");
            }
//        }

    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


}