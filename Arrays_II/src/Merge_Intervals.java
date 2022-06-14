import java.util.*;

class Interval{
    int start, finish;

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", finish=" + finish +
                '}';
    }
}
class Com implements Comparator<Interval> {
    @Override
    public int compare(Interval i1, Interval i2) {
        if(i1.start<i2.start)
            return -1;
        else if(i1.start>i2.start)
            return 1;
        else if(i1.finish<i2.finish)
            return -1;
        else if(i1.finish>i2.finish)
            return 1;
        return 0;
    }
}
public class Merge_Intervals {
    static List<Interval> merge_intervals(Interval[] in){
        List<Interval> res=new ArrayList<>();
        Arrays.sort(in, new Com());
        int st=in[0].start;
        int en=in[0].finish;
        for(Interval i:in){
            if(i.start<=en){
                en=Math.max(i.finish, en);
            }
            else {
                Interval x=new Interval();
                x.start=st;
                x.finish=en;
                res.add(x);
                st=i.start;
                en=i.finish;
            }
        }
        Interval x=new Interval();
        x.start=st;
        x.finish=en;
        res.add(x);
        return res;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Interval[] intervals=new Interval[n];
        for(int i=0;i<n;i++){
            int st=s.nextInt();
            intervals[i]=new Interval();
            intervals[i].start=st;
        }
        for(int i=0;i<n;i++){
            intervals[i].finish=s.nextInt();
        }
        System.out.println(merge_intervals(intervals));
    }
}
