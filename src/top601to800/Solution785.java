package top601to800;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-16 10:23
 **/
public class Solution785 {

    @Test
    public void test785() {
        int[][] graph = {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        System.out.println(isBipartite(graph));
    }

    //0、1、2分别表示未访问、属于集合1、属于集合2
    public int[] visFlag;
    public boolean flag;

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        visFlag = new int[n];
        flag = true;
        bfs(n,graph);
        return flag;
    }

    public void bfs(int n,int[][] graph){
        for (int i = 0; i < n; ++i) {
            if (visFlag[i] == 0) {
                Queue<Integer> queue = new LinkedList<>();
                queue.offer(i);
                visFlag[i] = 1;
                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    int sign = visFlag[node] == 1 ? 2 : 1;
                    for (int neighbor : graph[node]) {
                        if (visFlag[neighbor] == 0) {
                            queue.offer(neighbor);
                            visFlag[neighbor] = sign;
                        } else if (visFlag[neighbor] != sign) {
                            flag = false;
                            return;
                        }
                    }
                }
            }
        }
    }

    public boolean isBipartite1(int[][] graph) {
        int n = graph.length;
        visFlag = new int[n];
        flag = true;
        for (int i = 0; i < n && flag; i++) {
            if (visFlag[i] == 0) {
                dfs(i, 1, graph);
            }
        }
        return flag;
    }

    public void dfs(int node, int sign, int[][] graph) {
        visFlag[node] = sign;
        sign = sign == 1 ? 2 : 1;
        for (int neighbor : graph[node]) {
            if (visFlag[neighbor] == 0) {
                dfs(neighbor,sign,graph);
                if (!flag){
                    return;
                }
            } else if(visFlag[neighbor] != sign){
                flag = false;
                return;
            }
        }
    }


}
