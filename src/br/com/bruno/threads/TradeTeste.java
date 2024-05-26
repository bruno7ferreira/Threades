package br.com.bruno.threads;

public class TradeTeste implements Runnable {


    @Override
    public void run() {

        System.out.println(" interface runnable");
    }

    public static void main(String[] args) {

        TradeTeste br1 = new TradeTeste();

        Thread th = new Thread(br1);
        th.start();
    }


}
