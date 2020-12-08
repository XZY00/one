package cn.itcast.demo;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberDemo1 {
    public static void main(String[] args) {
        //创建Random的对象
        Random r = new Random();
        //创建键盘录入对象,接收用户的数字
        Scanner myNumber = new Scanner(System.in);
        //让用户输入游戏次数
        System.out.println("请输入你的游戏次数：");
        int gameTimes = myNumber.nextInt();//游戏次数
        //让用户选择猜测范围
        System.out.println("请输入你猜测范围的起始数字：");
        int GuessStart = myNumber.nextInt();//起始
        System.out.println("请输入你猜测范围的结束数字：");
        int GuessEnd = myNumber.nextInt();//结束
        //给起始值和结束值取模
        int mod = GuessEnd - GuessStart;
        int result = mod + GuessStart;
        //创建用户猜测的数字范围,rNumbers是生成的随机数变量
        int rNumbers = r.nextInt(result);
        //统计猜测次数，设置变量
        int CountGuess = 0;
        while (true){
            if (CountGuess >= 0){
                System.out.println("您共进行了"+CountGuess+"次游戏，剩余次数"+(int)(gameTimes-CountGuess));
                CountGuess ++;
            }
            if (CountGuess >=gameTimes+1){
                System.out.println("游戏结束.");
                break;
            }
            System.out.println("请输入你猜测的数字：(你选择的猜测范围是"+ GuessStart +"到"+GuessEnd+")");
            int myNumbers = myNumber.nextInt();
            if (myNumbers > rNumbers){
                System.out.println("您猜测的数字"+myNumbers+"大了");
            }else if(myNumbers < rNumbers){
                System.out.println("您猜测的数字"+myNumbers+"小了");
            }else {
                System.out.println("恭喜您，猜对了");
                break;
            }
        }
    }
}
