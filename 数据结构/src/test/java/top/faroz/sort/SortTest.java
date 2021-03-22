package top.faroz.sort;

import org.junit.jupiter.api.Test;
import sort.*;
import utils.DataUtil;
import utils.SortUtil;


import java.util.Arrays;

/**
 * @ClassName SortTest
 * @Description 测试所有排序算法
 * @Author FARO_Z
 * @Date 2021/3/10 下午3:09
 * @Version 1.0
 **/
public class SortTest {
    private int[] arr = DataUtil.getRandomData(100, 100);

    @Test
    public void bubbleSortTest() {
        System.out.println(Arrays.toString(arr));
        long start = System.currentTimeMillis();
        int[] res = new BubbleSort().sort(arr);
        long end = System.currentTimeMillis();
        System.out.println("BubbleSort:"+ SortUtil.isSorted(res));
        System.out.println("time required:"+(end-start)+"ms");
    }

    @Test
    public void insertSortTest() {
        System.out.println(Arrays.toString(arr));
        long start = System.currentTimeMillis();
        int[] res = new InsertSort().sort(arr);
        long end = System.currentTimeMillis();
        System.out.println("InsertSort:"+SortUtil.isSorted(res));
        // System.out.println(Arrays.toString(res));
        System.out.println("time required:"+(end-start)+"ms");
    }

    @Test
    public void selectSortTest() {
        System.out.println(Arrays.toString(arr));
        long start = System.currentTimeMillis();
        int[] res = new SelectSort().sort(arr);
        long end = System.currentTimeMillis();
        System.out.println("SelectSort:"+SortUtil.isSorted(res));
        System.out.println("time required:"+(end-start)+"ms");
    }

    @Test
    public void shellSortTest() {
        System.out.println(Arrays.toString(arr));
        long start = System.currentTimeMillis();
        int[] res = new ShellSort().sort(arr);
        long end = System.currentTimeMillis();
        System.out.println("ShellSort:"+SortUtil.isSorted(res));
        System.out.println("time required:"+(end-start)+"ms");
    }

    @Test
    public void mergeSortTest() {
        System.out.println(Arrays.toString(arr));
        long start = System.currentTimeMillis();
        int[] res = new MergeSort().sort(arr);
        long end = System.currentTimeMillis();
        System.out.println("MergeSort:"+SortUtil.isSorted(res));
        System.out.println("time required:"+(end-start)+"ms");
    }


    @Test
    public void QuickSortTest() {
        System.out.println(Arrays.toString(arr));
        long start = System.currentTimeMillis();
        int[] res = new QuickSort().sort(arr,0,arr.length-1);
        System.out.println("QuickSort:"+Arrays.toString(res));
        long end = System.currentTimeMillis();
        System.out.println("QuickSort:"+SortUtil.isSorted(res));
        System.out.println("time required:"+(end-start)+"ms");
    }


}
