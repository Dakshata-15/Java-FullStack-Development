package com.example.frontbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CalcController {
    @GetMapping("/calc/add/{num1}/{num2}")
    public String add(@PathVariable int num1, @PathVariable int num2){
        int res = num1+num2;
        return "Addition : "+res;
    }
    @GetMapping("calc/sin/{num3}")
    public String sin(@PathVariable double num3){
        return String.format("%.2f",Math.sin(Math.toRadians(num3)));
    }
    @GetMapping("calc/cos/{num4}")
    public String cos(@PathVariable double num4){
        return String.format("%.2f",Math.cos(Math.toRadians(num4)));
    }
    @GetMapping("calc/log/{num5}")
    public String log(@PathVariable double num5){
        return String.format("%.2f",Math.log10(num5));
    }
    @GetMapping("/calc/add1/{a}/{b}")
    public Map<String, Object> add1(@PathVariable int a, @PathVariable int b){
        return Map.of("operation", "addition","result", a+b);
    }
    @GetMapping("/sprialmatrix")
    public List<Integer> spmat(){
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int m=matrix.length;
        int n=matrix[0].length;
        ArrayList<Integer> res=new ArrayList<>();
        boolean[][] vis=new boolean[m][n];
        int[] dr={0,1,0,-1};
        int[] dc={1,0,-1,0};
        int r=0,c=0,idx=0;
        for(int i=0;i<m*n;i++){
            res.add(matrix[r][c]);
            vis[r][c]=true;
            int newR=r+dr[idx];
            int newC=c+dc[idx];

            if(0<=newR && newR<m && 0<=newC && newC<n && !vis[newR][newC]){
                r=newR;
                c=newC;
            }
            else{
                idx=(idx+1)%4;
                r+=dr[idx];
                c+=dc[idx];
            }
        }
        return res;

    }

}
