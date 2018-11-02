package algorithms;

/**
 * Created by wangjinzhao on 2018/10/29
 */
public class TopN {
    // 父节点
    private int parent(int n) {
        return (n - 1) / 2;
    }

    // 左孩子
    private int left(int n) {
        return 2 * n + 1;
    }

    // 右孩子
    private int right(int n) {
        return 2 * n + 2;
    }

    // 构建堆
    public void buildHeap(int n, int[] data) {
        for (int i = 1; i < n; i++) {
            int t = i;
            // 调整堆
            while (t != 0 && data[parent(t)] > data[t]) {
                int temp = data[t];
                data[t] = data[parent(t)];
                data[parent(t)] = temp;
                t = parent(t);
            }
        }
    }

    // 调整data[i]
    private void adjust(int i, int n, int[] data) {
        if (data[i] <= data[0]) {
            return;
        }
        // 置换堆顶
        int temp = data[i];
        data[i] = data[0];
        data[0] = temp;
        // 调整堆顶
        int t = 0;
        while ((left(t) < n && data[t] > data[left(t)])
                || (right(t) < n && data[t] > data[right(t)])) {
            if (right(t) < n && data[right(t)] < data[left(t)]) {
                // 右孩子更小，置换右孩子
                temp = data[t];
                data[t] = data[right(t)];
                data[right(t)] = temp;
                t = right(t);
            } else {
                // 否则置换左孩子
                temp = data[t];
                data[t] = data[left(t)];
                data[left(t)] = temp;
                t = left(t);
            }
        }
    }

    // 寻找topN，该方法改变data，将topN排到最前面
    public void findTopN(int n, int[] data) {
        // 先构建n个数的小顶堆
        buildHeap(n, data);
        // n往后的数进行调整
        for (int i = n; i < data.length; i++) {
            adjust(i, n, data);
        }
    }

    // 打印数组
    public void print(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
