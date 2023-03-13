package timus.task_1607;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int finalPrice;
        while(true){
            if (a>=c){
                finalPrice = a;
                break;
            }
            if (a+b>=c){
                finalPrice = c;
                break;
            }else{
                a+=b;
            }

            if (c-d<=a){
                finalPrice = a;
                break;
            }else{
                c-=d;
            }
        }
        System.out.println(finalPrice);
        f.close();
    }
}