package top.gaoch.demo;

public class Shell
{
  public static void main(String[] args)
  {
    int[] ins = {2,3,5,1,23,6,78,34,23,4,5,78,34,65,32,65,76,32,76,1,9};
    sort(ins);
    for(int in: ins){
      System.out.println(in);
    }
  }
  /**
   * 希尔排序
   * @param arrays 需要排序的序列
   */
  public static void sort(int[] arrays){
    if(arrays == null || arrays.length <= 1){
      return;
    }
    //增量
    int incrementNum = arrays.length/2;
    while(incrementNum >=1){
      for(int i=0;i<arrays.length;i++){
        //进行插入排序
        for(int j=i;j<arrays.length-incrementNum;j=j+incrementNum){
          if(arrays[j]>arrays[j+incrementNum]){
            int temple = arrays[j];
            arrays[j] = arrays[j+incrementNum];
            arrays[j+incrementNum] = temple;
          }
        }
      }
      //设置新的增量
      incrementNum = incrementNum/2;
    }
  }
}
