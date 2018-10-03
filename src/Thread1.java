public class Thread1   extends Thread {
    private void count(){

       for (int i =0;i<5;i++){
           try{
               sleep(1000);		//Приостанавливает поток на 1 секунду
           }catch(InterruptedException e){}

           System.out.println("яйцо!"+i);
       }
    }

    @Override
    public void run() {
        Thread thread3 = new Thread(()->{
            for(int i = 0; i < 20; i++)
            {
                try{
                    Thread.sleep(1500);		//Приостанавливает поток на 1 секунду
                }catch(InterruptedException e){}

                System.out.println("none!"+i);
            }
        });

        thread3.setDaemon(true);
        thread3.start();
        count();
    }
}
