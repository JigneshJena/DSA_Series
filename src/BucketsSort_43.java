import java.util.ArrayList;
import java.util.Collections;

public class BucketsSort_43 {

    static void BucketsSort(float[] arr){
        int n=arr.length;
        //Buckets
        ArrayList<Float>[] buckets=new ArrayList[n];
        // Create empty buckets
        for (int i=0;i<n;i++){
            buckets[i]=new ArrayList<Float>();
        }

        for (int i=0;i<n;i++){
            int bucketsIndex=(int) arr[i]*n;
            buckets[bucketsIndex].add(arr[i]);
        }

        for (int i=0;i<buckets.length;i++){
            Collections.sort(buckets[i]);
        }

        int index=0;
        for (int i=0;i<buckets.length;i++){
            ArrayList<Float> currBucket=buckets[i];
            for (int j=0;j<currBucket.size();j++){
                arr[index++]=currBucket.get(j);
            }
        }

    }

    public static void main(String[] args) {
        float[]  arr={0.3f,0.23f,0.93f,0.43f,0.8f};
        BucketsSort(arr);
        for (float val:arr){
            System.out.print(val+" ");
        }
    }
}
