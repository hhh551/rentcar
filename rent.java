package rentcars;

import java.util.ArrayList;
import java.util.Scanner;

public class rent {
    public static void main(String[] args) {
        ArrayList<lodebus> list = new ArrayList<>();//创建载客车对象的集合
        ArrayList<truck> list2 = new ArrayList<>();//创建载货车对象的集合
        ArrayList<pickuptruck> list3 = new ArrayList<>();//创建皮卡车对象的集合
        lodebus one = new lodebus(1, "小轿车", 40, 4);//输入载客车新年喜
        lodebus two = new lodebus(2, "面包车", 65, 7);
        lodebus three = new lodebus(3, "大巴车", 180, 20);
        truck four = new truck(4, "低栏车", 30, 1.5);//输入载货车信息
        truck five = new truck(5, "高栏车", 47, 2.5);
        truck six = new truck(6, "厢式车", 80, 4.5);
        pickuptruck seven = new pickuptruck(7, "日式皮卡车", 60, 5, 1);//输入皮卡车信息
        pickuptruck eight = new pickuptruck(8, "美式皮卡车", 60, 2, 3.5);
        list.add(one);  //添加到集合
        list.add(two);
        list.add(three);
        list2.add(four);
        list2.add(five);
        list2.add(six);
        list3.add(seven);
        list3.add(eight);
        System.out.println("请输入1进入租车系统：");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            if (a == 1) {
                System.out.println("您已成功进入租车系统，以下是所有车辆的信息： ");
                for (int i = 0; i < list.size(); i++) {//遍历打印载客车集合
                    lodebus bus = list.get(i);
                    System.out.println("车序号是:" + bus.getNum() + ",  车辆名称是:" + bus.getName() + ",     租车费用是:" + bus.getCost() + ",  最大载人量是:" + bus.getLode());
                }
                for (int i = 0; i < list2.size(); i++) {//遍历打印载货车集合
                    truck tru = list2.get(i);
                    System.out.println("车序号是:" + tru.getNum() + ",  车辆名称是:" + tru.getName() + ",     租车费用是:" + tru.getCost() + ",  最大载货量是:" + tru.getLode());
                }
                for (int i = 0; i < list3.size(); i++) {//遍历打印皮卡车集合
                    pickuptruck pic = list3.get(i);
                    System.out.println("车序号是:" + pic.getNum() + ",  车辆名称是:" + pic.getName() + ",  租车费用是:" + pic.getCost() + ",  最大载人量是:" + pic.getLode1() + ",  最大载货量是:" + pic.getLode2());
                }
                break;
            } else {
                System.out.println("输入错误，请输入1进入租车系统：");
            }
        }
        ArrayList<Integer> list0 = new ArrayList<>();  //创建int集合接收每个车型租车数量
        for (int i = 0; i < 8; i++) {  //用户进行租车数量输入，并判定输入范围大于等于0。判断小数没有找到解决办法，只有提示用户了。
            System.out.println("请输入第" + i + "个序号车型的租车数量");
            System.out.println("不能输入小数，请输入整数：");
            while (true) {
                int b = sc.nextInt();
                if (b > -1) {
                    list0.add(b);
                    break;
                } else {
                    System.out.println("租车数量不能为负数，请重新输入：");
                }
            }
        }
        System.out.println("全部车型已经展示");
        System.out.println("请输入租车天数");
        int c = sc.nextInt();
        System.out.println("一下是您本次租车的信息，请核对：");
        int money = 0;
        int lode1 = 0;
        double lode2 = 0.0;
        int i = 0;
        int j = 0;
        int k = 0;
        int sum = 0;  //统计用户最终的租车信息
        money = list0.get(j) * one.getCost() + list0.get(++j) * two.getCost() + list0.get(++j) * three.getCost() + list0.get(++j) * four.getCost() + list0.get(++j) * five.getCost() + list0.get(++j) * six.getCost() + list0.get(++j) * seven.getCost() + list0.get(++j) * eight.getCost();
        lode1 = list0.get(k) * one.getLode() + list0.get(++k) * two.getLode() + list0.get(++k) * three.getLode() + list0.get(++k) * seven.getLode1() + list0.get(++k) * eight.getLode1();
        lode2 = list0.get(i) * four.getLode() + list0.get(++i) * five.getLode() + list0.get(++i) * six.getLode() + list0.get(i++) * seven.getLode2() + list0.get(++i) * eight.getLode2();
        System.out.println("您需要支付的金额是：" + money + "元");
        System.out.println("您总体租车的最大载人数为：" + lode1 + "人");
        System.out.println("您总体租车的最大载货量为：" + lode2 + "吨");
        System.out.println("您租车的天数为：" + c + "天");
        for (int i1 = 0; i1 < list0.size(); i1++) {
            sum += list0.get(i1);
            System.out.println("您本次租用序号" + i1 + "车型数量为" + list0.get(i1));
        }
        System.out.println("您本次租用车辆总数为" + sum);
        System.out.println("本次租车已完成，请任意输入一个数字并按enter键退出系统：");//结束程序
        sc.next();
        System.out.println("成功退出。");
    }
}
