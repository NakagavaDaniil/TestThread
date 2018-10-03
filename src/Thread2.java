public class Thread2 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++)
        {
            try{
                Thread.sleep(1500);		//Приостанавливает поток на 1 секунду
            }catch(InterruptedException e){}

            System.out.println("курица!"+i);
        }
    }
}
