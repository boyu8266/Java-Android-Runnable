public class Main {

    public static void main(String[] args) {
        Thread you = new Thread(runnable_1);
        you.start();

        Thread yourMate = new Thread(runnable_2);
        yourMate.start();

        //  確認不同人
        System.out.println(you.getName());
        System.out.println(yourMate.getName());
    }

    private static Runnable runnable_1 = new Runnable() {
        @Override
        public void run() {
            //  工作內容
            System.out.println("買便當");
        }
    };

    private static Runnable runnable_2 = new Runnable() {
        @Override
        public void run() {
            //  工作內容
            System.out.println("倒垃圾");
        }
    };

}
